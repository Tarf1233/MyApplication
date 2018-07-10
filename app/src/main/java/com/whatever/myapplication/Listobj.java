package com.whatever.myapplication;

public class Listobj {
    public String id;
    public String namee;
    public String datee;
    public String hourr;
    public String descriptionn;



    public Listobj(String id, String namee, String descriptionn, String hourr, String datee){
        this.id = id;
        this.namee = namee;
        this.descriptionn = descriptionn;
        this.hourr = hourr;
    }

    public String getId() {
        return id;
    }
    public String getNamee() {
        return namee;
    }
    public String getDescriptionn() {
        return descriptionn;
    }
    public String getHourr() {
        return hourr;
    }
    public String getDatee() {
        return datee;
    }


}