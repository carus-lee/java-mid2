package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        // 제네릭 타입은 Dog
        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        // 제네릭 메서드에는 Cat
        Cat cat1 = hospital.printAndRetrun(cat);
        System.out.println("cat1 = "+ cat1);
    }
}
