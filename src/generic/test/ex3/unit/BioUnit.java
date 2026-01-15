package generic.test.ex3.unit;

/**
 * 문제와 풀이
 *   BioUnit은 유닛들의 부모 클래스이다.
 *   BioUnit의 자식 클래스로 Marine, Zealot, Zergling이 있다.
 *
 */
public class BioUnit {

    private String name;
    private int hp;

    public BioUnit(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "BioUnit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
