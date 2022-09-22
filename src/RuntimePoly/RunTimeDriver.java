package RuntimePoly;

public class RunTimeDriver {
    public static void main(String[] args) {
        Animal herbivores = new Herbivores();
        Animal carnivores = new Carnivores();
        Animal omnivores = new Omnivores();

        herbivores.eat();
        carnivores.eat();
        omnivores.eat();
    }
}