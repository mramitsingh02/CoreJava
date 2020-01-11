package com.tester.memory.management;

import java.util.Objects;

public class OperatingSystemInfo {
    private long availableProcessors;
    private double systemLoadAverage;
    private String name;
    private String version;
    private String arch;

    public OperatingSystemInfo(long availableProcessors, double systemLoadAverage, String name, String version, String arch) {
        this.availableProcessors = availableProcessors;
        this.systemLoadAverage = systemLoadAverage;
        this.name = name;
        this.version = version;
        this.arch = arch;
    }

    public long getAvailableProcessors() {
        return availableProcessors;
    }

    public void setAvailableProcessors(long availableProcessors) {
        this.availableProcessors = availableProcessors;
    }

    public double getSystemLoadAverage() {
        return systemLoadAverage;
    }

    public void setSystemLoadAverage(double systemLoadAverage) {
        this.systemLoadAverage = systemLoadAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperatingSystemInfo that = (OperatingSystemInfo) o;
        return availableProcessors == that.availableProcessors &&
                Double.compare(that.systemLoadAverage, systemLoadAverage) == 0 &&
                name.equals(that.name) &&
                version.equals(that.version) &&
                arch.equals(that.arch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableProcessors, systemLoadAverage, name, version, arch);
    }

    @Override
    public String toString() {
        return "OperatingSystemInfo{" +
                "availableProcessors=" + availableProcessors +
                ", systemLoadAverage=" + systemLoadAverage +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", arch='" + arch + '\'' +
                '}';
    }
}
