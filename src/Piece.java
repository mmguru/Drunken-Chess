

public abstract class Piece {
    private int latitude, longitude;
    Board board;
    public Piece(Board board) {
        this.board = board;
        this.latitude = board.startingPosition()[0];
        this.longitude = board.startingPosition()[1];
    }


    public abstract void bitToMove(String bits);
    public abstract int[][] possibleMoves();
    public abstract int[][] getPosition();
    public abstract void setPosition(int latitude, int longitude);
    public String convertToBinaryString(String string) {
        String outString = "";
        for (int i = 0; i < string.length(); i++) {
            outString += Integer.toBinaryString((int) string.charAt(i));
            System.out.println(outString);
        }
        return outString;
    }

    public void moveSequence(String string) {
        String binaryString = convertToBinaryString(string);
        if (binaryString.length() %2 != 0) binaryString = "0" + binaryString;

        for (int i = 0; i < binaryString.length(); i+=2) {
            bitToMove(binaryString.substring(i, i+2));
        }
    }

    public void dropCoin(int latitude, int longitude) {
        board.addCoin(latitude, longitude);
    }

    public void move(int vertical, int horizontal) {
        latitude += vertical;
        latitude += horizontal;
    }
}
