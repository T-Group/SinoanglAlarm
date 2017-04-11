package com.sinoangel.saz_alarm.bean;

import com.sinoangel.saz_alarm.DateUtil;

import java.io.Serializable;

/**
 * Created by pc on 2016/8/18.
 */
public class CustomDate  implements Serializable {


    //    private static final long serialVersionUID = 1L;
    public int year;
    public int month;
    public int day;
    public int week;

    public CustomDate(int year, int month, int day) {
        if (month > 12) {
            month = 1;
            year++;
        } else if (month < 1) {
            month = 12;
            year--;
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public CustomDate() {
        this.year = DateUtil.getYear();
        this.month = DateUtil.getMonth();
        this.day = DateUtil.getCurrentMonthDay();
    }

    public static CustomDate modifiDayForObject(CustomDate date, int day) {
        CustomDate modifiDate = new CustomDate(date.year, date.month, day);
        return modifiDate;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    @Override
    public Object clone() {
        CustomDate clone = null;
        try{
            clone = new CustomDate(this.year,this.month,this.day);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return clone;
    }

//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        this.month = month;
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        this.day = day;
//    }
//
//    public int getWeek() {
//        return week;
//    }
//
//    public void setWeek(int week) {
//        this.week = week;
//    }
}
