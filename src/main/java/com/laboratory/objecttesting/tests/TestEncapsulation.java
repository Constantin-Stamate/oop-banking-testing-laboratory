package com.laboratory.objecttesting.tests;

import com.laboratory.objecttesting.models.BankAccount;

public class TestEncapsulation {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Testing encapsulation - this code must not compile because balance is private:
        // account.balance += 500;
        // this line will cause a compilation error

        // Testing access to balance through public methods
        account.deposit(500);

        assert account.getBalance() == 1500 : "Deposit method did not correctly modify the balance";
        System.out.println("Encapsulation test passed!");
    }
}