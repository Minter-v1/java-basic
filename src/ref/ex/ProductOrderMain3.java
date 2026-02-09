package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        ProductOrder[] orders = new ProductOrder[n];

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"번째 주문 정보를 입력하세요");
            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

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
