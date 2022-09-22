package Abstraction;

public class Turtle extends Animal implements Swims {

    @Override
    void shout() {
        System.out.println("Beck");
    }


    @Override
    public boolean swims() {
        return true;
    }
}