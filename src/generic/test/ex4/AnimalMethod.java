package generic.test.ex4;

import generic.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkup(T t) {
        // 컴파일 오류
        System.out.println("동물 이름: "+ t.getName());
        System.out.println("동물 크기: "+ t.getSize());
        t.sound();
    }

    // 매개변수가 2개인 이유는 비교할 대상과 원본 둘다 필요하므로
    public static <T extends Animal> T bigger(T t1, T t2) {
        return t1.getSize() > t1.getSize() ? t1 : t2;
    }
}
