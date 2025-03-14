public class ChessBoard {
    private Piece[][] board;

    public ChessBoard() {
        board = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        // Ustawienie pionków
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(true);
            board[6][i] = new Pawn(false);
        }

        // Ustawienie pozostałych figur
        board[0][0] = new Rook(true);
        board[0][7] = new Rook(true);
        board[7][0] = new Rook(false);
        board[7][7] = new Rook(false);

        board[0][1] = new Knight(true);
        board[0][6] = new Knight(true);
        board[7][1] = new Knight(false);
        board[7][6] = new Knight(false);

        board[0][2] = new Bishop(true);
        board[0][5] = new Bishop(true);
        board[7][2] = new Bishop(false);
        board[7][5] = new Bishop(false);

        board[0][3] = new Queen(true);
        board[7][3] = new Queen(false);

        board[0][4] = new King(true);
        board[7][4] = new King(false);
    }

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }

    public void setPiece(int x, int y, Piece piece) {
        board[x][y] = piece;
    }

    public void movePiece(int startX, int startY, int endX, int endY) {
        Piece piece = getPiece(startX, startY);
        if (piece != null && piece.isValidMove(startX, startY, endX, endY, this)) {
            setPiece(endX, endY, piece);
            setPiece(startX, startY, null);
        } else {
            System.out.println("Nieprawidłowy ruch!");
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Piece piece = getPiece(i, j);
                if (piece == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(piece + " ");
                }
            }
            System.out.println();
        }
    }
}