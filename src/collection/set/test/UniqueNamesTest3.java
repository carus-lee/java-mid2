package collection.set.test;


import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    /**
     * 문제3 - 중복 제거와 데이터 순서 유지
     *
     * [문제 설명]
     *   여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
     *   30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
     *   "데이터의 값" 순서로 출력해라.
     *     출력 예): 10, 20, 30
     */
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        /**
         * 코드 작성
         */
        // 풀이1: TreeSet (데이터 기준 순서 보장)
        Set<Integer> linkedHashSet = new TreeSet<>();
        for (Integer s : inputArr) {
            linkedHashSet.add(s);
        }
        printAll(linkedHashSet);

    }

    private static void printAll(Set<Integer> set) {
        System.out.println("set = " + set.getClass());
        // 중복 제거 후 출력
        int count = 0;
        int totalCnt = set.size();
        for (Integer s : set) {
            count++;
            System.out.print(s);
            if (count != totalCnt) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
