package ch.giuntini.netjlo_default.commections.server.single;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_default.commections.server.sockets.DefaultServerSocket;
import ch.giuntini.netjlo_demanding.connections.server.single.DemandingServerConnectionBuilder;

public class DefaultDemandingServerConnectionBuilder<I extends Interpretable<BasePackage>>
        extends DemandingServerConnectionBuilder<DefaultServerSocket, BaseSocket, BasePackage, I> {

    public DefaultDemandingServerConnectionBuilder() {
        super.serverSocket(DefaultServerSocket.class);
        super.socket(BaseSocket.class);
        super.pack(BasePackage.class);
    }
}
