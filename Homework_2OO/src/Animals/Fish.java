package Animals;
import Animals.Animal;

public class Fish extends Animal {
    public Fish(int legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("This animal eats plankton. ");
    }
}
