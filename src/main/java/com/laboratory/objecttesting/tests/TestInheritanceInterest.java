package com.laboratory.objecttesting.tests;

import com.laboratory.objecttesting.models.SavingsAccount;

public class TestInheritanceInterest {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);

        savingsAccount.deposit(200);

        assert savingsAccount.getBalance() == 1200 : "Deposit does not work correctly in derived class";

        savingsAccount.addInterest();
        savingsAccount.withdraw(250);

        assert savingsAccount.getBalance() == 1010 : "Withdrawal does not work correctly after adding interest";
        System.out.println("Inheritance and addInterest() test passed!");
    }
}