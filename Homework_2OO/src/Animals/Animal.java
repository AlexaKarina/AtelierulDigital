package Animals;

public abstract class Animal {
    //a)
    protected int legs; //nb of legs
    //b)
    public Animal(int legs) { //constructor of class Animals.Animal that implements legs attribute
        this.legs = legs;
    }
    //c)
    public abstract void eat();//abstract class doesn't have a body

    public void walk() {
        System.out.println("This animal walks on " + legs + " legs. ");
    }
}
