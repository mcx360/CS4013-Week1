import java.util.Arrays;
import java.util.Scanner;
public class Exercise7_1 {

    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for(int i=0;i<m.length;i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        double[][] matrix =new double[3][4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 by 4 matrix row by row:");
        System.out.println("Use format: XX XX XX XX e.g 1 13 22 100");
        String lineOne = scanner.nextLine();
        String lineTwo = scanner.nextLine();
        String lineThree = scanner.nextLine();
        System.out.println("ok");
        
        String[] partOne = lineOne.split(" ");
        String[] partTwo = lineTwo.split(" ");
        String[] partThree = lineThree.split(" ");
             
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                //matrix[i][j]= //Integer.parseInt();
                if(i==0){
                    matrix[i][j]= Integer.parseInt(partOne[j]);
                }
                if(i==1){
                    matrix[i][j]=Integer.parseInt(partTwo[j]);
                }
                if(i==2){
                    matrix[i][j]=Integer.parseInt(partThree[j]);
                }
            }
        }
        ;
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Sum of the elements at column 0 is "+ sumColumn(matrix, 0));
        System.out.println("Sum of the elements at column 1 is "+ sumColumn(matrix, 1));
        System.out.println("Sum of the elements at column 2 is "+ sumColumn(matrix, 2));
        System.out.println("Sum of the elements at column 3 is "+ sumColumn(matrix, 3));
        
    }
}
