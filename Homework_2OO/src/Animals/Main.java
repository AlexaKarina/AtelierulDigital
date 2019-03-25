package Animals;

public class Main {

    public static void main(String[] args) {
        Fish d = new Fish(0);
        Cat c = new Cat(4,"Fluffy");
        Animal a = new Fish(0);
        Animal e = new Spider(0);
        Pet p = new Cat(4,"Kitty");

        d.eat();
        d.walk();

        c.eat();
        c.play();
        c.walk();

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        ((Cat) p).eat();
        ((Cat) p).walk();
        p.play();

    }
}
