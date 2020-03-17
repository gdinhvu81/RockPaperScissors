// Rock paper scissors game
import java.util.Scanner;

class RockPaperScissors{
    public static void main (String [] args){

        // Object used to read user input
        Scanner in = new Scanner(System.in);

        // Player 1's turn
        System.out.println("Player 1 goes first: Rock, Paper or Scissors?");
        // Gets player 1 input and converts it all to uppercase
        String player1 = in.nextLine().toUpperCase();
        // Loops until player1 gives a valid option
        while(true){
            if(!player1.equals("ROCK")){
                System.out.println("Invalid Option");
                player1 = in.nextLine().toUpperCase();
            }
            else break;
            if(!player1.equals("PAPER")){
                System.out.println("Invalid Option");
                player1 = in.nextLine().toUpperCase();
            }
            else break;
            if(!player1.equals("SCISSORS")){
                System.out.println("Invalid Option");
                player1 = in.nextLine().toUpperCase();
            }
            else break;
        }
        System.out.println("Player 1 chooses " + player1);

        // Player 2's turn
        System.out.println("Player 2's turn: Rock, Paper or Scissors?");
        // Gets player 2 input and converts it all to uppercase
        String player2 = in.nextLine().toUpperCase();
        // Loops until player2 gives a valid option
        while(!player2.equals("ROCK") || !player2.equals("PAPER") || !player2.equals("Scissors")){
            System.out.println("Invalid Option");
            player2 = in.nextLine().toUpperCase();
        }
        System.out.println("Player 2 chooses " + player2);

        in.close();

        // Player 1 chooses ROCK and player 2 chooses anything
        if(player1.equals("ROCK") && player2.equals("PAPER")){
            System.out.println("Player 2 Wins");
        }
        else if(player1.equals("ROCK") && player2.equals("SCISSORS")){
            System.out.println("Player 1 Wins");
        }
        // Player 1 chooses PAPER and player 2 chooses anything
        else if(player1.equals("PAPER") && player2.equals("ROCK")){
            System.out.println("Player 1 Wins");
        }
        else if(player1.equals("PAPER") && player2.equals("SCISSORS")){
            System.out.println("Player 2 Wins");
        }
        // Player 1 chooses SCISSORS and player 2 chooses anything
        else if(player1.equals("SCISSORS") && player2.equals("ROCK")){
            System.out.println("Player 2 Wins");
        }
        else if(player1.equals("SCISSORS") && player2.equals("PAPER")){
            System.out.println("Player 1 Wins");
        }  
        else{
            System.out.println("It is a tie");
        }

    }
}