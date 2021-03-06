package com.tester.memory.management;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryType;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class MemoryAnalyzerRunner implements Runnable {
    private MemoryAnalyzerConfig config;

    public MemoryAnalyzerRunner(MemoryAnalyzerConfig config) {
        this.config = config;
    }

    @Override
    public void run() {
        for (; ; ) {
            config.setClassLoadInfo(getClassLoadInfo());
            config.setOperatingSystemInfo(getOperatingSystemInfo());
            config.setSystemThreadInfo(getSystemThreadInfo());
            System.out.println(config);
            sleep();
        }
    }

    private SystemThreadInfo getSystemThreadInfo() {
        return new SystemThreadInfo(ManagementFactory.getMemoryPoolMXBeans().stream().filter(x -> MemoryType.HEAP.equals(x.getType())).collect(Collectors.toList()));
    }

    private void sleep() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private ClassLoadInfo getClassLoadInfo() {
        return new ClassLoadInfo(ManagementFactory.getClassLoadingMXBean().getTotalLoadedClassCount(), ManagementFactory.getClassLoadingMXBean().getUnloadedClassCount(), ManagementFactory.getClassLoadingMXBean().getLoadedClassCount());
    }

    private OperatingSystemInfo getOperatingSystemInfo() {
        return new OperatingSystemInfoBuilder()
                .setArch(ManagementFactory.getOperatingSystemMXBean().getArch())
                .setAvailableProcessors(ManagementFactory.getOperatingSystemMXBean().getAvailableProcessors())
                .setName(ManagementFactory.getOperatingSystemMXBean().getName())
                .setVersion(ManagementFactory.getOperatingSystemMXBean().getVersion())
                .setSystemLoadAverage(ManagementFactory.getOperatingSystemMXBean().getSystemLoadAverage())
                .newBuilder();
    }
}
