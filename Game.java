import java.util.Scanner;

public class Game {
    private ChessBoard board;
    private boolean isWhiteTurn;

    public Game() {
        board = new ChessBoard();
        isWhiteTurn = true;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            board.displayBoard();
            System.out.println((isWhiteTurn ? "Białe" : "Czarne") + " ruch:");
            System.out.print("Podaj pozycję początkową (x y): ");
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            System.out.print("Podaj pozycję końcową (x y): ");
            int endX = scanner.nextInt();
            int endY = scanner.nextInt();

            board.movePiece(startX, startY, endX, endY);
            isWhiteTurn = !isWhiteTurn;
        }
    }
}