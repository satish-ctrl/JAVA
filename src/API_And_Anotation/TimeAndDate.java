package API_And_Anotation;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeAndDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day+"/"+month+"/"+year);

        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int ns = time.getNano();
        System.out.println(hour+":"+min+":"+sec+":"+ns);


    }
}
