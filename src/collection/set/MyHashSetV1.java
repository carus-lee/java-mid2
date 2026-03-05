package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    // 기본 생성자
    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashindex = hashindex(value);
        LinkedList<Integer> bucket = buckets[hashindex];
        // 중복 체크
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashindex = hashindex(searchValue);
        LinkedList<Integer> bucket = buckets[hashindex];
        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        int hashindex = hashindex(value);
        LinkedList<Integer> bucket = buckets[hashindex];
        // remove 메서드 2개 제공 (2번으로 사용해야 됨)
        // 1) 인덱스로 삭제하는 기능
        // 2) 값을 찾아서 삭제하는 기능
        boolean isRemove = bucket.remove(Integer.valueOf(value));
        if (isRemove == true) {
            size--;
            return true;
        }
        return false;
    }

    private int hashindex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
