package ch.giuntini.netjlo_default.threads;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_core.threads.SenderThread;
import ch.giuntini.netjlo_default.commections.client.DefaultConnection;

public class DefaultSenderThread<I extends Interpretable<BasePackage>>
        extends SenderThread<BaseSocket, BasePackage, I> {

    public DefaultSenderThread(DefaultConnection<I> connection, BaseSocket socket) {
        super(connection, socket);
        setName("Default-Sender-Thread");
    }
}
