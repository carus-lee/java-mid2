package generic.ex4;

public class MethodMain1 {
    public static void main (String[] args) {
        Integer i = 10;
        GenericMethod.genericMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>numberMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
        // GenericMethod.<String>numberMethod("Hello"); // 컴파일오류 --> 상한 제한으로 Number의 자식만 올 수 있다.

        // 타입 추론, 타입 인자 생략 가능 (상단 코드와 비교)
        System.out.println("타입 추론");
        Integer result1 = GenericMethod.numberMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.0);
    }
}
