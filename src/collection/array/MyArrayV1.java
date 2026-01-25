package collection.array;

import java.util.Arrays;

public class MyArrayV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue; // 이전값 반환
    }

    // 요소 검색
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1; // 없을 때 반환값
    }

    public String toString() {
        // [1,2,3,null,null] // size=3
        // [1,2,3] // size=3
        // Arrays.copyOf ==> 배열에서 size만큼만 출력
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size=" + size + ", capacity=" + elementData.length;
    }
}
