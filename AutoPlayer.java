import java.util.Scanner;

public class AutoPlayer extends Player {
    public AutoPlayer() {
        super("bot");
    }
    public void remove() {
        int num = (int) (Math.random() * (Pile.getPieces()/2)) + 1;
        Pile.removePieces(num);
        System.out.println("Bot removed " + num + "\n");
    }
}
