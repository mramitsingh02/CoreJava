package com.composite.case2;

import java.util.List;
import java.util.Objects;

public abstract class HtmlTag implements Element {
    private final String name;
    private String value;

    public HtmlTag(String name) {
        this.name = name;
    }

    public String getTagName() {
        return name;
    }

    @Override
    public Element appendChiled(Element element) {
        throw new UnsupportedOperationException("Operation not allowed");
    }

    @Override
    public void setBodyValue(String value) {
        this.value = value;
    }

    public String getBodyValue() {
       return Objects.nonNull(value) ? value : "";
    }

    @Override
    public List<Element> getChildren() {
        throw new UnsupportedOperationException("Operation not allowed");
    }
}
