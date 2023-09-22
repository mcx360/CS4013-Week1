import java.util.Scanner;
import java.util.InputMismatchException;
public class Exercise6_21 { 

    public static String path(int slots){
        int rows=slots-1;
        String path = "";
        for(int i=0;i<rows;i++){
            int chance = (int) (Math.random()*2)+1;
            if(chance==1){
                path+="R";
            }
            else{
                path+="L";
            }
        }
        return path;
    }

    public static int countR(String inputString){
        int count=0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'R') {
                count++;
            }
        }
        return count;
    }

    public static void printGraph(int[] slots) {
        int maxBalls = getMaxBalls(slots);
        for (int i=maxBalls;i>0;i--) {
            for (int j=0;j<slots.length;j++) {
                if (slots[j]>=i) {
                    System.out.print("o ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int j=0;j<slots.length;j++) {
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int getMaxBalls(int[] slots) {
        int maxBalls = 0;
        for (int i:slots) {
            if (i>maxBalls) {
                maxBalls=i;
            }
        }
        return maxBalls;
    }

    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of balls to drop: ");
        int balls = scanner.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int slotsNum = scanner.nextInt();
        System.out.println("");
        String[] paths = new String[balls];
        int[] slots = new int[slotsNum];
        scanner.close();
        for(int i=0;i<balls;i++){
            paths[i]=path(slotsNum);
            int rNum = countR(paths[i]);
            slots[rNum] +=1;
            System.out.println(paths[i]);
        }
        
        System.out.println("");
        printGraph(slots);
    }
    catch(InputMismatchException e){
        System.out.println("Invalid input, try again.");
    }
        
    }
    

}

