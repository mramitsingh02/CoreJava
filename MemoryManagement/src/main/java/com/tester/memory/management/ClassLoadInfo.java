package com.tester.memory.management;

import java.util.concurrent.atomic.AtomicLong;

public class ClassLoadInfo {

    private AtomicLong totalLoadedClassCount;
    private AtomicLong unloadedClassCount;
    private AtomicLong loadedClassCount;

    public ClassLoadInfo(long totalLoadedClassCount, long unloadedClassCount, long loadedClassCount) {
        if (this.totalLoadedClassCount == null) {
            this.totalLoadedClassCount = new AtomicLong(totalLoadedClassCount);
        } else {
            this.totalLoadedClassCount.compareAndSet(this.totalLoadedClassCount.get(), totalLoadedClassCount);
        }
        if (this.loadedClassCount == null) {
            this.loadedClassCount = new AtomicLong(loadedClassCount);
        } else {
            this.loadedClassCount.compareAndSet(this.loadedClassCount.get(), loadedClassCount);
        }
        if (this.unloadedClassCount == null) {
            this.unloadedClassCount = new AtomicLong(unloadedClassCount);
        } else {
            this.unloadedClassCount.compareAndSet(this.unloadedClassCount.get(), unloadedClassCount);
        }
    }

    @Override
    public String toString() {
        return "ClassLoadInfo{" +
                "totalLoadedClassCount=" + totalLoadedClassCount +
                ", unloadedClassCount=" + unloadedClassCount +
                ", loadedClassCount=" + loadedClassCount +
                '}';
    }
}
