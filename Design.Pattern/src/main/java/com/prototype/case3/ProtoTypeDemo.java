package com.prototype.case3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProtoTypeDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("8920801125");
        list.add("9911505289");
        Map<String, Double> mapOfMarks = new HashMap<>();
        mapOfMarks.put("MCA", 62.0);
        mapOfMarks.put("BCA", 60.0);
        Student amitKSingh = new Student(new String[]{"Amit", "Singh"}, new Address("MG Road", "Hariyan", "122002"), list, mapOfMarks);

        Student rakesh = new SerializationUtil<Student>().copy(amitKSingh);
        rakesh.getName()[0] = "Rakesh";
        rakesh.getListOfPhoneNumber().remove(1);

        rakesh.getListOfMarks().put("BCA", 82.0);
        rakesh.getListOfMarks().put("MCA", 75.0);

        System.out.println(amitKSingh);
        System.out.println(rakesh);

    }

}
