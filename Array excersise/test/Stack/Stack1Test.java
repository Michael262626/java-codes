package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class Stack1Test {
        private Stack1 myStack;
        @BeforeEach
        void initializer(){
            myStack = new Stack1(5);
        }
        @Test
        void testIfStackIsEmpty(){
            assertTrue(myStack.isEmpty());
        }
        @Test
        void testToPushTStack(){
            assertTrue(myStack.isEmpty());
            myStack.push("Michael");
            assertFalse(myStack.isEmpty());
        }
        @Test
        void testToPop(){
            assertTrue(myStack.isEmpty());
            myStack.push("Michael");
            myStack.pop("Michael");
            assertTrue(myStack.isEmpty());
        }
        @Test
        void testToPeek(){
            assertTrue(myStack.isEmpty());
            myStack.push("Michael");
            myStack.push("Abbey");
            myStack.push("Praise");
            assertEquals("Praise", myStack.peek());
        }
        @Test
        void testToCheckIfElementsIsNotPresentInTheStack(){
            assertTrue(myStack.isEmpty());
            assertThrows(StackOverflowError.class, ()->myStack.pop("Michael"));
        }
    }
