package OOP;

// Lớp Animal (Lớp cha)
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " phát ra âm thanh.");
    }
}

// Lớp Dog (Kế thừa từ Animal)
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " sủa: Gâu gâu!");
    }
}

// Lớp Cat (Kế thừa từ Animal)
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " kêu: Meo meo!");
    }
}

// Lớp Main
public class AnimalManager {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Kitty", 2);

        dog.makeSound();  // Output: Buddy sủa: Gâu gâu!
        cat.makeSound();  // Output: Kitty kêu: Meo meo!
    }
}
