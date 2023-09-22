public class Exercise5_9{

    public static double footToMeter(double foot){
        return foot*0.305;
    }

    public static double meterToFoot(double meter){
        return meter*3.279;
    }
    public static void main(String[] args) {
        System.out.println("  Meters   feet");
        System.out.println("----------------");
         for(double feet=1.0;feet<11;feet++){
            System.out.printf("| %-4.2f | %.3f |%n", feet, footToMeter(feet));
        }
        System.out.println("\n");
        System.out.println("  Feet   Meeters");
        System.out.println("----------------");
        for(double meters=20.0;meters<70;meters+=5){
            System.out.printf("| %-4.2f | %.3f |%n", meters, meterToFoot(meters));
        }

    }

}