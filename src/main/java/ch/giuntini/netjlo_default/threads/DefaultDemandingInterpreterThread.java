package ch.giuntini.netjlo_default.threads;

import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.interpreter.Interpretable;
import ch.giuntini.netjlo_demanding.threads.DemandingInterpreterThread;

import java.util.concurrent.ConcurrentLinkedQueue;

public class DefaultDemandingInterpreterThread<I extends Interpretable<BasePackage>>
        extends DemandingInterpreterThread<BasePackage, I> {

    public DefaultDemandingInterpreterThread(ConcurrentLinkedQueue<BasePackage> packages, I interpreter) {
        super(packages, interpreter);
        setName("Default-Interpreter-Thread");
    }
}
