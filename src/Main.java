public class Main {
    public static void main(String args[]) {
        Board board = new Board();

        board.printBoard();

        Bishop bishop = new Bishop(board);
        bishop.moveSequence("hi");

        board.printBoard();

    }
}
