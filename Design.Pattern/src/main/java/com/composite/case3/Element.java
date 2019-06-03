package com.composite.case3;

import java.util.List;
import java.util.Objects;

public interface Element {
    public String getName();

    public String getValue();

    public void setValue(String value);

    public Element add(Element element);

    default String getTagName() {
        if(Objects.isNull(getValue()))
            return String.format("<%s/>", getName());

        return String.format("<%s>%s</%s>", this.getName(), this.getValue(), this.getName());
    }

    public List<Element> getChildren();
}
