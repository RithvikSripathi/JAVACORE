package Overloading;

class Square {

    void Area(int side) {
        System.out.println("Area of the Overloading.OverloadingDriver.Square: " + side * side);
    }

    void Area(double side) {
        System.out.println("Area of the Overloading.OverloadingDriver.Square: " + side * side);
    }

    void Area(float side) {
        System.out.println("Area of the Overloading.OverloadingDriver.Square: " + side * side);
    }
}