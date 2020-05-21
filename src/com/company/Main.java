package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c;
        SquareX s;
        Triangle tr;
        Trapeze tz;
        Figures[] objects = new Figures[]{};

        int objCount = (int) (1 + Math.random() * 12);//количество obj
        for (int i = 0; i < objCount; i++) {
            int rnd = (int) (Math.random() * 4);
            switch (rnd) {
                case (0):
                    c = new Circle();
                    c.draw(c);
                    break;
                case (1):
                    tr = new Triangle();
                    tr.draw(tr);
                    break;
                case (2):
                    s = new SquareX();
                    s.draw(s);
                    break;
                case (3):
                    tz = new Trapeze();
                    tz.draw(tz);
                    break;
            }

        }
    }
}
