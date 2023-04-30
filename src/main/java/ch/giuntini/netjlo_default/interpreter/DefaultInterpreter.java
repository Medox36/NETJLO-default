package ch.giuntini.netjlo_default.interpreter;

import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_base.interpreter.Interpretable;

public class DefaultInterpreter implements Interpretable<BasePackage> {

    @Override
    public void interpret(BasePackage p) {
        System.out.println(p.information);
    }
}
