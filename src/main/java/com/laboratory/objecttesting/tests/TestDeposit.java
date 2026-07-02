package com.laboratory.objecttesting.tests;

import com.laboratory.objecttesting.models.BankAccount;

public class TestDeposit {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.deposit(500);

        assert account.getBalance() == 1500 : "Deposit was not performed correctly";
        System.out.println("Test deposit() passed!");
    }
}