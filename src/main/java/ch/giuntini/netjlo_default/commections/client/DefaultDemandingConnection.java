package ch.giuntini.netjlo_default.commections.client;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_demanding.connections.client.DemandingConnection;

public class DefaultDemandingConnection<I extends Interpretable<BasePackage>>
        extends DemandingConnection<BaseSocket, BasePackage, I> {

    private DefaultDemandingConnection() {
    }

    public DefaultDemandingConnection(BaseSocket socket, Class<I> interpreterC) {
        super(socket, interpreterC, BasePackage.class);
    }
}
