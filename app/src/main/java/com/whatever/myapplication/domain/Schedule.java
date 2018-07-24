package com.whatever.myapplication.domain;

public class Schedule {
    private String dia;
    private String mes;
    private String description;
    private String subdescription;
    private String hora;


    public Schedule(String dia, String mes, String description, String subdescription, String hora){
        this.dia = dia;
        this.mes = mes;
        this.description = description;
        this.subdescription = subdescription;
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public String getDescription() {
        return description;
    }

    public String getSubdescription() {
        return subdescription;
    }

    public String getHora() {
        return hora;
    }

}
