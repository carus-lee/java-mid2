package generic.test.ex4;

public class GenericMethod {
    public static Object objMethod(Object t) {
        System.out.println("Object print: " + t);
        return t;
    }

    // 제네릭 메서드 기본
    public static <T> T genericMethod(T t) {
        System.out.println("Generic print: " + t);
        return t;
    }

    // 제네릭 메서드 상한(Number) 제한
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
