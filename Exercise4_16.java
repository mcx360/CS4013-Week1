import java.util.ArrayList;
import java.util.Arrays;
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
        int pos=0;
        for(int i=1;i<num/2;i++){
            if(num%i==0 & isPrime(i)==true){
                primeFactors.add(i);
                pos++;
            }
        }
        return primeFactors;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("The prime factors of the number are: "+primeFactors(number));
    }
}