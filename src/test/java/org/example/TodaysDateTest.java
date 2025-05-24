package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDateTest {

    // Prueba para verificar que el atributo day se actualiza correctamente
    @Test
    void testDayAttributeUpdatesCorrectly() {
        TodaysDate todaysDate = new TodaysDate();
        todaysDate.printDateAndTime();

        GregorianCalendar calendar = new GregorianCalendar();
        int currentDay = calendar.get(Calendar.DATE);

        assertEquals(currentDay, todaysDate.day, "El día debería coincidir con el día actual.");
    }

    // Prueba para verificar que el atributo year se actualiza correctamente
    @Test
    void testYearAttributeUpdatesCorrectly() {
        TodaysDate todaysDate = new TodaysDate();
        todaysDate.printDateAndTime();

        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);

        assertEquals(currentYear, todaysDate.year, "El año debería coincidir con el año actual.");
    }

    // Prueba para verificar que el atributo time no es nulo ni vacío
    @Test
    void testTimeAttributeIsNotNullAndNotEmpty() {
        TodaysDate todaysDate = new TodaysDate();
        todaysDate.printDateAndTime();

        assertNotNull(todaysDate.time, "La hora no debería ser nula.");
        assertFalse(todaysDate.time.isEmpty(), "La hora no debería estar vacía.");
    }

    // Prueba para verificar el formato del atributo time
    @Test
    void testTimeAttributeFormat() {
        TodaysDate todaysDate = new TodaysDate();
        todaysDate.printDateAndTime();

        // El formato esperado es HH:MM:SS
        assertTrue(todaysDate.time.matches("\\d{1,2}:\\d{1,2}:\\d{1,2}"), "El formato de la hora debería ser HH:MM:SS.");
    }


}