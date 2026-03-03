package collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{ 1, 2, 5, 8, 14, 99 }
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        //검색
        int searchValue = 14;
        Integer hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex);
        int result = inputArray[hashIndex]; // O(1)
        System.out.println(result);
    }

    /**
     * 데이터 저장
     *   1) value의 해시 인덱스를 구한다.
     *   2) 해시 인덱스의 위치에 데이터를 저장한다.
     * @param inputArray
     * @param value
     */
    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    // 해시 인덱스 조회 (나머지 연산)
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
