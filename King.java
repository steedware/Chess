public class King extends Piece {
    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
        int dx = Math.abs(startX - endX);
        int dy = Math.abs(startY - endY);
        return dx <= 1 && dy <= 1;
    }

    @Override
    public String toString() {
        return isWhite() ? "K" : "k";
    }
}