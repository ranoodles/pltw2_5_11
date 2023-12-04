public class Pile {
    //instance variable
    private static int pieces;
    //setting up pieces with random # between 10-50
    public static void setup() {
        pieces = 10 + (int) (Math.random() * 41);
    }
    //removes num pieces from board
    public static boolean removePieces(int num) {
        if (num <= pieces / 2) {
            pieces -= num;
            return true;
        } else {
            return false;
        }
    }
    //displays the pile to user
    public static void display() {
        System.out.println("Pieces left: "+pieces);
        for (int i=0; i < pieces / 10; i++) {
            for (int j=0; j<10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k=0; k < pieces % 10; k++) {
            System.out.print("*");
        }
        System.out.println();;
    }
    //accessor - returns number of pieces on board
    public static int getPieces() {
        return pieces;
    }
}
