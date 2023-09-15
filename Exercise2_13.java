import java.util.Scanner;
public class Exercise2_13{
    public static void main(String[] args){
        Scanner moneyInput = new Scanner(System.in);
        double money = 0;
        boolean validInput=false;
        while(!validInput){
            try{
                System.out.println("Enter the monthly saving amount:");
                money = moneyInput.nextDouble();
                validInput = true;
                money = Math.floor(money *100.0) /100.0;
            }catch (java.util.InputMismatchException e){
                System.out.println("Invalid input, try again");
                moneyInput.nextLine();
            }
        }          
        moneyInput.close();
        double result = 0;
        for (int i = 0; i < 6; i++){
            result = (result+money) * (1+0.00417);
        } 
        System.out.printf("After the sixth month, the account value is: $"+"%.2f", result);
    }
}