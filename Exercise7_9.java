import java.util.Scanner;
public class Exercise7_9{

    public static void printBoard(char[][] board){

        System.out.println("-------");
        System.out.println("|"+board[0][0]+"|"+board[0][1]+"|"+board[0][2]+"|");
        System.out.println("-------");
        System.out.println("|"+board[1][0]+"|"+board[1][1]+"|"+board[1][2]+"|");
        System.out.println("-------");
        System.out.println("|"+board[2][0]+"|"+board[2][1]+"|"+board[2][2]+"|");
        System.out.println("-------");
        


    }
    public static void main(String[] args) {
        boolean gameOver=false;
    
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]= ' ';
            }
        }
        while(gameOver==false){
        int freeRow = 0;
        int freeCol = 0;
        int RandomCol = (int) (Math.random()*2)+1;
        int RandomRow = (int) (Math.random()*2)+1;
        System.out.println("Enter row Index:");
        int row = scanner.nextInt();
        System.out.println("Enter column Index:");
        int col = scanner.nextInt();

        if (board[row][col]== ' '){
            board[row][col]= 'X';
        }
        if(board[RandomRow][RandomCol]==' '){
            board[RandomRow][RandomCol]='O';
        }
        else{
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board.length;j++){
                    if(board[i][j]==' '){
                        freeRow = i;
                        freeCol = j;
                    }
                }
            }
            board[freeRow][freeCol] = 'O';
            
        }
        printBoard(board);

        }
    }
}
