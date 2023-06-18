package task3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.println("Enter year");
        int year = input();
        System.out.println("Enter number of month");
        int month = input();
        System.out.println("Enter day");
        int day = input();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(Calendar.YEAR, year);
        gregorianCalendar.set(Calendar.MONTH, month - 1);
        gregorianCalendar.set(Calendar.DAY_OF_MONTH, day);
        System.out.println("Date:\n" + gregorianCalendar.getTime());
        tillNow(gregorianCalendar);
    }

    public static void tillNow(GregorianCalendar gc){
        GregorianCalendar gc1 = new GregorianCalendar();
        System.out.println("Year - " + (gc1.get(Calendar.YEAR) - gc.get(Calendar.YEAR)));
        if ((gc1.get(Calendar.MONTH) - gc.get(Calendar.MONTH)) > 0){
            System.out.println("Month - " + (gc1.get(Calendar.MONTH) - gc.get(Calendar.MONTH)));
        } else System.out.println("Month - " + Math.abs(gc1.get(Calendar.MONTH) + 12 - gc.get(Calendar.MONTH)) );
        if ((gc1.get(Calendar.DAY_OF_MONTH) - gc.get(Calendar.DAY_OF_MONTH)) > 0){
            System.out.println("Days - " + (gc1.get(Calendar.DAY_OF_MONTH) +  gc.get(Calendar.DAY_OF_MONTH)));
        } else System.out.println("Days - " + Math.abs(gc1.get(Calendar.DAY_OF_MONTH) + 30  - gc.get(Calendar.DAY_OF_MONTH)) );
    }

    public static int input(){
        Scanner in =new Scanner(System.in);
        int temp;
        temp = in.nextInt();
        in.nextLine();
        return temp;
    }
}
