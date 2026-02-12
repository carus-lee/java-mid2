package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        // 마지막에 추가 - O(n): 마지막 위치까지 찾아가야 되니까
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("첫번째 항목에 추가");
        list.add(0, "d"); // O(1)
        System.out.println(list);

        System.out.println("첫번째 항목을 삭제");
        list.remove(0); // remove First - O(1)
        System.out.println(list);

        System.out.println("중간 항목에 추가");
        list.add(1, "e"); // O(n)
        System.out.println(list);

        System.out.println("중간 항목을 삭제");
        list.remove(1); // O(n)
        System.out.println(list);
    }
}
