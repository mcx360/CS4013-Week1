import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise3_21 {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: (e.g., 2012): ");
        int year = scanner.nextInt();
        System.out.println("Enter month: 1-12: ");
        int month = scanner.nextInt();
        if(month == 1){
            month = 13;
        }
        if(month == 2){
            month = 14;
        }
        System.out.println("Enter the day of the month: 1-31: ");
        int Monthday = scanner.nextInt();
        scanner.close();
        
        int dayOfWeek;
        dayOfWeek=(Monthday+((26*(month+1))/10)+(year%100)+((year%100)/4)+((year/100)/4)+(5*(year/100)))%7;
        String day="";
        switch(dayOfWeek){
        case 0:
            day="Saturday";
            break;
        case 1:
            day="Sunday";
            break;
        case 2:
            day="Monday";
        case 3:
            day="Tuesday";
            break;
        case 4:
            day="Wednesday";
            break;
        case 5:
            day="Thursday";
            break;
        case 6:
            day="Friday";
            break;
        }
        
        System.out.println("Day of the week is " +day);
    }
    catch(InputMismatchException e){
        System.out.println("Invalid input, try again.");
    }

    }  
}
