package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> obj = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        /**
         * 제네릭 메서드와 와일드카드 비교
         */

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

    }
}
