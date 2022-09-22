package Overloading;

public class OverloadingDriver {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.Area(30, 20);
        rectangle.Area(12.5, 4.5);

        Square obj2 = new Square();

        obj2.Area(20);
        obj2.Area(5.2);


    }


}