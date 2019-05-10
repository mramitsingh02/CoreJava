package com.template;

public class FamliyFrame extends AbstractFrame implements Frame {
    @Override
    protected void bodyImage() {
        System.out.println("[ Me, Wife, my Baby   ]");
    }
    @Override
    protected void header() {
        System.out.println("[_____________________]");
        System.out.println("[      My Family      ]");
        System.out.println("[_____________________]");

    }
}
