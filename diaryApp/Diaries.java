package diaryApp;

import java.util.ArrayList;
import java.util.List;

    public class Diaries {
        private final List<Diary> diaries = new ArrayList<>();

        public void addToDiary(String title, String body){
            Diary diary = new Diary(title, body);
            diaries.add(diary);
        }
        public Diary findByUsername(String userName){
            for(Diary diary : diaries){
                if(Diary.getUserName().equals(userName)) return diary;
            }
            return null;
        }
        public void delete(String title, String body){
            Diary diary = new Diary(title, body);
            diaries.remove(diary);
        }

        public void deleteUsername(String username) {
            diaries.remove(username);
        }
    }

