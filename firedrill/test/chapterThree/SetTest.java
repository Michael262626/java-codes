package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    private Set mySet;
    @BeforeEach
    void initializer(){
        mySet = new Set();
    }
    @Test
    void testIfSetIsEmpty(){
        assertTrue(mySet.isEmpty());
    }
    @Test
    void testToAddToSet(){
        mySet.add("Michael");
        assertFalse(mySet.isEmpty());
    }
}