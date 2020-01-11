package com.tester.memory.management;

public class OperatingSystemInfoBuilder {
    private long availableProcessors;
    private double systemLoadAverage;
    private String name;
    private String version;
    private String arch;

    public OperatingSystemInfoBuilder setAvailableProcessors(long availableProcessors) {
        this.availableProcessors = availableProcessors;
        return this;
    }

    public OperatingSystemInfoBuilder setSystemLoadAverage(double systemLoadAverage) {
        this.systemLoadAverage = systemLoadAverage;
        return this;
    }

    public OperatingSystemInfoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public OperatingSystemInfoBuilder setVersion(String version) {
        this.version = version;
        return this;
    }

    public OperatingSystemInfoBuilder setArch(String arch) {
        this.arch = arch;
        return this;
    }

    public OperatingSystemInfo newBuilder() {
        return new OperatingSystemInfo(availableProcessors, systemLoadAverage, name, version, arch);
    }
}