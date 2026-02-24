package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문제와 풀이 1-3
 *   문제 설명
 *     사용자에게 `n` 개의 정수를 입력받아서 `List` 에 보관하, 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
 * ==============
 * 실행 결과 예시
 * ==============
 * n개의 정수를 입력하세요 (종료 0)
 * 1
 * 2
 * 3
 * 4
 * 5
 * 0
 * 입력한 정수의 합계: 15
 * 입력한 정수의 평균: 3.0
 */
public class ListEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요. (종료: 0)");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        double avg = (double)sum / numbers.size();

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
    }

}
