package ch.giuntini.netjlo_default.commections.server.multiple;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_default.commections.server.sockets.DefaultServerSocket;
import ch.giuntini.netjlo_demanding.connections.server.multiple.DemandingActiveServerConnection;

public class DefaultDemandingActiveServerConnection<I extends Interpretable<BasePackage>>
        extends DemandingActiveServerConnection<DefaultServerSocket, BaseSocket, BasePackage, I> {

    protected DefaultDemandingActiveServerConnection(
            BaseSocket socket,
            Class<I> interpreterC,
            DefaultDemandingMultipleServerConnection<I> parent
    ) {
        super(socket, interpreterC, BasePackage.class, parent);
    }
}
