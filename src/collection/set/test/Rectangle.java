package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/**
 * 문제5 - Equals, HashCode
 *
 * [문제 설명]
 *   `RectangleTest` 실행 결과를 참고해서 다음 `Rectangle` 클래스를 완성하자.
 *   `Rectangle` 클래스는 `width`, `height`가 모두 같으면 같은 값으로 정의한다.
 */
public class Rectangle {

    private int width;
    private int height;

    /**
     * 코드 작성
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
