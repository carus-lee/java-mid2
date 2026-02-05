package collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        // 모든 노드 탐색하기 (단순 버전)
        System.out.println("모든 노드 탐색하기 - 초기 버전");
        System.out.println("first.item = " + first.item);
        System.out.println("first.next.item = " + first.next.item);
        System.out.println("first.next.next.item = " + first.next.next.item);

        // 모든 노드 탐색하기 (개선 버전 )
        System.out.println("모든 노드 탐색하기 - 개선 버전");
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
