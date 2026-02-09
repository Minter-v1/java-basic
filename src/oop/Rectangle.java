package oop;

public class Rectangle {
    int width = 5;
    int height = 8;

    // 넓이 연산
    int calculateArea() {
        return width * height;
    }

    // 둘레 연산
     int calculatePerimeter() {
        return (width*2) + (height*2);
    }

    // 정사각형 여부
    boolean isSquare() {
        return width == height;
    }
}
