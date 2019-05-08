package com.tester.serilization.case2;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private String name;
    private String roll;
    private String _class;

    public Student(String name, String roll, String sClass) {
        this.name = name;
        this.roll = roll;
        this._class = sClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(roll, student.roll) &&
                Objects.equals(_class, student._class);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll, _class);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                ", _class='" + _class + '\'' +
                '}';
    }
}
