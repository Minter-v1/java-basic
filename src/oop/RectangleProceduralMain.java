package oop;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle object = new Rectangle();

        System.out.println("넓이 : " + object.calculateArea());
        System.out.println("둘레 길이 : " + object.calculatePerimeter());
        System.out.println("정사각형 여부 : " + object.isSquare());
    }
}
