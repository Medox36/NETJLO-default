package ch.giuntini.netjlo_default.threads;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_core.threads.ReceiverThread;
import ch.giuntini.netjlo_default.commections.client.DefaultConnection;

public class DefaultReceiverThread
        <I extends Interpretable<BasePackage>> extends ReceiverThread<BaseSocket, BasePackage, I> {

    public DefaultReceiverThread(DefaultConnection<I> connection, BaseSocket socket, Class<I> interpreterC) {
        super(connection, socket, interpreterC, BasePackage.class);
        setName("Default-Receiver-Thread");
    }
}
