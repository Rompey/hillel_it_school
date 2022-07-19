package homework_6.exeption_fix;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static class Ball {
    }

     static class Board {
        private List balls;

        public Board() {
            balls = new ArrayList<>();
            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
        }

        public int count() {
            return balls.size();
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.count());
    }
}
