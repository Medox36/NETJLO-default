package ch.giuntini.netjlo_default.commections.client;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.connections.client.Connection;
import ch.giuntini.netjlo_core.interpreter.Interpretable;

public class DefaultConnection <I extends Interpretable<BasePackage>> extends Connection<BaseSocket, BasePackage, I> {

    private DefaultConnection() {
    }

    public DefaultConnection(BaseSocket socket, Class<I> interpreterC) {
        super(socket, interpreterC, BasePackage.class);
    }
}
