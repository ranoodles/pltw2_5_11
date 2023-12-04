import java.util.Scanner;

public class AutoPlayer extends Player {
    //initialize AutoPlayer as Player with name = bot
    public AutoPlayer() {
        super("bot");
    }
    //removes a random number of pieces from Pile
    public void remove() {
        int num = (int) (Math.random() * (Pile.getPieces()/2)) + 1;
        Pile.removePieces(num);
        System.out.println("Bot removed " + num + "\n");
    }
}
