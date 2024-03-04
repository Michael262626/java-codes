package fireDrillOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assesment1Test {
    @Test
    void testToDisplayResult() {
        Assesment1 myCode = new Assesment1();
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String result = "Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, ";
        assertEquals(result, Assesment1.elements(days));
    }
}