public class Bishop extends Piece {
    int latitude, longitude;
    Board board;

    public Bishop(Board board) {
        super(board, board.startingPosition()[0], board.startingPosition()[1]);
    }

    @Override
    public void bitToMove(String bits) {
        System.out.println(bits);
        switch(bits) {
            case "00":
                move(1,-1);
                dropCoin(latitude, longitude);
                break;
            case "01":
                move(1,1);
                dropCoin(latitude, longitude);
                break;
            case "10":
                move(-1, -1);
                dropCoin(latitude, longitude);
                break;
            case "11":
                move(-1,1);
                dropCoin(latitude, longitude);
                break;
        }
    }

    public void move(int vertical, int horizontal) {
        latitude += vertical;
        latitude += horizontal;
    }

    @Override
    public int[][] possibleMoves() {
        return new int[0][];
    }

    @Override
    public int[][] getPosition() {
        return new int[latitude][longitude];
    }

    @Override
    public void setPosition(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
