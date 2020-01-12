package com.tester.memory.management;

import java.io.PrintStream;
import java.lang.management.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MainTestClass {
    public static void main(String[] args) {
        //        .map(MemoryPoolMXBean::getCollectionUsage).mapToLong(MemoryUsage::getUsed)
//        getMemoryName();
        //getClassLoading();
        //getOperatingSystem();
        //getRuntime();
        //getThreadInfo();
        getMemoryLoad();
    }

    private static void getMemoryLoad() {

        ThreadMXBean tb = ManagementFactory.getThreadMXBean();
        PrintStream out = System.out;
        out.printf("Current thread count: %d%n", tb.getThreadCount());
        out.printf("Peak thread count: %d%n", tb.getPeakThreadCount());




        List<MemoryPoolMXBean> pools = ManagementFactory.getMemoryPoolMXBeans().stream().filter(x -> MemoryType.HEAP.equals(x.getType())).collect(Collectors.toList());
        for (MemoryPoolMXBean pool : pools) {
            MemoryUsage peak = pool.getPeakUsage();
            out.printf("%s %s\n", pool.getName(), peak.toString());
//            out.printf("Peak %s memory init: %,d%n", pool.getName(), peak.getInit());
//            out.printf("Peak %s memory Max: %,d%n", pool.getName(), peak.getMax());
//            out.printf("Peak %s memory used: %,d%n", pool.getName(), peak.getUsed());
//            out.printf("Peak %s memory reserved: %,d%n", pool.getName(), peak.getCommitted());
        }

    }

    private static void getMemoryName() {
        ManagementFactory.getMemoryPoolMXBeans().stream().filter(x -> x.getUsage().getInit() > 10).forEach(System.out::println);


        ManagementFactory.getMemoryPoolMXBeans().stream()
                //.filter(x -> x.getName().contains("Old"))
                .map(MemoryPoolMXBean::getMemoryManagerNames)
                .map(Arrays::toString)
                //.map(x -> x.getName())
                .forEach(System.out::println);
    }

    private static void getThreadInfo() {
        System.out.println("======================================");
        System.out.println(ManagementFactory.getThreadMXBean().getThreadCount());
        Arrays.stream(ManagementFactory.getThreadMXBean().getAllThreadIds()).forEach(System.out::println);
        Arrays.stream(ManagementFactory.getThreadMXBean().getAllThreadIds())
                .mapToObj(value -> ManagementFactory.getThreadMXBean().getThreadInfo(value).getThreadName())
                .forEach(System.out::println);
    }

    private static void getRuntime() {
        System.out.println("======================================");
        System.out.println(ManagementFactory.getRuntimeMXBean().getName());
        System.out.println(new Date(ManagementFactory.getRuntimeMXBean().getStartTime()));
    }

    private static void getOperatingSystem() {
        System.out.println("======================================");
        System.out.println(ManagementFactory.getOperatingSystemMXBean().getAvailableProcessors());
        System.out.println(ManagementFactory.getOperatingSystemMXBean().getSystemLoadAverage());
        System.out.println(ManagementFactory.getOperatingSystemMXBean().getName());
        System.out.println(ManagementFactory.getOperatingSystemMXBean().getArch());
        System.out.println(ManagementFactory.getOperatingSystemMXBean().getVersion());
        System.out.println(ManagementFactory.getOperatingSystemMXBean().getObjectName().getCanonicalName());
    }

    private static void getClassLoading() {
        System.out.println("======================================");
        System.out.println(ManagementFactory.getClassLoadingMXBean().getTotalLoadedClassCount());
        System.out.println(ManagementFactory.getClassLoadingMXBean().getUnloadedClassCount());
        System.out.println(ManagementFactory.getClassLoadingMXBean().getLoadedClassCount());
        System.out.println(ManagementFactory.getClassLoadingMXBean().isVerbose());
    }

}
