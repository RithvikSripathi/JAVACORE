public class Rectangle {

    void Area(double l, double b) {
        System.out.println("Area of the rectangle: " + l * b);
    }

    // Overloaded function to
    // calculate the area of the rectangle.
    // It takes two float parameters
    void Area(int l, int b) {
        System.out.println("Area of the rectangle: " + l * b);
    }
}
