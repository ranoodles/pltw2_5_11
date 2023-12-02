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
}
