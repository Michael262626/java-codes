package diaryApp;

import java.time.LocalDateTime;

    public class Entry {
        private final int id;
        private String title;
        private String body;
        private LocalDateTime dateCreated;

        public Entry(int id, String title, String body){
            this.id = id;
            this.body = body;
            this.title = title;
        }
        public String getTitle(){
            return title;
        }
        public String getBody(){
            return body;
        }
        public int getId(){
            return id;
        }

        public void setTitle(String newTitle) {
            this.title = newTitle;
        }
        public void setBody(String newBody){
            this.body = newBody;
        }
        @Override
        public String toString(){
            return String.format("%s%n %s%n", getTitle(), getBody());
        }
    }


