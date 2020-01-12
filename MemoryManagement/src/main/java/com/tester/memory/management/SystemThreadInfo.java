package com.tester.memory.management;

import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class SystemThreadInfo {
    private final Optional<List<MemoryPoolMXBean>> pools;


    private AtomicReference<MemoryPoolMXBean> edenSpace;
    private AtomicReference<MemoryPoolMXBean> oldGenSpace;
    private AtomicReference<MemoryPoolMXBean> survivorSpace;


    public SystemThreadInfo(List<MemoryPoolMXBean> pools) {
        this.pools = Optional.ofNullable(pools);
       // pools = ManagementFactory.getMemoryPoolMXBeans().stream().filter(x -> MemoryType.HEAP.equals(x.getType())).collect(Collectors.toList());


        MemoryPoolMXBean eden = pools.stream().filter(x -> x.getName().contains("Eden Space")).findFirst().get();
        MemoryPoolMXBean oldGen = pools.stream().filter(x -> x.getName().contains("Old Gen")).findFirst().get();
        MemoryPoolMXBean survivorSpace = pools.stream().filter(x -> x.getName().contains("Survivor Space")).findFirst().get();
        setEdenSpace(eden);
        setOldGenSpace(oldGen);
        setSurvivorSpace(survivorSpace);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();

        StringBuilder eden = new StringBuilder();
        MemoryUsage peak = edenSpace.get().getPeakUsage();
        eden.append(String.format("%s %s\n", edenSpace.get().getName(), peak.toString()));

        StringBuilder oldGen = new StringBuilder();
        peak = oldGenSpace.get().getPeakUsage();
        oldGen.append(String.format("%s %s\n", oldGenSpace.get().getName(), peak.toString()));

        StringBuilder survivor = new StringBuilder();
        peak = survivorSpace.get().getPeakUsage();
        survivor.append(String.format("%s %s\n", survivorSpace.get().getName(), peak.toString()));

        out.append("SystemThreadInfo\n{\n")
                .append("edenSpace=")
                .append(eden)
                .append("oldGenSpace=")
                .append(oldGen)
                .append("survivorSpace=")
                .append(survivor).append("}");
        return out.toString();
    }

    private void setOldGenSpace(MemoryPoolMXBean oldGen) {
        if (oldGenSpace == null) {
            oldGenSpace = new AtomicReference<>(oldGen);
        } else {
            oldGenSpace.compareAndSet(oldGenSpace.get(), oldGen);
        }
    }

    private void setSurvivorSpace(MemoryPoolMXBean survivorSpace) {
        if (this.survivorSpace == null) {
            this.survivorSpace = new AtomicReference<>(survivorSpace);
        } else {
            this.survivorSpace.compareAndSet(this.survivorSpace.get(), survivorSpace);
        }
    }

    private void setEdenSpace(MemoryPoolMXBean eden) {
        if (edenSpace == null) {
            edenSpace = new AtomicReference<>(eden);
        } else {
            edenSpace.compareAndSet(edenSpace.get(), eden);
        }
    }


}
