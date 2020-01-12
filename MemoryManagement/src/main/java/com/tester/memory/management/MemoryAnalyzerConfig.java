package com.tester.memory.management;

import java.util.concurrent.atomic.AtomicReference;

public class MemoryAnalyzerConfig {

    private AtomicReference<OperatingSystemInfo> operatingSystemInfo;
    private AtomicReference<ClassLoadInfo> classLoadInfo;
    private AtomicReference<SystemThreadInfo> systemThreadInfo;


    public SystemThreadInfo getSystemThreadInfo() {
        return systemThreadInfo.get();
    }

    public void setSystemThreadInfo(SystemThreadInfo systemThreadInfo) {
        if (this.systemThreadInfo == null) {
            this.systemThreadInfo = new AtomicReference<>(systemThreadInfo);
        } else {
            this.systemThreadInfo.compareAndSet(getSystemThreadInfo(), systemThreadInfo);
        }
    }

    public ClassLoadInfo getClassLoadInfo() {
        return classLoadInfo.get();
    }

    public void setClassLoadInfo(ClassLoadInfo classLoadInfo) {
        if (this.classLoadInfo == null) {
            this.classLoadInfo = new AtomicReference<>(classLoadInfo);
        } else {
            this.classLoadInfo.compareAndSet(getClassLoadInfo(), classLoadInfo);
        }
    }

    public OperatingSystemInfo getOperatingSystemInfo() {
        return operatingSystemInfo.get();
    }

    public void setOperatingSystemInfo(OperatingSystemInfo operatingSystemInfo) {
        if (this.operatingSystemInfo == null) {
            this.operatingSystemInfo = new AtomicReference<>(operatingSystemInfo);
        } else {
            this.operatingSystemInfo.compareAndSet(getOperatingSystemInfo(), operatingSystemInfo);
        }
    }

    @Override
    public String toString() {
        return "<========MemoryAnalyzerConfig========>" +
                "\n{" +
                "\n" + operatingSystemInfo +
                ",\n" + classLoadInfo +
                ",\n" + systemThreadInfo +
                "\n}";
    }
}
