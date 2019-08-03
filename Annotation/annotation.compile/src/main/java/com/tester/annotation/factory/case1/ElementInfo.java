package com.tester.annotation.factory.case1;

import com.squareup.javapoet.ClassName;

public class ElementInfo {
    public String tag;
    public ClassName className;

    public ElementInfo(String tag, ClassName className) {
        this.tag = tag;
        this.className = className;
    }
}