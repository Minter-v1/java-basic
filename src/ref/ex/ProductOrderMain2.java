package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김차", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrders(orders);
        getTotalAmount(orders);


    }
    // 상품 생성
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder ins = new ProductOrder();
        ins.productName = productName;
        ins.price = price;
        ins.quantity = quantity;
        return ins;
    }
    // 상품 주문 정보 출력
    static void printOrders(ProductOrder[] arr) {
        for (ProductOrder order : arr) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    // 총 결제 금액 출력
    static int getTotalAmount(ProductOrder[] arr) {
        int total = 0;

        for (ProductOrder order : arr) {
            total += order.price * order.quantity;
        }

        System.out.println("총 결제 금액: " + total);
        return total;
    }
}
