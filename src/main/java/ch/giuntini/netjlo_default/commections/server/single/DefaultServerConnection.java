package ch.giuntini.netjlo_default.commections.server.single;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.connections.server.single.ServerConnection;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_default.commections.server.sockets.DefaultServerSocket;

public class DefaultServerConnection<I extends Interpretable<BasePackage>>
        extends ServerConnection<DefaultServerSocket, BaseSocket, BasePackage, I> {

    public DefaultServerConnection(DefaultServerSocket serverSocket, Class<I> interpreterC) {
        super(serverSocket, interpreterC, BasePackage.class);
    }
}
