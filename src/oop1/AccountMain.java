package oop1;

public class AccountMain {

    static void main(String[] args) {

        Account account = new Account();
        account.balance = 0;

        account.depoist(10000);
        account.withdraw(9000);
        account.withdraw(2000);

    }
}
