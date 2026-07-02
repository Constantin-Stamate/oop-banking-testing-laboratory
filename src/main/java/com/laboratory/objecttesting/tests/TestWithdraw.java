package com.laboratory.objecttesting.tests;

import com.laboratory.objecttesting.models.BankAccount;

public class TestWithdraw {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.withdraw(300);

        assert account.getBalance() == 700 : "Withdrawal was not performed correctly";
        System.out.println("Test withdraw() passed!");
    }
}