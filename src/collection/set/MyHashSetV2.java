package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    // 기본 생성자
    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashindex = hashindex(value);
        LinkedList<Object> bucket = buckets[hashindex];
        // 중복 체크
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashindex = hashindex(searchValue);
        LinkedList<Object> bucket = buckets[hashindex];
        return bucket.contains(searchValue);
    }

    public boolean remove(Object value) {
        int hashindex = hashindex(value);
        LinkedList<Object> bucket = buckets[hashindex];
        boolean isRemove = bucket.remove(value);
        if (isRemove == true) {
            size--;
            return true;
        }
        return false;
    }

    private int hashindex(Object value) {
        // Object.hashCode()는 정수형이므로 음수가 나올 수 있다.
        // 따라서 절대값으로 처리
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
