package ch.giuntini.netjlo_default.commections.server.multiple;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_default.commections.server.sockets.DefaultServerSocket;
import ch.giuntini.netjlo_demanding.connections.server.multiple.DemandingMultipleServerConnection;

public class DefaultDemandingMultipleServerConnection<I extends Interpretable<BasePackage>>
        extends DemandingMultipleServerConnection<DefaultServerSocket, BaseSocket, BasePackage, I> {

    protected DefaultDemandingMultipleServerConnection(DefaultServerSocket serverSocket, Class<I> interpreterC) {
        super(serverSocket, DefaultServerSocket.class, BaseSocket.class, BasePackage.class, interpreterC);
    }
}
