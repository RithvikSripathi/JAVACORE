package MultiLevelOverriding;

public class MultiLevelOverriding {
    public static void main(String[] args) {
        Grandfather grandfather = new Grandfather();
        Grandfather father = new Father();
        Grandfather son = new Son();

        grandfather.swim();
        father.swim();
        son.swim();

    }
}
