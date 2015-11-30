package com.parsifal.gubu;

import org.mongodb.morphia.annotations.Id;

public class Moment {
    public String getId() {
        return id;
    }

    @Id
    private String id;

    private int date;
    private String month;
    private int year;
    private int hour;
    private int minute;
    private double carbs;
    private double glucose;
    private int bolus;
    private String bolusInjectionSite;
    private String ratio;
    private int basal;
    private String basalInjectionSite;
    private String entryType;
    private int keytones;
    private String comments;
    private int userId;

    public int getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getGlucose() {
        return glucose;
    }

    public int getBolus() {
        return bolus;
    }

    public String getBolusInjectionSite() {
        return bolusInjectionSite;
    }

    public String getRatio() {
        return ratio;
    }

    public int getBasal() {
        return basal;
    }

    public String getBasalInjectionSite() {
        return basalInjectionSite;
    }

    public String getEntryType() {
        return entryType;
    }

    public int getKeytones() {
        return keytones;
    }

    public String getComments() {
        return comments;
    }

    public int getUserId() {
        return userId;
    }

        /*  {
            "date": 1,
                "month": "Jan",
                "year": 2015,
                "hour": 1,
                "minute": 0,
                "carbs": "1",
                "glucose": "1",
                "bolus": "1",
                "bolusInjectionSite": "Right Stomach",
                "ratio": "2",
                "basal": "1",
                "basalInjectionSite": "Right Stomach",
                "entryType": "Before Breakfast",
                "keytones": "7",
                "comments": "t",
                "userId": 1
        }*/
}
