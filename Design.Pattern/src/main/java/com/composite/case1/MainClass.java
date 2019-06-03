package com.composite.case1;

public class MainClass {

    public static void main(String[] args) {

        Neuron neuron1 = new Neuron("Remember");
        Neuron neuron2 = new Neuron("Tester");

        NeuronLayer neuronLayer1 = new NeuronLayer();
        NeuronLayer neuronLayer2 = new NeuronLayer();

        neuronLayer1.add(neuron1);
        neuronLayer2.add(neuron1);

        neuron1.connectTo(neuron2);
        neuron1.connectTo(neuronLayer1);
        neuronLayer1.connectTo(neuron1);
        neuronLayer1.connectTo(neuronLayer2);


        System.out.println(neuron1);

        System.out.println("Done");
    }
}
