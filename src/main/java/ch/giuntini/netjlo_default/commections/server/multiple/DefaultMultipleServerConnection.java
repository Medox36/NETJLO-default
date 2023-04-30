package ch.giuntini.netjlo_default.commections.server.multiple;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.connections.server.multiple.MultipleServerConnection;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_default.commections.server.sockets.DefaultServerSocket;

public class DefaultMultipleServerConnection<I extends Interpretable<BasePackage>>
        extends MultipleServerConnection<DefaultServerSocket, BaseSocket, BasePackage, I> {

    protected DefaultMultipleServerConnection(DefaultServerSocket serverSocket, Class<I> interpreterC) {
        super(serverSocket, DefaultServerSocket.class, BaseSocket.class, BasePackage.class, interpreterC);
    }
}
