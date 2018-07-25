package com.whatever.myapplication.domain;

public class Properties {
    private String description;
    private String subdescription;
    private String area;
    private String bedroom;
    private String batroom;


    public Properties(String description, String subdescription, String area, String bedroom, String batroom){
        this.description = description;
        this.subdescription = subdescription;
        this.area = area;
        this.bedroom = bedroom;
        this.batroom = batroom;
    }

    public String getDescription() {
        return description;
    }

    public String getSubdescription() {
        return subdescription;
    }

    public String getArea() {
        return area;
    }

    public String getBedroom() {
        return bedroom;
    }

    public String getBatroom() {
        return batroom;
    }
}
