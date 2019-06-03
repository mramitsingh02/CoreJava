package com.composite.case1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Neuron implements SomeNeuron {
    private final String name;
    protected ArrayList<Neuron> in = new ArrayList<>();
    protected ArrayList<Neuron> out = new ArrayList<>();


    public Neuron(String name) {
        this.name = name;
    }
/*
    public void connectTo(Neuron neuron) {
        out.add(neuron);
        neuron.in.add(this);
    }
*/

    @Override
    public Iterator iterator() {
        return Collections.singleton(this).iterator();
    }

    @Override
    public void forEach(Consumer action) {
        action.accept(this);
    }

    @Override
    public Spliterator spliterator() {
        return Collections.singleton(this).spliterator();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.name).append(",");
        //print(new StringBuilder(), 0);


        for (Neuron inNeron : in) {
            for (Neuron outNeron : out) {
                builder.append(inNeron.name);
                builder.append(",");
            }
        }

        return builder.toString();

    }


    private void print(StringBuilder stringBuilder, int depth) {
        stringBuilder.append(String.join("", Collections.nCopies(depth, "*")))
                .append(depth > 0 ? " " : "")
                .append((in == null || in.isEmpty()) ? "" : in + " ")
                .append(System.lineSeparator());

    }
}
