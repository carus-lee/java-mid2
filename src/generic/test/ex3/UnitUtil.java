package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

/**
 * 문제풀이 1의 해법 -
 *   - 자세한 내용은 UnitUtilTest.java 주석 확인
 */
public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T t1, T t2) {
        if (t1.getHp() > t2.getHp()) {
            return t1;
        } else {
            return t2;
        }
    }
}
