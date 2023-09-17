import java.util.Scanner;
public class Exercise3_17{
    public static void main(String[] args){
        Scanner gameScanner = new Scanner(System.in);
        System.out.println("scissor (0), rock(1), paper(2): ");
        int PlayergameScenario = gameScanner.nextInt();
        String player="";
        switch(PlayergameScenario){
        case 0:
            player = "scissors";
            break;
        case 1:
            player = "rock";
            break;
        case 2:
            player = "paper";
            break;
        }
        gameScanner.close();


        int computerGameScenario = (int) (Math.random() * 3);
        String computer="";
        switch(computerGameScenario){
        case 0:
            computer = "scissors";
            break;
        case 1:
            computer = "rock";
            break;
        case 2:
            computer = "paper";
            break;
        }


        String result;
        if(computer==player){
            result="It is a draw.";
        }
        else if(computer=="rock"&&player=="scissors"){
            result="Computer Won.";
        }
        else if(computer=="paper"&&player=="rock"){
            result="Computer Won.";
        }
        else if(computer=="scissors"&&player=="paper"){
            result = "Computer won.";
        }
        else{
            result = "You won.";
        }

        System.out.println("The computer is "+computer+". You are "+player+". "+result);
        
    }
}