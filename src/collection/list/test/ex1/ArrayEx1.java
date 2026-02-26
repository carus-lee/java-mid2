package collection.list.test.ex1;

/**
 *  문제와 풀이 1-1
 *    문제 설명
 * `    ArrayEx1` 는 배열을 사용한다. 이 코드를 배열 대신에 리스트를 사용하도록 변경하자.
 *      다음 코드와 실행 결과를 참고해서 리스트를 사용하는 `ListEx1` 클래스를 만들어라.
 */
public class ArrayEx1 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
