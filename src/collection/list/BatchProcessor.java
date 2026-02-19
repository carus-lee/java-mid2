package collection.list;

public class BatchProcessor {

    // 구체 클래스에 의존
    //   MyArrayList 클래스를 MyLinkedList를 변경하려면 소스를 수정해야 됨.
    //private final MyArrayList<Integer> list = new MyArrayList<>(); // 코드 변경 (아래)
    private final MyList<Integer> list;

    /**
     * 생성자를 통해 의존관계 주입
     *   MyList: MyArrayList 주입 가능
     *   MyList: MyLinkedList 주입 가능
     */
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); // 앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
