package oop1;

public class Account {
    int balance;

    void depoist(int amount) {
        balance += amount;
        System.out.println("입금액: "+amount + ", 총 잔액: "+ balance);
    }

    void withdraw(int amount) {
        if ((balance-amount) > 0){
            balance -= amount;
            System.out.println("출금액: "+ amount + ", 총 잔액: "+ balance);
        } else {
            System.out.println("출금 잔액이 부족합니다.");
        }
    }
}
