import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        int playerTurn = (int) (Math.random()*2) + 1;
        Player currentPlayer = (playerTurn == 1) ? player1 : player2;
        Pile.setup();
        while (Pile.getPieces() > 1) {
            currentPlayer.display();
            System.out.println("Here is the pile: ");
            Pile.display();
            boolean result = false;
            int num = 0;
            while (!result) {
                System.out.println("How many pieces do you want to remove? ");
                Scanner sc = new Scanner(System.in);
                num = Integer.parseInt(sc.nextLine());
                result = Pile.removePieces(num);
                System.out.println(!result ? "You cannot remove that much. Try again!" : "");
            }
            currentPlayer.addPoints((int) (Math.random()*5) + 1);
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        if (currentPlayer == player1) {
            System.out.println(player1.getName() + " got the bonus points!\n");
            player1.addPoints(12);
        } else {
            System.out.println(player2.getName() + " got the bonus points!\n");
            player2.addPoints(12);
        }
        System.out.println("Final scores:\n" + player1.getName() + " has " + player1.getPoints() + " points\n" + player2.getName() + " has " + player2.getPoints() + " points\n");
        if (player1.getPoints() > player2.getPoints()) {
            System.out.println(player1.getName() + " won with " + player1.getPoints() + "!");
        } else if (player2.getPoints() > player1.getPoints()) {
            System.out.println(player2.getName() + " won with " + player2.getPoints() + "!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
