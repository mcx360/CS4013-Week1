public class Exercise5_5 {

    public static void displayLargestNumber(double num1, double num2, double num3){
        double largest = num1;
        if(num2>num1){
            largest = num2;
        }
        if(num3>largest){
            largest = num3;
        }
        System.out.println(largest);

    }
    public static void main(String[] args) {
        //test program
        displayLargestNumber(10.359, 20, -66.87);
        displayLargestNumber(0, -83, 10.3);
    }
}
