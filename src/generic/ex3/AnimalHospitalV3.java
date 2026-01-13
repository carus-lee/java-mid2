package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { // 타입 매개변수에 상한(Animal)을 지정하여 Animal의 기능을 사용할 수 있다.

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // 컴파일 오류
        System.out.println("동물 이름: "+ animal.getName());
        System.out.println("동물 크기: "+ animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}