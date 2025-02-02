// Lớp Dog (Kế thừa từ Animal)
class Dog extends AnimalTest {
    public Dog(String name, int age) {
        super(name, age);  // Gọi constructor lớp cha
    }

    @Override
    public void makeSound() {
        System.out.println(name + " sủa: Gâu Gâu!");
    }
}

// Lớp Cat (Kế thừa từ Animal)
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " kêu: Meo Meo!");
    }
}

// Chương trình chính để chạy thử
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Chó Vàng", 3);
        Cat cat = new Cat("Mèo Mun", 2);

        dog.makeSound();  // Output: Chó Vàng sủa: Gâu Gâu!
        cat.makeSound();  // Output: Mèo Mun kêu: Meo Meo!
    }
}
