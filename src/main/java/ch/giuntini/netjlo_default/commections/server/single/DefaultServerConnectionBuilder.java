package ch.giuntini.netjlo_default.commections.server.single;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.connections.server.single.ServerConnectionBuilder;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_default.commections.server.sockets.DefaultServerSocket;

public class DefaultServerConnectionBuilder<I extends Interpretable<BasePackage>>
        extends ServerConnectionBuilder<DefaultServerSocket, BaseSocket, BasePackage, I> {

    public DefaultServerConnectionBuilder() {
        super.serverSocket(DefaultServerSocket.class);
        super.socket(BaseSocket.class);
        super.pack(BasePackage.class);
    }
}
