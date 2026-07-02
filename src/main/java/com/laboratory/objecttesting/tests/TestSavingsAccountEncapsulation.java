package com.laboratory.objecttesting.tests;

import com.laboratory.objecttesting.models.SavingsAccount;

public class TestSavingsAccountEncapsulation {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);

        // Testing encapsulation: interestRate is private and cannot be accessed directly
        // savingsAccount.interestRate = 0.10;
        // The line above MUST NOT compile because interestRate is private

        // Testing balance modification only through public methods
        savingsAccount.addInterest();

        assert savingsAccount.getBalance() == 1050 : "Interest was not correctly added through public method";
        System.out.println("SavingsAccount encapsulation test passed!");
    }
}