package collection.set.test;


import java.util.*;

public class UniqueNamesTest2 {
    /**
     * 문제2 - 중복 제거와 입력 순서 유지
     *
     * [문제 설명]
     *   여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
     *   30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
     *   단 "입력 순서대로" 출력해라.
     *     출력 예): 30, 20, 10
     */
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        /**
         * 코드 작성
         */
        // 풀이1: LinkedHashSet (입력순서 보장)
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (Integer s : inputArr) {
            linkedHashSet.add(s);
        }
        printAll(linkedHashSet);

        // 풀이2: LinkedHashSet (입력순서 보장)
        Set<Integer> linkedHashSet2 = new LinkedHashSet<>(Arrays.asList(inputArr));
        //Set<Integer> linkedHashSet2 = new LinkedHashSet<>(List.of(inputArr)); // java9 이상
        printAll(linkedHashSet2);
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
