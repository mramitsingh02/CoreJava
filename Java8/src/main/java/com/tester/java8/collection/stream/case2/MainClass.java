package com.tester.java8.collection.stream.case2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClass {
    private static List<Field> lstOfField = new ArrayList<>();

    public static void main(String[] args) {
        prepareData();
        Set<String> customes = lstOfField.stream().filter(x -> x.getFields().contains("customers"))
                .map(x -> x.getFields().get(x.getFields().indexOf("customers") + 1))
                .collect(Collectors.toSet());
        customes.forEach(System.out::println);
    }

    private static void prepareData() {
        lstOfField.add(new Field().setField(Arrays.asList("partition", "customers", "CUSTOMER_ID1", "common", "0")));
        lstOfField.add(new Field().setField(Arrays.asList("partition", "customers", "CUSTOMER_ID2", "common", "0")));
        lstOfField.add(new Field().setField(Arrays.asList("partition", "customers", "CUSTOMER_ID3", "common", "0")));
        lstOfField.add(new Field().setField(Arrays.asList("partition", "customers", "CUSTOMER_ID4", "common", "0")));
        lstOfField.add(new Field().setField(Arrays.asList("partition", "customers", "CUSTOMER_ID5", "common", "0")));
    }

}

