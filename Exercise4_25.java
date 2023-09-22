import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise4_25 {

    public static int seriesSum(int num){
        int sumNums = 0;
        if(num>0){
            for(int i=num;i>0;i--){
                sumNums+=i;
            }
            return sumNums+seriesSum(num-1);
        }
        else{
            return sumNums;
        }
}
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nth term of the sequence:");
        int nthTerm = scanner.nextInt();
        System.out.println("The sum of this sequence is: "+seriesSum(nthTerm));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input, try again.");
        }
    }
}
