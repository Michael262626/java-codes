package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PersonTest {
    @Test
    void testAddProblems(){
        Person person = new Person();
        Problem problem1 = new Problem("no food", Type.FINANCIAL);
        person.addProblems(problem1);
    }
    @Test
    void testIfProblemsIsSolved(){
        Person person = new Person();
        Problem problem1 = new Problem("no money", Type.FINANCIAL);
        person.addProblems(problem1);
        assertFalse(person.isSolved(problem1));
    }
    @Test
    void testToRecountProblems(){
        Person person = new Person();
        Problem problem1 = new Problem("no money", Type.FINANCIAL);
        Problem problem2 = new Problem("illiteracy", Type.EDUCATION);
        assertEquals(2, person.reCount((String.valueOf(problem1)), problem2));
    }
}