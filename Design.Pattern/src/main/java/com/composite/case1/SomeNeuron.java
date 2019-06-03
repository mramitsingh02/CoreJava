package com.composite.case1;

public interface SomeNeuron extends Iterable<Neuron> {
    default void connectTo(SomeNeuron other) {
        if (this == null) return;
        for (Neuron from : this) {
            for (Neuron to : other) {
                from.out.add(to);
                to.in.add(from);
            }
        }
    }

}
