package oop1;

public class Rectangle {

    int width;
    int height;

    void calculateArea() {
        System.out.println("넓이: "+ (width*height));
    }

    void calculatePerimeter() {
        System.out.println("둘레 길이: "+(width+height)*2);
    }

    void isSquare() {
        if (width == height) {
            System.out.println("정사각형입니다.");
        } else {
            System.out.println("정사각형이 아닙니다.");
        }
    }
}
