package ch.giuntini.netjlo_default.threads;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_base.threads.ThreadCommons;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_default.commections.client.DefaultConnection;

import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DefaultDemandingReceiverThread<I extends Interpretable<BasePackage>> extends DefaultReceiverThread<I> {

    private final ConcurrentLinkedQueue<BasePackage> packages;
    private final DefaultDemandingInterpreterThread<I> interpreterThread;

    public DefaultDemandingReceiverThread(DefaultConnection<I> connection, BaseSocket socket, Class<I> interpreterC) {
        super(connection, socket, interpreterC);
        packages = new ConcurrentLinkedQueue<>();
        interpreterThread = new DefaultDemandingInterpreterThread<>(packages, interpreter);
    }

    @Override
    public void run() {
        interpreterThread.start();
        while (!stop) {
            try {
                BasePackage p = (BasePackage) objectInputStream.readObject();
                packages.add(p);

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                break;
            }
            Thread.onSpinWait();
        }
        ThreadCommons.onExitIn(socket, objectInputStream, connection, stop);
        interpreterThread.close();
    }
}
