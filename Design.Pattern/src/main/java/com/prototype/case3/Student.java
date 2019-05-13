package com.prototype.case3;


import java.io.Serializable;
import java.util.*;

public class Student implements Serializable {
    private String[] name;
    private Address address;
    private List<String> listOfPhoneNumber;
    private Map<String, Double> listOfMarks;

    public Student(String[] name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Student(String[] name, Address address, List<String> listOfPhoneNumber, Map<String, Double> listOfMarks) {
        this.name = name;
        this.address = address;
        this.listOfPhoneNumber = listOfPhoneNumber;
        this.listOfMarks = listOfMarks;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getListOfPhoneNumber() {
        return listOfPhoneNumber;
    }

    public void setListOfPhoneNumber(List<String> listOfPhoneNumber) {
        this.listOfPhoneNumber = listOfPhoneNumber;
    }

    public Map<String, Double> getListOfMarks() {
        return listOfMarks;
    }

    public void setListOfMarks(Map<String, Double> listOfMarks) {
        this.listOfMarks = listOfMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + Arrays.toString(name) +
                ", address=" + address +
                ", listOfPhoneNumber=" + listOfPhoneNumber +
                ", listOfMarks=" + listOfMarks +
                '}';
    }


}
