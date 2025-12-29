package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2 dogHospital = new AnimalHospitalV2();
        AnimalHospitalV2 catHospital = new AnimalHospitalV2();
        AnimalHospitalV2 integerHospital = new AnimalHospitalV2();
        integerHospital.set(11); // 타입매개변수가 모든타입을 허용하므로 전혀 상관없는 객체가 넘어올수 있다.

    }
}
