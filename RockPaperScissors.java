// Rock paper scissors game
import java.util.Scanner;

class RockPaperScissors{
    public static void main (String [] args){
        Boolean validMove = true;

        // Object used to read user input
        Scanner in = new Scanner(System.in);
        // Player 1's turn
        System.out.println("Player 1 goes first: Rock, Paper or Scissors?");
        // Gets player 1 input and converts it all to uppercase
        String player1 = in.nextLine().toUpperCase();

        // Loops until player1 gives a valid option
        do{
            // Makes sure player1 chooses one of the three options
            if(player1.equals("ROCK") || player1.equals("PAPER") || player1.equals("SCISSORS")){
                System.out.println("Player 1 chooses " + player1);
                validMove = false;
            }
            // Reprompts player1 for a valid option
            else{
                System.out.println("Invalid Option. Try Again.");
                player1 = in.nextLine().toUpperCase();
                validMove = true;
            }
        }while(validMove);

        // Player 2's turn
        System.out.println("Player 2's turn: Rock, Paper or Scissors?");
        // Gets player 2 input and converts it all to uppercase
        String player2 = in.nextLine().toUpperCase();

        // Loops until player2 gives a valid option
        do{
            // Makes sure player2 chooses one of the three options
            if(player2.equals("ROCK") || player2.equals("PAPER") || player2.equals("SCISSORS")){
                System.out.println("Player 2 chooses " + player2);
                validMove = false;
            }
            // Reprompts player2 for a valid option
            else{
                System.out.println("Invalid Option. Try Again.");
                player2 = in.nextLine().toUpperCase();
                validMove = true;
            }
        }while(validMove);

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

        // Closes Scanner object
        in.close();

    }
}