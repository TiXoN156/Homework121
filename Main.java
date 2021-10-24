package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println(isDateOdd("FEBRUARY 1 2013"));
    }

    public static boolean isDateOdd(String date){
        Date dateCurrent = new Date(date);
        Date dateStartYear = new Date(date);

        dateStartYear.setHours(0);
        dateStartYear.setMinutes(0);
        dateStartYear.setSeconds(0);
        dateStartYear.setDate(1);
        dateStartYear.setMonth(0);

        long msInDay = 24 * 60 * 60 * 1000;

        if (((dateCurrent.getTime()/msInDay - dateStartYear.getTime()/msInDay)+1) % 2 == 0)
            return false;
        else
            return true;
    }
}
