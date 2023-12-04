import java.util.Scanner;

public class Player {
    private String name;
    private int points;
    public Player() {
        System.out.println("Enter player name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println();
    }
    public Player(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println(name + "\'s turn with " + points + " points");
    }
    public void addPoints(int point) {
        points += point;
    }
    public void addPoints() {
        points += (int) (Math.random()*5) + 1;
    }
    public int getPoints() {
        return points;
    }
    public String getName() {
        return name;
    }
    public void remove() {
        Scanner sc = new Scanner(System.in);
        boolean result = false;
        while (!result) {
            System.out.println("How many pieces do you want to remove? ");
            try {
                int num = Integer.parseInt(sc.next());
                if (num <= 0) result = false; else result = Pile.removePieces(num);
            } catch (Exception e) {
                result = false;
            }
            System.out.println(!result ? "You cannot remove that much or your input was invalid. Try again!" : "");
        }
    }
}
