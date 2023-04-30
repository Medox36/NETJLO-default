package ch.giuntini.netjlo_default.commections.server.multiple;

import ch.giuntini.netjlo_base.connections.client.sockets.BaseSocket;
import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.connections.server.multiple.ActiveServerConnection;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_default.commections.server.sockets.DefaultServerSocket;

public class DefaultActiveServerConnection<I extends Interpretable<BasePackage>>
        extends ActiveServerConnection<DefaultServerSocket, BaseSocket, BasePackage, I> {

    protected DefaultActiveServerConnection(
            BaseSocket socket,
            Class<I> interpreterC,
            DefaultMultipleServerConnection<I> parent
    ) {
        super(socket, interpreterC, BasePackage.class, parent);
    }
}
