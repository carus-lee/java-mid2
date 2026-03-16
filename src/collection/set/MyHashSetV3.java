package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    // 기본 생성자
    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    @Override
    public boolean add(E value) {
        int hashindex = hashindex(value);
        LinkedList<E> bucket = buckets[hashindex];
        // 중복 체크
        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    @Override
    public boolean contains(E searchValue) {
        int hashindex = hashindex(searchValue);
        LinkedList<E> bucket = buckets[hashindex];
        return bucket.contains(searchValue);
    }

    @Override
    public boolean remove(E value) {
        int hashindex = hashindex(value);
        LinkedList<E> bucket = buckets[hashindex];
        boolean isRemove = bucket.remove(value);
        if (isRemove == true) {
            size--;
            return true;
        }
        return false;
    }

    private int hashindex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}