package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        //중복 등록
        MyHashSetV2 set = new MyHashSetV2();
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1)); // m1 참조값
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2)); // m2 참조값

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("set.contains(" + searchValue + ") = " + set.contains(searchValue));
    }
}
