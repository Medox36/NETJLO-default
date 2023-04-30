package ch.giuntini.netjlo_default.streams;

import ch.giuntini.netjlo_base.packages.BasePackage;
import ch.giuntini.netjlo_core.streams.PackageObjectInputStream;

import java.io.IOException;
import java.io.InputStream;

public class DefaultPackageObjectInputStream extends PackageObjectInputStream<BasePackage> {

    public DefaultPackageObjectInputStream(InputStream in) throws IOException {
        super(in, BasePackage.class);
    }
}
