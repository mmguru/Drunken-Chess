public class Board {
    private final int width, height, centerLat, centerLong;
    private int[][] boxes;

    public Board() {
        this(17, 9);
    }

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        centerLat = height / 2;
        centerLong = width / 2;

        boxes = new int[height][width];
        for (int i = 0; i < boxes.length; i++){
            for (int j = 0; j < boxes[0].length; j++) {
                boxes[i][j] = 0;
            }
        }
        boxes[centerLat][centerLong] = -1;
    }

    public int getPosition(int latitude, int longitude) {
        return boxes[latitude][longitude];

    }

    public void printBoard() {
        System.out.print("+");
        for(int j = 0; j < boxes[0].length; j++) System.out.print("-");
        System.out.println("+");
        for (int i = 0; i < boxes.length; i++) {
            System.out.print("|");
            for (int j = 0; j <boxes[0].length; j++){
                System.out.print(coin(boxes[i][j]));
            }
            System.out.println("|");
        }
        System.out.print("+");
        for(int j = 0; j < boxes[0].length; j++) System.out.print("-");
        System.out.println("+");
    }

    public String coin(int count) {
        if (count == -1) return "S";
        String[] coins = {" ", ".", "o", "+", "=", "B", "O", "X", "@", "%", "&", "#", "/", "^", "S", "E"};
        return coins[count];
    }

    public boolean isStart(int latitude, int longitude) {
        return (latitude == centerLat && longitude == centerLong);
    }

    public boolean isOutOfBounds(int latitude, int longitude) {
        return latitude > height || latitude < 0 || longitude > width || longitude < 0;
    }


}
