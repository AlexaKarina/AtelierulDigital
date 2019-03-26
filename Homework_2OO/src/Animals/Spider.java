package Animals;
import Animals.Animal;

public class Spider extends Animal {

    public Spider(int legs) { //constructor calling the superclass constructor
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("This animal eats mosquitoes. ");
    }
}
