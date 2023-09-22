public class Exercise6_13 {

    public static int getRandom(int[] numbers){
         int random = (int) (Math.random()* 54) +1;
        if(numbers==null){
            return random;
        }
        else{ 
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == random){
                return getRandom(numbers);
            }
        }
        return random;
    }
    }
    public static void main(String[] args) {
        /*the method will print random numbers between 1 and 54 excluding
        the numbers passed in the parameter which in this case are multiples
        of 5 
        */
        int[] nums={5,10,15,20,25,30,35,40,45,50};
        System.out.println(getRandom(nums));
    }
}
