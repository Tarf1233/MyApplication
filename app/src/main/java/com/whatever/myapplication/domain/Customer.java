package com.whatever.myapplication.domain;

public class Customer {

    private String description;
    private String subdescription;


    public Customer(String description, String subdescription){
        this.description = description;
        this.subdescription = subdescription;
    }

    public String getDescription() {
        return description;
    }

    public String getSubdescription() {
        return subdescription;
    }
}
