public class Queen extends Piece {
    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
        return startX == endX || startY == endY || Math.abs(startX - endX) == Math.abs(startY - endY);
    }

    @Override
    public String toString() {
        return isWhite() ? "Q" : "q";
    }
}