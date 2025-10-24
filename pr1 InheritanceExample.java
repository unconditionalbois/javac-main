class Animal {
    void eat() {
        System.out.println("The animal is eating");
    }

    void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("The cat is meowing");
    }
}

public class pr1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.eat();
        myDog.sleep();
        myDog.bark();

        myCat.eat();
        myCat.sleep();
        myCat.meow();
    }
}
