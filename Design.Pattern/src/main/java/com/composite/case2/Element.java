package com.composite.case2;

import java.util.List;

public interface Element {
    public String getTagName();
    public String getBodyValue();
    public Element appendChiled(Element element);
    public void setBodyValue(String value);
    public List<Element> getChildren();
}
