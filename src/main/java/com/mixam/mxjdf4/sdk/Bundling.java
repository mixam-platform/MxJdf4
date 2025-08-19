package com.mixam.mxjdf4.sdk;

public class Bundling {
    private BundlingType type;
    private int bundleSize;

    public BundlingType getType() {
        return type;
    }

    public Bundling setType(BundlingType type) {
        this.type = type;
        return this;
    }

    public int getBundleSize() {
        return bundleSize;
    }

    public Bundling setBundleSize(int bundleSize) {
        this.bundleSize = bundleSize;
        return this;
    }
}
