package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public void displayItem() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명:" + item.getName() + ", 합계:"+ item.getTotalPrice());
        }

        /**
         * 동일한 items를 2번 loop를 돌리는 이유
         *   1) SOLID의 SRP(단일책임원칙)에 의거하여 하나의 메서드는 하나의 책임만 가지도록 처리
         *      즉, 요건이 변경되더라도 유연하게 처리 가능 (유지보수 초점)
         *   2) 별도의 메서드로 빼기도 좋으며, 몇만건 이상 단위가 아니므로 속도이슈가 크지 않다.
         */
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }

        System.out.println("전체 가격 합:" + totalPrice);
    }

}
