package com.composite.case3;

import java.util.Objects;

public class HtmlElement extends HtmlTag {
    public HtmlElement(String name) {
        super(name);
    }

    public HtmlElement(Element parent, String name, String value) {
        super(parent, name, value);
        if (Objects.nonNull(parent)) {
            parent.add(this);
        }
    }

    public HtmlElement(String name, String value) {
        super(null, name, value);
    }


    public HtmlElement(Element parent, String name) {
        super(parent, name, null);
    }


    @Override
    public String toString() {
        return getTagName();
    }
}
