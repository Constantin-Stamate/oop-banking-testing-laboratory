package com.laboratory.objecttesting.tests;

import com.laboratory.objecttesting.models.SavingsAccount;

public class TestAddInterest {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);

        savingsAccount.addInterest();

        assert savingsAccount.getBalance() == 1050 : "Interest was not added correctly";
        System.out.println("Test addInterest() passed!");
    }
}