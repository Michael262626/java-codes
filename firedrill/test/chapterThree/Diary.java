package chapterThree;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private static String userName;

    private String passWord;
    private int id;
    private boolean isLocked;
    private final List<Entry> entries = new ArrayList<>();

    public Diary(String userName, String passWord) {
        Diary.userName = userName;
        this.passWord = passWord;
    }

    public int createEntry(String title, String content) {
        Entry entry = new Entry(generateEntryId(), title, content);
        entries.add(entry);
        return 0;
    }

    private int getId() {
        return id;
    }

    public void lock() {
        isLocked = true;
    }

    boolean isLocked() {
        return isLocked;
    }
    private int generateEntryId(){
        return id;
    }

    public void unlockDiary(String userPassword) throws InvalidPinException {
        if (userPassword.equals(passWord)) {
            isLocked = false;
        } else {
            throw new InvalidPinException("Invalid pin");
        }
    }

    public List<Entry> getEntry() {
        if (!isLocked) {
            return entries;
        } else {
            return null;
        }

    }

    public void setPassword(String password) {
        this.passWord = password;

    }

    public void deleteEntry(int id) {
        id--;
        if (!isLocked) entries.remove(id);
    }

    public Entry findEntry(int id) {
        if (!isLocked) {
            for (Entry entry : entries) {
                if (entry.getId()==(id))
                    return entry;
            }
        }
        return null;
    }

    public void updateEntry(int id, String newTitle, String newBody) {
        if(!isLocked)
            for(Entry entry : entries){
                if(entry.getId()==(id)) {
                    entry.setTitle(newTitle);
                    entry.setBody(newBody);
                }
            }
    }
    public void setUserName(String userName){
        Diary.userName = userName;
    }
    public static String getUserName(){
        return userName;
    }
    public String toString(){
        return ("My diary");
    }
}
