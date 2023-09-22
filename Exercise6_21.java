import java.util.Scanner;
public class Exercise6_21 { 

    public static String path(int slots){

        int rows=slots;
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of balls to drop: ");
        int balls = scanner.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int slots = scanner.nextInt();
        
        for(int i=0;i<balls;i++){
            System.out.println(path(slots));
        }


    }
}
