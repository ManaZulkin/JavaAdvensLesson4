package task3;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Time {
    public static void main(String[] args) {
        System.out.println("Enter year");
        int year = input();
        System.out.println("Enter number of month");
        int month = input();
        System.out.println("Enter day");
        int day = input();
        System.out.println("Enter hours");
        int hours = input();
        System.out.println("Enter minutes");
        int min = input();
        System.out.println("Enter sek");
        int sek = input();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(Calendar.YEAR, year);
        gregorianCalendar.set(Calendar.MONTH, month - 1);
        gregorianCalendar.set(Calendar.DAY_OF_MONTH, day);
        gregorianCalendar.set(Calendar.HOUR, hours);
        gregorianCalendar.set(Calendar.MINUTE, min);
        gregorianCalendar.set(Calendar.SECOND, sek);
        System.out.println("Date:\n" + gregorianCalendar.getTime());
        tillNow(gregorianCalendar);
    }

    public static void tillNow(GregorianCalendar gc){
        GregorianCalendar gc1 = new GregorianCalendar();
        System.out.println("From that date past:");
        System.out.println("Year - " + (gc1.get(Calendar.YEAR) - gc.get(Calendar.YEAR)));
        if ((gc1.get(Calendar.MONTH) - gc.get(Calendar.MONTH)) > 0){
            System.out.println("Month - " + (gc1.get(Calendar.MONTH) - gc.get(Calendar.MONTH)));
        } else System.out.println("Month - " + Math.abs(gc1.get(Calendar.MONTH) + 12 - gc.get(Calendar.MONTH)) );
        if ((gc1.get(Calendar.DAY_OF_MONTH) - gc.get(Calendar.DAY_OF_MONTH)) > 0){
            System.out.println("Days - " + (gc1.get(Calendar.DAY_OF_MONTH) +  gc.get(Calendar.DAY_OF_MONTH)));
        } else System.out.println("Days - " + Math.abs(gc1.get(Calendar.DAY_OF_MONTH) + 30  - gc.get(Calendar.DAY_OF_MONTH)) );
        if ((gc1.get(Calendar.HOUR) - gc.get(Calendar.HOUR)) > 0){
            System.out.println("Hours - " + (gc1.get(Calendar.HOUR) - gc.get(Calendar.HOUR)));
        } else System.out.println("Hours - " + Math.abs(gc1.get(Calendar.HOUR) + 24 - gc.get(Calendar.HOUR)) );
        if ((gc1.get(Calendar.MINUTE) - gc.get(Calendar.MINUTE)) > 0){
            System.out.println("Minutes - " + (gc1.get(Calendar.MINUTE) - gc.get(Calendar.MINUTE)));
        } else System.out.println("Minutes - " + Math.abs(gc1.get(Calendar.MINUTE) + 60 - gc.get(Calendar.MINUTE)) );
        if ((gc1.get(Calendar.SECOND) - gc.get(Calendar.SECOND)) > 0){
            System.out.println("Sekonds - " + (gc1.get(Calendar.SECOND) - gc.get(Calendar.SECOND)));
        } else System.out.println("Sekonds - " + Math.abs(gc1.get(Calendar.SECOND) + 60 - gc.get(Calendar.SECOND)) );

    }

    public static int input(){
        Scanner in =new Scanner(System.in);
        int temp;
        temp = in.nextInt();
        in.nextLine();
        return temp;
    }
}
