public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
        int direction = isWhite() ? 1 : -1;
        if (startX + direction == endX && startY == endY && board.getPiece(endX, endY) == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return isWhite() ? "P" : "p";
    }
}