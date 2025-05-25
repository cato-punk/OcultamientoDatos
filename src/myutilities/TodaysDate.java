package myutilities;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {
    private int day;
    private int month;
    private int year;
    private String time;

    public TodaysDate() {
        Calendar calendar = new GregorianCalendar();
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
        this.time = String.format("%tT", calendar);
    }

    public void printDateAndTime() {
        System.out.println("Time: " + time);
        System.out.println("Date: " + day + " " + month + " " + year);
    }

    // Métodos getter y setter solo si los necesitas
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
    public String getTime() { return time; }
}

