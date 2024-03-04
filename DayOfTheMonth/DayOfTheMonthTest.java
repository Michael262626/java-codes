package DayOfTheMonth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheMonthTest {

        @Test
        void testToGetAge(){
            assertEquals(17, DayOfTheMonth.getAge("27/02/2006"));
            assertEquals(1, DayOfTheMonth.getAge("12/12/2022"));

        }


    }
