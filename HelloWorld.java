public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test the Person class
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.displayInfo();
    }
}
 

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method
        myDog.bark(); // Subclass method
    }
}