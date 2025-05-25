package org.example; // Paquete actualizado

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {

    String time;      // Por defecto (package-private)
    public int day;   // Público
    private int month; // Privado,este es el único que debe ser privado
    protected int year; // Protegido


    public TodaysDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.time = calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND); // vuelve al formato simple
        this.day = calendar.get(Calendar.DATE);    // DATE es lo mismo que DAY_OF_MONTH
        this.month = calendar.get(Calendar.MONTH) + 1; // Meses son 0-indexed
        this.year = calendar.get(Calendar.YEAR);
    }


    public void printDateAndTime() {
        System.out.println("Time: " + time);
        System.out.println("Date: " + month + " " + day + " " + year);
    }



    // Getter para 'month' (NECESARIO porque es privado para las pruebas)
    public int getMonth() {
        return month;
    }


    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String getTime() {
        return time;
    }
}