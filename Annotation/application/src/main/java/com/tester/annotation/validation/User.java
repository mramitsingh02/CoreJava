package com.tester.annotation.validation;

import java.util.List;

@Immutable
public final class User {
    private final String userName;
    private final String password;
    private final List<String> listOfGrand;

    public User(String userName, String password, List<String> listOfGrand) {
        this.userName = userName;
        this.password = password;
        this.listOfGrand = listOfGrand;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getListOfGrand() {
        return listOfGrand;
    }

}
