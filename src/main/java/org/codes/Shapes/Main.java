package org.codes.Shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(Color.BLACK, 300.4, 40.5);
        Circle cir = new Circle(Color.RED, 3.5);
        System.out.printf("Circle:\nColor: %s\nArea: %f\n", cir.getColor(), cir.area());
        System.out.printf("Rectangle:\nColor: %s\nArea: %f\n", rec.getColor(), rec.area());
    }
}
