import myutilities.TodaysDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TodaysDateTest {

    @Test
    void testObjectNotNull() {
        TodaysDate date = new TodaysDate();
        assertNotNull(date, "El objeto TodaysDate no debería ser nulo");
    }

    @Test
    void testDayIsValid() {
        TodaysDate date = new TodaysDate();
        assertTrue(date.getDay() >= 1 && date.getDay() <= 31, "El día debe estar entre 1 y 31");
    }

    @Test
    void testMonthIsValid() {
        TodaysDate date = new TodaysDate();
        assertTrue(date.getMonth() >= 1 && date.getMonth() <= 12, "El mes debe estar entre 1 y 12");
    }

    @Test
    void testYearIsCurrent() {
        TodaysDate date = new TodaysDate();
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        assertEquals(currentYear, date.getYear(), "El año debe ser el actual");
    }

    @Test
    void testTimeFormat() {
        TodaysDate date = new TodaysDate();
        assertTrue(date.getTime().matches("\\d{2}:\\d{2}:\\d{2}"), "El formato de hora debe ser HH:MM:SS");
    }
}

