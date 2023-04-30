package ch.giuntini.netjlo_default.commections.server.single;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_default.commections.server.sockets.DefaultServerSocket;
import ch.giuntini.netjlo_demanding.connections.server.single.DemandingServerConnection;

public class DefaultDemandingServerConnection<I extends Interpretable<BasePackage>>
        extends DemandingServerConnection<DefaultServerSocket, BaseSocket, BasePackage, I> {

    public DefaultDemandingServerConnection(DefaultServerSocket serverSocket, Class<I> interpreterC) {
        super(serverSocket, interpreterC, BasePackage.class);
    }
}
