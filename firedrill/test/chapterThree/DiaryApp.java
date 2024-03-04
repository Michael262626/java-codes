package chapterThree;

import javax.swing.*;

public class DiaryApp {
   private static boolean validate(String name){
       return name.isBlank();
   }
   private static String[] prompt() {
       String name = input("Hello!\nWelcome to My Diary\nEnter your name");
       String password = input("Enter your password to continue");
       String[] returnValue = new String[2];
       returnValue[0] = name;
       returnValue[1] = password;
       return returnValue;
   }
   private static final Diaries diaries = new Diaries();
   private static Diary diary;
   private static Entry entry;
   private static void print(String output){
       JOptionPane.showMessageDialog(null, output);
   }
   private static String input(String output){
       return JOptionPane.showInputDialog(null, output);
   }
   private static void createNewDiary(){
       String[] nameAndPassword = prompt();
       if(validate(nameAndPassword[0]) || validate(nameAndPassword[1])){
           print("Name and password cannot be empty");
       }
       diary = new Diary(nameAndPassword[0], nameAndPassword[1]);
       diaries.addToDiary(nameAndPassword[0], nameAndPassword[1]);
       print(String.format("%s entry's created successfully.", diary.toString()));
       diaryMenu();
   }
   public static void main(String[] args){
       homePage();
   }
   private static void homePage(){
       String choice = input("Welcome\n1. Create new Dairy.\n2. Exit.");
       switch(choice){
           case "1":
               createNewDiary();
               break;
           case "2":
               print("GoodBye");
               System.exit(0);
               break;
           default:
               homePage();
       }
   }
   private static int askToLock(){
       return JOptionPane.showInternalConfirmDialog(null, "Lock Diary");
   }
   private static void createEntry(){

       try{
           String title = input("Enter Title");
           String body = input("Write what you want to do in your diary");
           int newEntryId = diary.createEntry(title, body);

           print("Entry with ID " + newEntryId + " created successfully.");
           diary.createEntry(title, body);
           int choice = askToLock();
           if(choice==0){
               diary.lock();
           }
           diaryMenu();
       }catch (IllegalArgumentException e){
           print("Error while creating entry");
           createEntry();
       }
   }
   private static void updateEntry(){
       try {
           if (diary.isLocked()) {
               String password = input("enter password");
               diary.unlockDiary(password);
               int id = Integer.parseInt(input("Enter Entry id"));
               String title = input("Update Entry title");
               String body = input("Write what you want to do in your diary");
               diary.updateEntry(id, title, body);
               diaryMenu();
           }
           int id = Integer.parseInt(input("Enter Entry id"));
           if(!diary.equals(id)) {print("Entry with Entry id" +id+ "does not exist");
               homePage();
           return;
           }
           String title = input("Update Entry title");
           String body = input("Write what you want to do in your diary");
           diary.updateEntry(id, title, body);
           int choice = JOptionPane.showInternalConfirmDialog(null, "Do you want to lock your diary?");
           if (choice == 0)
               diary.lock();
           diaryMenu();

       } catch (InvalidPinException invalidPinException) {
          print("error something went wrong");
       }catch (IllegalArgumentException illegalArgumentException){
           print("You entered a wrong command");
           diaryMenu();
       }catch (InvalidUserException invalidUserException){
           print("Enter does not exist");
           diaryMenu();
       }
   }
   private static void findEntry() {
       try {
           int id = Integer.parseInt(input("Enter id of entry"));
           if(diary.isLocked()){
               String password = input("Enter password to find entry");
               diary.unlockDiary(password);
               diary.lock();
           }
           String entryDetails = String.valueOf(diary.findEntry(id));

           if (entryDetails != null) {
               print("Entry details for ID " + id + ":\n" + entryDetails);
           } else {
               print("Entry with ID " + id + " does not exist.");
           }
           diary.findEntry(id);
           print(String.format("%s", entry.toString()));
           diary.lock();
           diaryMenu();
       }catch (Exception exception){
           print(exception.getMessage());
       }
   }
   private static void deleteEntry(){
       try{
           if(diary.isLocked()){
               String password = input("Enter password to delete");
               diary.unlockDiary(password);
               diary.lock();
               diaryMenu();
           }
           int id = Integer.parseInt(input("Enter id of entry to delete"));
           if(!diary.getEntry().equals(id)){
               print("Entry with ID " + id + " does not exist.");
               diaryMenu();
           }
           int confirm = JOptionPane.showInternalConfirmDialog(null, "Are you sure you want to delete entry with ID " + id + "?");
           if (confirm == JOptionPane.YES_OPTION)
               diary.deleteEntry(id);
           diary.lock();
           diaryMenu();
       }catch(Exception exception){
           print(exception.getMessage());
       }
   }
   private static void diaryMenu(){
       String option  = input("1. Create Entry\n2. Update Entry\n3. Find Entry\n4. Delete Entry\n5. Main Menu\n6. Exit...");
       switch (option){
           case "1":
               createEntry();
           case "2":
               updateEntry();
           case "3":
               findEntry();
           case "4":
               deleteEntry();
           case "5":
               homePage();
           case "6":
               System.exit(0);
           default:
               diaryMenu();
       }
   }


}


