package com.composite.case3;

import java.util.List;
import java.util.Objects;

public abstract class HtmlTag implements Element {
    private String name;
    private String value;
    private Element parent;

    public HtmlTag(String name) {
        this(null, name, null);
    }

    public HtmlTag(Element parent, String name, String value) {
        this.parent = parent;
        this.name = name;
        this.value = value;
    }

    public HtmlTag(Element parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    public HtmlTag(String name, String value) {
        this(null, name, value);
    }


    @Override
    public Element add(Element element) {
        throw new UnsupportedOperationException("Operation not allowed");
    }

    @Override
    public String getValue() {
        return Objects.nonNull(value) ? value : "";
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public List<Element> getChildren() {
        throw new UnsupportedOperationException("Operation not allowed");
    }

    @Override
    public String getName() {
        return name;
    }

    public Element getParent() {
        return parent;
    }
}
