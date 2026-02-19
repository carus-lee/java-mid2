package collection.list;

import java.util.LinkedList;

public class BatchProcessorMain {

    public static void main(String[] args) {

        /**
         * 데이터를 앞에 추가할 때 각 구현체별 게산시간 (빅오 비교)
         *   MyArrayList : O(n)
         *   MyLinkedList: O(1)
         */
        //MyList<Integer> list = new MyArrayList<>(); // 구현체 지정
        MyList<Integer> list = new MyLinkedList<>(); // 구현체 지정

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);

    }
}
