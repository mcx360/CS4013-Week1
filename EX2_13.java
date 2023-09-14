import java.util.Scanner;
public class EX2_13{
    public static void main(String[] args){
        Scanner moneyInput = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        float money = moneyInput.nextFloat();
        System.out.println("ok");
        moneyInput.close();
    }
}