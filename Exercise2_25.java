
import java.util.Scanner;
public class Exercise2_25{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employees's name: " );
        String employeeName = scanner.nextLine();
        System.out.println("Enter number of hours worked in a week: ");
        int hoursWorked = scanner.nextInt();
        System.out.println("Enter hourly pay rate: ");
        double hourlyPayRate = scanner.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        double federalWithholdingRate = scanner.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double stateWithholdingRate = scanner.nextDouble();
        double grossPay =hoursWorked*hourlyPayRate;
        double federalWithholding = grossPay*(federalWithholdingRate/100);
        double stateWithholding = grossPay*(stateWithholdingRate/100);
        double deductions =  stateWithholding+federalWithholding;
        scanner.close();

        System.out.println("Employee name: "+employeeName);
        System.out.println("Hourse worked: "+hoursWorked);
        System.out.println("Pay Rate: " +hourlyPayRate);
        System.out.println("Gross Pay: "+(grossPay));
        System.out.println("Deductions: ");
        System.out.println("\tFederal withholding ("+federalWithholdingRate+"): "+federalWithholding);
        System.out.println("\tState withholding ("+stateWithholdingRate+"): "+stateWithholding);
        System.out.println("\tTotal Deduction: "+deductions);
        System.out.println("Net Pay: "+(grossPay-deductions));
        
        


    }
}