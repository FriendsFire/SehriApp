package com.example.abusmzakaria.sehriapp;

import java.util.ArrayList;
import java.util.List;

public abstract class DatabaseTimes {
    public static List<TimeTable> getTimes(){
        List<TimeTable> timeTables = new ArrayList<>();

        timeTables.add(new TimeTable("May21","3:47","6:40"));
        timeTables.add(new TimeTable("May22","3:46","6:41"));
        timeTables.add(new TimeTable("May23","3:46","6:42"));
        timeTables.add(new TimeTable("May24","3:45","6:42"));
        timeTables.add(new TimeTable("May25","3:45","6:42"));
        timeTables.add(new TimeTable("May26","3:44","6:43"));
        timeTables.add(new TimeTable("May27","3:44","6:43"));
        timeTables.add(new TimeTable("May28","3:43","6:44"));
        timeTables.add(new TimeTable("May29","3:43","6:44"));
        timeTables.add(new TimeTable("May30","3:43","6:45"));
        timeTables.add(new TimeTable("May31","3:42","6:45"));

        timeTables.add(new TimeTable("Jun01","3:42","6:46"));
        timeTables.add(new TimeTable("Jun02","3:42","6:46"));
        timeTables.add(new TimeTable("Jun03","3:42","6:46"));
        timeTables.add(new TimeTable("Jun04","3:42","6:47"));
        timeTables.add(new TimeTable("Jun05","3:42","6:47"));
        timeTables.add(new TimeTable("Jun06","3:41","6:47"));
        timeTables.add(new TimeTable("Jun07","3:41","6:48"));
        timeTables.add(new TimeTable("Jun08","3:41","6:48"));
        timeTables.add(new TimeTable("Jun09","3:41","6:49"));
        timeTables.add(new TimeTable("Jun10","3:41","6:49"));
        timeTables.add(new TimeTable("Jun11","3:41","6:50"));
        timeTables.add(new TimeTable("Jun12","3:41","6:50"));
        timeTables.add(new TimeTable("Jun13","3:40","6:50"));
        timeTables.add(new TimeTable("Jun14","3:41","6:50"));
        timeTables.add(new TimeTable("Jun15","3:41","6:51"));
        timeTables.add(new TimeTable("Jun16","3:41","6:51"));

        return  timeTables;
    }
}
