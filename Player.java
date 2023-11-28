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
        System.out.println("Player Name: " + name);
    }
    public void addPoints(int point) {
        points += point;
    }
    public int getPoints() {
        return points;
    }
}
