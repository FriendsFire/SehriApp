package com.example.abusmzakaria.sehriapp;

public class TimeTable {
    private String date;
    private String sehri;
    private String iftar;

    public TimeTable(String date, String sehri, String iftar) {
        this.date = date;
        this.sehri = sehri;
        this.iftar = iftar;
    }

    public String getDate() {
        return date;
    }

    public String getSehri() {
        return sehri;
    }

    public String getIftar() {
        return iftar;
    }
}
