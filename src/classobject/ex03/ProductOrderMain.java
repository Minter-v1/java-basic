package classobject.ex03;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orderArr = new ProductOrder[2];
        ProductOrder ins1 = new ProductOrder();
        ProductOrder ins2 = new ProductOrder();

        ins1.price = 100;
        ins1.productName = "쌀과자";
        ins1.quantity = 1;

        ins2.price = 200;
        ins2.productName = "새콤달콤";
        ins2.quantity = 2;

        orderArr[0] = ins1;
        orderArr[1] = ins2;

        for (ProductOrder order : orderArr) {
            System.out.println("결제 금액 : " + order.price * order.quantity);
        }

    }
}
