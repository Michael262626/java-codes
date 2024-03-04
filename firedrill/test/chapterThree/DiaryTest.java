package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    private Diary myDiary;
    @BeforeEach
    void initializer(){
        myDiary = new Diary("michael", "2007hed");
    }
    @Test
    void testToUnlockDiary() throws InvalidPinException {
        myDiary.unlockDiary("2007hed");
        assertFalse(myDiary.isLocked());
    }
    @Test
    void testToLockDiary(){
        myDiary.lock();
        assertTrue(myDiary.isLocked());
    }
    @Test
    void testIsLocked(){
        myDiary.lock();
        assertTrue(myDiary.isLocked());
    }
    @Test
    void testToCreateEntry() throws InvalidPinException {
        Entry entry = new Entry(1, "I love coding", "coding is fun");
        myDiary.setPassword("200dvs");
        myDiary.unlockDiary("200dvs");
        String entryTitle = "I love coding";
        String entryContent = "coding is fun";
        myDiary.createEntry(entryTitle, entryContent);
        List<Entry> entries = myDiary.getEntry();
        assertEquals(1, entries.size());
        Entry createdEntry = entries.get(0);
        assertEquals(entryTitle, createdEntry.getTitle());
        assertEquals(entryContent, createdEntry.getBody());
    }
    @Test
    void testDeleteEntry() throws InvalidPinException {
        Entry entry = new Entry(1, "I love coding", "coding is fun");
        myDiary.setPassword("200dvs");
        myDiary.unlockDiary("200dvs");
        String entryTitle = "I love coding";
        String entryContent = "coding is fun";
        myDiary.createEntry(entryTitle, entryContent);
        List<Entry> entries = myDiary.getEntry();
        assertEquals(1, entries.size());
        Entry createdEntry = entries.get(0);
        myDiary.deleteEntry(1);
        assertEquals(0, entries.size());
    }
    @Test
    void testToFindEntryById() throws InvalidPinException {
        myDiary.setPassword("200dvs");
        myDiary.unlockDiary("200dvs");
        String entryTitle = "I love coding";
        String entryContent = "coding is fun";
        myDiary.createEntry(entryTitle, entryContent);
        int entryId = myDiary.getEntry().get(0).getId();

        Entry findEntry = myDiary.findEntry(entryId);
        assertEquals(entryId, findEntry.getId());
    }
    @Test
    void updateEntry() throws InvalidPinException {
        Entry entry = new Entry(1, "I love coding", "coding is fun");
        myDiary.setPassword("200dvs");
        myDiary.unlockDiary("200dvs");
        String entryTitle = "I love coding";
        String entryContent = "coding is fun";
        myDiary.createEntry(entryTitle, entryContent);
        List<Entry> entries = myDiary.getEntry();
        assertEquals(1, entries.size());
        Entry createdEntry = entries.get(0);
        myDiary.updateEntry(1, "Coding is pain", "Coding ain't fun");
    }


}