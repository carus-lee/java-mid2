package collection.set;

import collection.set.member.Member;

public class MyHashSetV3Main {

    public static void main(String[] args) {
        /**
         * set1
         */
        MySet<String> set1 = new MyHashSetV3<>(10);
        set1.add("A");
        set1.add("B");
        set1.add("C");
        System.out.println(set1);

        //검색
        String searchValue1 = "A";
        System.out.println("set1.contains(" + searchValue1 + ") = " + set1.contains(searchValue1));

        //제거
        System.out.println("set1.remove(C) = " + set1.remove("C"));
        System.out.println(set1);
        System.out.println("========================================================================");

        /**
         * 2. set2
         */
        MySet<Member> set2 = new MyHashSetV3<>();
        Member m1 = new Member("memberA");
        Member m2 = new Member("memberB");

        set2.add(m1);
        set2.add(m2);
        System.out.println(set2);

        // 검색
        Member searchValue2 = new Member("memberA");
        System.out.println("set2.contains(" + searchValue2 + ") = " + set2.contains(searchValue2));

        // 제거
        System.out.println("set2.remove('memberB') = " + set2.remove(m2));
        System.out.println(set2);
    }
}
