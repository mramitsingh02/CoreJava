package com.tester.java8.collection.stream.case2;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<String> field = new ArrayList<>();

    public List<String> getFields() {
        return field;
    }

    public Field setField(List<String> field) {
        this.field = field;
        return this;
    }
}
