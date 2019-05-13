package com.prototype.case3;

import java.io.Serializable;

public class Address implements Serializable {
    private String street;
    private String district;
    private String pin;

    public Address(String street, String district, String pin) {
        this.street = street;
        this.district = district;
        this.pin = pin;
    }

    public Address(Address address) {
        this.street = address.street;
        this.district = address.district;
        this. pin =address.pin;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", district='" + district + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
