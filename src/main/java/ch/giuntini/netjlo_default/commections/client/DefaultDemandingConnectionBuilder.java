package ch.giuntini.netjlo_default.commections.client;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_demanding.connections.client.DemandingConnectionBuilder;

public class DefaultDemandingConnectionBuilder<I extends Interpretable<BasePackage>>
        extends DemandingConnectionBuilder<BaseSocket, BasePackage, I> {

    public DefaultDemandingConnectionBuilder() {
        super.socket(BaseSocket.class);
        super.pack(BasePackage.class);
    }
}
