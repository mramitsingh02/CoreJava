package com.tester.bigdecimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DemoBigDecimal {
    public static void main(String[] args) {
        List<BigDecimal> lstBigDecimal = new ArrayList<>();
        lstBigDecimal.add(BigDecimal.TEN);
        lstBigDecimal.add(BigDecimal.ONE);
        lstBigDecimal.add(BigDecimal.ZERO);

        final BigDecimal bigDecimal = lstBigDecimal.stream().reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
        System.out.println(bigDecimal);
    }
}
