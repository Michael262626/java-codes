package fireDrillOne;

import fireDrillOne.Assesment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssesmentTest {

    @Test
    void testVerticalOrder(){
        Assesment myResult = new Assesment();
        String numbers = "1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ";
        int [] values = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(numbers,Assesment.elements(values));

    }

}