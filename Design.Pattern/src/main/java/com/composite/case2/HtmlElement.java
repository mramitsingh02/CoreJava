package com.composite.case2;

public class HtmlElement extends HtmlTag {
    public HtmlElement(String name) {
        super(name);
    }

    public HtmlElement(String name, String value) {
        this(name);
        setBodyValue(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getTagName()).append(">");
        sb.append("").append(getBodyValue());
        sb.append("</").append(getTagName()).append(">");
        sb.trimToSize();
        return sb.toString();
    }
}
