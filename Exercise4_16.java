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
    public static int[] primeFactors(){
        
    }
    public static void main(String[] args) {
    
    }
}