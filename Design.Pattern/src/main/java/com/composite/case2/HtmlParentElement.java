package com.composite.case2;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {
    private List<Element> tagList;

    public HtmlParentElement(String name) {
        super(name);
        tagList = new ArrayList<>();
    }


    @Override
    public Element appendChiled(Element element) {
        tagList.add(element);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(getTagName()).append(">");
        for (Element e : tagList) {
            sb.append("\n").append(e.toString());
        }
        sb.append("\n");
        sb.append("</").append(getTagName()).append(">");
        sb.trimToSize();
        return sb.toString();
    }
}
