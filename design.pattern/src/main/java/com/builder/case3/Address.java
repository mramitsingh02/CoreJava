package com.builder.case3;

public class Address {
    private String street;
    private String district;
    private String pin;

    public Address(String street, String district, String pin) {
        this.street = street;
        this.district = district;
        this.pin = pin;
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
}
