public class Exercise4_25 {

    public static int seriesSum(int num){
        int sum =0;
        for(int i=num;i>0;i--){
            sum += i;
        }
        num--;
        seriesSum(num);
    }
    public static void main(String[] args) {
        
    }
}
