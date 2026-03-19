package collection.set.test;


import java.util.*;

public class UniqueNamesTest1 {
    /**
     * 문제1 - 중복 제거
     *
     * [문제 설명]
     *   여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
     *   30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다. 출력 순서는 관계없다.
     *     출력 예): 30, 20, 10 또는 10, 20, 30 또는 20, 10, 30등과 같이 출력 순서는 관계 없다.
     */
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        /**
         * 코드 작성
         */
        // 풀이1: HashSet
        Set<Integer> hashSet = new HashSet<>();
        for (Integer s : inputArr) {
            hashSet.add(s);
        }
        printAll(hashSet);

        // 풀이2: LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (Integer s : inputArr) {
            linkedHashSet.add(s);
        }
        printAll(linkedHashSet);

        // 풀이2: TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        for (Integer s : inputArr) {
            treeSet.add(s);
        }
        printAll(treeSet);
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
