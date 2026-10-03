interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements Chessplayer{
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements Chessplayer{
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}