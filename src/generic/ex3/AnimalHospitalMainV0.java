package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 개병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개병원에 고양이 전달
        // dogHospital.set(cat); // 컴파일 오류 (다른타입 입력)

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("bigger Dog = "+ biggerDog);
    }

}
