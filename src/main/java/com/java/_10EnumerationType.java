package com.java;

import java.util.Calendar;

public class _10EnumerationType {
    // 열거타입
    public enum Week{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Week today;
        today = Week.FRIDAY;

        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week_num = now.get(Calendar.DAY_OF_WEEK);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        Week week = null;
        switch (week_num){
            case 1:
                week = Week.SUNDAY; break;case 2:
                week = Week.MONDAY; break;case 3:
                week = Week.TUESDAY; break;case 4:
                week = Week.WEDNESDAY; break;case 5:
                week = Week.THURSDAY; break;case 6:
                week = Week.FRIDAY; break;case 7:
                week = Week.SATURDAY; break;

        }

        System.out.println("오늘은 "+year+"년 "+month+"월 "+day+"일 "+week+"입니다.");
        System.out.println("지금은 "+hour+"시 "+minute+"분 "+second+"초입니다.");

    }
}
