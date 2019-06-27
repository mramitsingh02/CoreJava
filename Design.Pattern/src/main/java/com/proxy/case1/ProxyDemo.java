package com.proxy.case1;

public class ProxyDemo {
    public static void main(String[] args) {
        Employee emp = new EmployeeProxy(1234);
        emp.setAge(19);
        emp.setName("Amit Kumar @@Singh");
        emp.setFname("Mannu Singh");
        System.out.println(emp.toString());


    }
}
