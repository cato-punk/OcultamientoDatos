package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate; // para obtener el mes de forma 1-indexada más fácilmente
import java.time.LocalTime; // para obtener la hora de forma más moderna
import java.time.format.DateTimeFormatter; // para formatear la hora si es necesario

public class TodaysDateTest {

    // Prueba para verificar que el atributo day se actualiza correctamente
    @Test
    void testDayAttributeUpdatesCorrectly() {
        TodaysDate todaysDate = new TodaysDate();
        todaysDate.printDateAndTime();

        GregorianCalendar calendar = new GregorianCalendar();
        int currentDay = calendar.get(Calendar.DATE); //  Calendar.DAY_OF_MONTH


        assertEquals(currentDay, todaysDate.getDay(), "El día debería coincidir con el día actual.");

    }

    // Prueba para verificar que el atributo year se actualiza correctamente
    @Test
    void testYearAttributeUpdatesCorrectly() {
        TodaysDate todaysDate = new TodaysDate(); // El constructor ya inicializa los valores

        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);

        // Usando el getter
        assertEquals(currentYear, todaysDate.getYear(), "El año debería coincidir con el año actual.");

    }


    // Prueba para verificar que el atributo time no es nulo ni vacío
    @Test
    void testTimeAttributeIsNotNullAndNotEmpty() {
        TodaysDate todaysDate = new TodaysDate();

        // Usando el getter
        assertNotNull(todaysDate.getTime(), "La hora no debería ser nula.");
        assertFalse(todaysDate.getTime().isEmpty(), "La hora no debería estar vacía.");

    }


    // Prueba para verificar el formato del atributo time
    @Test
    void testTimeAttributeFormat() {
        TodaysDate todaysDate = new TodaysDate(); // El constructor ya inicializa los valores

        // El formato esperado es HH:MM:SS
        // Usando el getter
        assertTrue(todaysDate.getTime().matches("\\d{1,2}:\\d{1,2}:\\d{1,2}"), "El formato de la hora debería ser HH:MM:SS.");

    }


    // Test: Verificar que el objeto TodaysDate no es nulo después de la instanciación.
    @Test
    void testObjectNotNull() {
        TodaysDate todaysDate = new TodaysDate();
        assertNotNull(todaysDate, "El objeto TodaysDate no debería ser nulo.");
    }


    // Test: Verificar que el día es válido (entre 1 y 31).
    @Test
    void testDayIsValid() {
        TodaysDate todaysDate = new TodaysDate();
        assertTrue(todaysDate.getDay() >= 1 && todaysDate.getDay() <= 31, "El día debe estar entre 1 y 31.");
    }



    // Test: Verificar que el mes es válido (entre 1 y 12).
    @Test
    void testMonthIsValid() {
        TodaysDate todaysDate = new TodaysDate();
        // No es necesario llamar a printDateAndTime() aquí, el constructor ya inicializó
        assertTrue(todaysDate.getMonth() >= 1 && todaysDate.getMonth() <= 12, "El mes debe estar entre 1 y 12.");
    }




    // Test: Verificar que el año es el actual.
    @Test
    void testYearIsCurrent() {
        TodaysDate todaysDate = new TodaysDate();


        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        assertEquals(currentYear, todaysDate.getYear(), "El año debe ser el actual.");
    }




    // --- Test adicional para verificar el valor exacto del mes (importante ya que es private) ---
    @Test
    void testMonthAttributeUpdatesCorrectly() {
        TodaysDate todaysDate = new TodaysDate();

        GregorianCalendar calendar = new GregorianCalendar();
        int currentMonth = calendar.get(Calendar.MONTH) + 1; // Meses son 0-indexados en Calendar

        assertEquals(currentMonth, todaysDate.getMonth(), "El mes debería coincidir con el mes actual.");
    }




    // --- Test para verificar que todos los atributos de fecha/hora son los actuales del sistema ---
    @Test
    void testAllDateAndTimeAttributesAreCurrent() {
        TodaysDate todaysDate = new TodaysDate();

        GregorianCalendar calendar = new GregorianCalendar();

        // Verificar Día
        int currentDay = calendar.get(Calendar.DATE);
        assertEquals(currentDay, todaysDate.getDay(), "El día debería coincidir con el día actual.");

        // Verificar Mes
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        assertEquals(currentMonth, todaysDate.getMonth(), "El mes debería coincidir con el mes actual.");

        // Verificar Año
        int currentYear = calendar.get(Calendar.YEAR);
        assertEquals(currentYear, todaysDate.getYear(), "El año debería coincidir con el año actual.");

        // Verificar Hora
        LocalTime actualTime = LocalTime.now();
        String actualTimeString = actualTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        String todaysDateTimeString = todaysDate.getTime();


        assertEquals(actualTimeString, todaysDateTimeString, "La hora debería coincidir con la hora actual.");


    }
}