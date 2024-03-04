package DayOfTheMonth;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DayOfTheMonth {
    public static int getAge(String day){
        LocalDate date1 = LocalDate.parse(day, DateTimeFormatter.ofPattern("dd/MM/yyy"));
        if(LocalDate.now().getDayOfYear() - date1.getDayOfYear() >= 0)
            return LocalDate.now().getDayOfYear();
        return LocalDate.now().getYear() - date1.getYear()-1;
    }



}
