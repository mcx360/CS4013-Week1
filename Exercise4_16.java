import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4_16{
    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        else if(num==2){
            return true;
        }
        else{
            int factors = 0;
            for(int i=1;i<num+1;i++){

                if(num%i==0){
                    factors++;
                }
                if(factors>2){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static ArrayList<Integer> primeFactors(int num){
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        for(int i=1;i<num/2;i++){
            if(num%i==0 & isPrime(i)==true){
                primeFactors.add(i);
            }
        }
        return primeFactors;
    }
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("The prime factors of the number are: "+primeFactors(number));
        }catch(InputMismatchException e){
            System.out.println("Invalid input, try again.");
        }
    }
}