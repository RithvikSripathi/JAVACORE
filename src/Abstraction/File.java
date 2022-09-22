package Abstraction;

public abstract class File {
    void open() {
        System.out.println("File opened successfully ");
    }

    void read() {
        System.out.println("File read successfully");
    }

    abstract void produce_report();

}