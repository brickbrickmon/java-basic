package oop1;

public class RectangleOopMain {

    static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 10;

        rectangle.isSquare();
        rectangle.calculatePerimeter();
        rectangle.calculateArea();

    }
}
