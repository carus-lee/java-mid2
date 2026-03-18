package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }

    /**
     * HashSet, LinkedHashSet, TreeSet의 데이터 비교
     *
     *   HashSet      : 출력 순서를 보장 안함
     *   LinkedHashSet: 입력한 순서를 보장함.
     *   TreeSet      : 데이터 값을 기준으로 정렬한다.
     */
    private static void run(Set<String> set) {

        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        //System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() +  " ");
        }
        System.out.println();
    }
}
