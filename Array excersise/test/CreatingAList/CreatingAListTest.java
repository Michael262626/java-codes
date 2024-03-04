package CreatingAList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class CreatingAListTest {
        private CreatingAList newList;

        @BeforeEach
        public void initializer(){
            newList = new CreatingAList();
        }
        @Test
        void testThatAListIsEmpty(){
            assertTrue(newList.isEmpty());
        }
        @Test
        void testThatAListIsNotEmpty(){
            assertTrue(newList.isEmpty());

        }
        @Test
        void testCanAddToTheList(){
            assertTrue(newList.isEmpty());
            newList.add("Michael");
            assertFalse(newList.isEmpty());
        }
        @Test
        void testCanAddMoreThanOneElements(){
            assertTrue(newList.isEmpty());
            newList.add("Michael");
            newList.add("abbey");
            newList.add("Philip");
            assertFalse(newList.isEmpty());
        }
        @Test
        void testCanRemoveFromAList(){
            assertTrue(newList.isEmpty());
            newList.add("Michael");
            newList.remove("Michael");
            assertTrue(newList.isEmpty());

        }
        @Test
        void testCanRemoveMoreThanOneElement(){
            assertTrue(newList.isEmpty());
            newList.add("Michael");
            newList.add("Philip");
            newList.add("Kume");
            newList.remove("Michael");
            newList.remove("Kume");
            assertFalse(newList.isEmpty());
        }
        @Test
        void testCanGetTheElementIndex(){
            assertTrue(newList.isEmpty());
            newList.add("Michael");
            newList.add("Abbey");
            newList.add("Kume");
            assertEquals("Michael", newList.getIndex(0));
        }
        @Test
        void testCanGetTheElementsInTheList(){
            assertTrue(newList.isEmpty());
            newList.add("Michael");
            newList.add("Abbey");
            newList.add("Kume");
            assertEquals("Michael", newList.getElement("Michael"));
        }
        @Test
        void testCanGetMoreThanOneElementsInTheList(){
            assertTrue(newList.isEmpty());
            newList.add("Michael");
            newList.add("Abbey");
            newList.add("Kume");
            assertEquals("Michael", newList.getElement("Michael"));
            assertEquals("Kume", newList.getElement("Kume"));
        }
        @Test
        void testCanRemoveAllElementsInList(){
            assertTrue(newList.isEmpty());
            newList.add("Michael");
            newList.add("Philip");
            newList.add("Kume");
            newList.remove("Michael");
            newList.remove("Kume");
            newList.remove("Philip");
            assertTrue(newList.isEmpty());
        }

        @Test
        void testCanInsertElementsInList(){
            assertTrue(newList.isEmpty());
            newList.add("Michael");
            newList.add("Kume");
            newList.insert("Abbey", 1);
            assertEquals("Kume", newList.getIndex(1));


        }


    }


