import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of balls to drop: ");
        int balls = scanner.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int slotsNum = scanner.nextInt();
        System.out.println("");
        String[] paths = new String[balls];
        int[] slots = new int[slotsNum];
        for(int i=0;i<balls;i++){
            paths[i]=path(slotsNum);
            int rNum = countR(paths[i]);
            slots[rNum] +=1;
            System.out.println(paths[i]);
        }
        
        for(int i=0;i<slots.length;i++){
            System.out.println(slots[i]);
        }

    }


    }

