package Fight;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Ionut", 15f, 4.5f);
        Fighter fighter2 = new Fighter("Alin", 12f, 5f);

        BoxingMatch arena = new BoxingMatch();
        arena.attack(fighter1,fighter2);
    }
}

