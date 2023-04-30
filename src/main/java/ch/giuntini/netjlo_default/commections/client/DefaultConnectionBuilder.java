package ch.giuntini.netjlo_default.commections.client;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.connections.client.ConnectionBuilder;
import ch.giuntini.netjlo_core.interpreter.Interpretable;

public class DefaultConnectionBuilder<I extends Interpretable<BasePackage>>
        extends ConnectionBuilder<BaseSocket, BasePackage, I> {

    public DefaultConnectionBuilder() {
        super.socket(BaseSocket.class);
        super.pack(BasePackage.class);
    }
}
