public class Bishop extends Piece {

    public Bishop(Board board) {
        super(board);
    }

    @Override
    public void bitToMove(String bits) {
        System.out.println(bits);
        int[] position = getPostion();
        switch(bits) {
            case "00":
                move(1,-1);
                dropCoin(position[0], position[1]);
                break;
            case "01":
                move(1,1);
                dropCoin(position[0], position[1]);
                break;
            case "10":
                move(-1, -1);
                dropCoin(position[0], position[1]);
                break;
            case "11":
                move(-1,1);
                dropCoin(position[0], position[1]);
                break;
        }
    }

    @Override
    public int[][] possibleMoves() {
        return new int[0][];
    }
}
