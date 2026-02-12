package collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode(); // 마지막 노드 검색
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // 추가 코드
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        if (index == 0) {
            newNode.next = first; // 참조값 변경
            first = newNode;      // 신규노드 할당
        } else {
            // [중요] 이전 노드 (index - 1)를 가져온다.
            //    코드만 보고서는 이해하기 힘듦. 그림으로 봐야됨.
            Node prevNode = getNode(index - 1);
            newNode.next = prevNode.next; // 신규 노드에 이전 노드가 가리키도록 할당
            prevNode.next = newNode;      // 이전노드는 신규노드 할당
        }
        size++;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item; // 이전 노드 값
        x.item = element; // 신규 노드 값
        return oldValue;
    }

    // 추가 코드
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next; // 노드가 삭제되면 연결이 끊어지므로 다음 노드가 가리키는 참조값으로 변경
        } else {
            Node prevNode = getNode(index - 1);// 이전 노드
            prevNode.next = removeNode.next;
        }
        // 초기화
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
