public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();
        a.sleep();

        Cat c = new Cat();
        c.eat();
        c.sleep();

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();

        Tiger t = new Tiger();
        t.eat();
        t.sleep();
        t.growl();

        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.bark();

        Elephant e = new Elephant();
        e.eat();
        e.sleep();
        e.stump();
    }
}
