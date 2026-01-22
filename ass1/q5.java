package Assingments.ass1;
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (!isValidDate(day, month, year)) {
            System.out.println("Invalid date.");
            return;
        }
        System.out.println("Today: " + day + "/" + month + "/" + year);

        int daysInMonth = getDaysInMonth(month, year);
        day++;
        if (day > daysInMonth) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.println("Next Date: " + day + "/" + month + "/" + year);

        sc.close();
    }

    // For leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get days in a month
    static int getDaysInMonth(int month, int year) {

        switch (month) {
            case 1:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return 0;
        }    }

    static boolean isValidDate(int day, int month, int year) {

        if (year <= 0 || month < 1 || month > 12) {
            return false;
        }

        int daysInMonth = getDaysInMonth(month, year);

        return day >= 1 && day <= daysInMonth;
    }
}
