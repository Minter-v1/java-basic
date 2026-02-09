package oop;

public class Account {
    int balance = 0;

    // 입금 메서드
    void deposit(int amount) {
        balance += amount;
    }

    // 출금 메서드
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            return;
        }

        balance -= amount;
    }


}
