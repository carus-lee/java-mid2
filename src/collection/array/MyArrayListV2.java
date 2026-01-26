package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    // 코드 추가 (기존배열 복사 및 배열크기 조정)
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
/*
        // 배열을 새로 만들고 기존 배열을 새로운 배열에 복사
        Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
        // 새로운 배열로 참조 변경
        elementData = newArr;
*/
        // 상기 코드를 메서드로 제공해준다.
        elementData = Arrays.copyOf(elementData, newCapacity);
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
