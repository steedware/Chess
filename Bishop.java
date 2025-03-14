public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
        return Math.abs(startX - endX) == Math.abs(startY - endY);
    }

    @Override
    public String toString() {
        return isWhite() ? "B" : "b";
    }
}