package com.example.konda.retrofitwebservices;

/**
 * Created by konda on 3/26/2017.
 */

public class Contacts {

    private String name;
    private String email;

    private Phone phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
