import java.util.Scanner;

public class GameRunner {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "y";
        //outer while loop for repeating game
        while (play.toLowerCase().equals("y")) {
            //setup
            System.out.println("Would you like to play by yourself? (y/n)");
            boolean autoplay = sc.next().toLowerCase().equals("y");
            Player player1 = new Player();
            Player player2 = autoplay ? new AutoPlayer() : new Player();
            int playerTurn = (int) (Math.random()*2) + 1;
            Player currentPlayer = (playerTurn == 1) ? player1 : player2;
            Pile.setup();
            //plays game until pieces ≤ 1
            while (Pile.getPieces() > 1) {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
                currentPlayer.display();
                System.out.println("Here is the pile: ");
                Pile.display();
                currentPlayer.remove();
                currentPlayer.addPoints();
            }
            //decides bonus pts
            if (currentPlayer == player1) {
                System.out.println(player1.getName() + " got the 10 bonus points!\n");
                player1.addPoints(10);
            } else {
                System.out.println(player2.getName() + " got the 10 bonus points!\n");
                player2.addPoints(10);
            }
            //reports final score and winners
            System.out.println("Final scores:\n" + player1.getName() + " has " + player1.getPoints() + " points\n" + player2.getName() + " has " + player2.getPoints() + " points\n");
            if (player1.getPoints() > player2.getPoints()) {
                System.out.println(player1.getName() + " won with " + player1.getPoints() + "!\n");
            } else if (player2.getPoints() > player1.getPoints()) {
                System.out.println(player2.getName() + " won with " + player2.getPoints() + "!\n");
            } else {
                System.out.println("It's a draw!\n");
            }
            //repeats game
            System.out.println("Would you like to play again? (y/n)");
            play = sc.next();
            System.out.println();
        }
    }
}
