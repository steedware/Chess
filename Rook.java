public class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
        return startX == endX || startY == endY;
    }

    @Override
    public String toString() {
        return isWhite() ? "R" : "r";
    }
}