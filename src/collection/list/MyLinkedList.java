package collection.list;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> first;
    private int size = 0;

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode(); // 마지막 노드 검색
            lastNode.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first; // 참조값 변경
            first = newNode;      // 신규노드 할당
        } else {
            // [중요] 이전 노드 (index - 1)를 가져온다.
            //    코드만 보고서는 이해하기 힘듦. 그림으로 봐야됨.
            Node<E> prevNode = getNode(index - 1);
            newNode.next = prevNode.next; // 신규 노드에 이전 노드가 가리키도록 할당
            prevNode.next = newNode;      // 이전노드는 신규노드 할당
        }
        size++;
    }

    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item; // 이전 노드 값
        x.item = element; // 신규 노드 값
        return oldValue;
    }

    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next; // 노드가 삭제되면 연결이 끊어지므로 다음 노드가 가리키는 참조값으로 변경
        } else {
            Node<E> prevNode = getNode(index - 1);// 이전 노드
            prevNode.next = removeNode.next;
        }
        // 초기화
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
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

    /**
     * 정적 중첩 클래스로 Node 생성
     *   - Node 클래스는 MyLinkedList에서만 사용하므로 외부에서는 사용할 이유가 없음.
     *   - 또한, 중첩 클래스를 사용하면 특정 클래스 안으로 클래스 선언을 숨길수 있다.
     * @param <E>
     */
    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while(x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
