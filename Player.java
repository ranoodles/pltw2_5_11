import java.util.Scanner;

public class Player {
    private String name;
    private int points;
    public Player() {
        System.out.println("Enter player name");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }
    public void display() {
        System.out.println(name + "\'s turn, and you have " + points + " points");
    }
    public void addPoints(int point) {
        points += point;
    }
    public int getPoints() {
        return points;
    }
    public String getName() {
        return name;
    }
}
