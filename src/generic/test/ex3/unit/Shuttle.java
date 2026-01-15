package generic.test.ex3.unit;

/**
 * 문제풀이 2의 해법
 *  - 자세한 내용은 ShuttleTest.java 주석 확인
 * @param <T>
 */
public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in (T t) {
        this.unit = t;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
}
