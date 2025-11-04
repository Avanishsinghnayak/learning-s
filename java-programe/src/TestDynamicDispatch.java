class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class TestDynamicDispatch {
    public static void main(String[] args) {
        Animal a;         // reference of Animal type

        a = new Dog();    // Dog object
        a.sound();        // calls Dog's sound()

        a = new Cat();    // Cat object
        a.sound();        // calls Cat's sound()
    }
}
