package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    // 1-1. 제네릭 메서드 (O)
    // Box<Dog> dogBox를 전달한다. 타입 추론에 의해 타입 T가 Dog가 된다. (WildcardMain1에서 호출하는 로직 참고)
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 1-2. 제네릭 메서드 (X)
    // Box<Dog> dogBox를 전달한다. 와일드카드 ?는 모든 타입을 받을 수 있다.
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    // 2-1. 제네릭 메서드 (O)
    // 상한선(Animal) 지정하여 Animal 기능 사용
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = "+ t.getName());
    }

    // 2-2. 제네릭 메서드 (X)
    // 와일드카드 상한 제한 (Animal)
    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = "+ animal.getName());
    }

    // 3-1. 제네릭 메서드 (O)
    // 상기 2-1과 동일하나 반환 타입 T 추가
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = "+ t.getName());
        return t;
    }

    // 3-2. 제네릭 메서드 (X)
    // 와일드카드로 상한 제한(Animal) 및 반환
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = "+ animal.getName());
        return animal;
    }
}
