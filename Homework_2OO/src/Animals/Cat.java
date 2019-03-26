package Animals;
import Animals.Animal;

public class Cat<string> extends Animal implements Pet{

    public string name;

    public Cat(int legs, string name) {
        super(legs);
        this.name = name;
    }

    /*public cat(){
    }
    */

    //implement Pet interface methods
    @Override
    public void getName() {
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public void play() {
        System.out.println("This animal plays with toys. ");
    }

    //implement Animal abstract method
    @Override
    public void eat() {
        System.out.println("This animal eats meat. ");
    }
}
