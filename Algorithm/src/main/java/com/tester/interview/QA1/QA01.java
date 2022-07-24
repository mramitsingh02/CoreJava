package com.tester.interview.QA1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QA01 {
    public static void main(String[] args) {
        //     List : "ICICI", "10", "ICICI", "30", "SBI", "60", "SBI", "30"


        List<Stock> listOfStock = Arrays.asList(new Stock("ICICI", 10), new Stock("ICICI", 30), new Stock("SBI", 60), new Stock("SBI", 30));

        ///Map<String, Integer> collect = listOfStock.stream().collect(Collectors.toMap(Stock::getName , stock -> stock.getValue(), Stock::getValue ));
        //System.out.println(collect);


        List<Integer> integerList = Arrays.asList(1, 2, 35, 32, 34);

        Integer integer = integerList.stream().filter(i -> i <
                integerList.stream().mapToInt(j -> j).max().getAsInt()).max(Comparator.naturalOrder()).get();
        System.out.println(integer);


        //    Output : {ICICI=40, SBI=90}
    }

    static class Stock {
        private final String name;
        private final int value;

        public Stock(String name, int value) {
            this.name = name;
            this.value = value;
        }


        public String getName() {
            return name;
        }

        public int getValue() {
            return value;
        }
    }


}
