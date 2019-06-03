package com.composite.case3;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {
    private List<Element> tagList = new ArrayList<>();


    public HtmlParentElement(String name) {
        super(name);
    }

    public HtmlParentElement(Element parent, String name) {
        super(parent, name);
        if (getParent() != null) {
            getParent().getChildren().add(this);
        }
    }

    @Override
    public List<Element> getChildren() {
        return tagList;
    }

    public HtmlParentElement(Element parent, String name, String value) {
        super(parent, name, value);
        if (getParent() != null) {
            getParent().getChildren().add(this);
        }
    }

    @Override
    public Element add(Element element) {
        tagList.add(element);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getName()).append(">");
        for (Element e : tagList) {
            sb.append("\n").append(e.toString());
        }
        sb.append("\n");
        sb.append("</").append(getName()).append(">");
        sb.trimToSize();
        return sb.toString();
    }
}
