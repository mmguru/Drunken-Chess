

public abstract class Piece {
    public Piece(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private int latitude, longitude;
    public abstract void bitToMove(String bits);
    public abstract int[][] possibleMoves();
    public abstract int[][] getPosition();
    public abstract void setPosition(int latitude, int longitude);
    public String convertToBinaryString(String string) {
        String outString = "";
        for (int i = 0; i < string.length(); i++) {
            outString += Integer.toBinaryString((int) string.charAt(i));
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
}
