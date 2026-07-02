# Object-Oriented Testing System

This repository contains a Java-based project developed for laboratory exercises in the 
**Software Product Testing Course** at **UTM (Technical University of Moldova)**. The project 
demonstrates **object-oriented testing principles**, including encapsulation, inheritance, and unit 
testing of class behavior.

## System Overview

The project consists of two main classes:

- **BankAccount** → represents a simple bank account with basic operations
- **SavingsAccount** → extends `BankAccount` and adds interest functionality

In addition, multiple test classes are implemented to validate each feature individually.

## Application Features

### BankAccount functionality:
- Deposit money into account
- Withdraw money with balance validation
- Retrieve current balance

### SavingsAccount functionality:
- Inherits all features from `BankAccount`
- Adds interest based on a fixed interest rate
- Applies interest to current balance

## Testing Features

The project includes **manual Java test classes** (without JUnit) covering:

- Testing `deposit()` method
- Testing `withdraw()` method
- Testing `addInterest()` method
- Testing encapsulation (private fields cannot be accessed directly)
- Testing inheritance behavior
- Testing interaction between inherited methods and extended functionality

## Project Structure

```
src/
└── main/
    └── java/
        └── com/laboratory/objecttesting/
            ├── models/
            │   ├── BankAccount.java
            │   └── SavingsAccount.java
            └── tests/
                ├── TestAddInterest.java
                ├── TestDeposit.java
                ├── TestEncapsulation.java
                ├── TestInheritanceInterest.java
                ├── TestSavingsAccountEncapsulation.java
                └── TestWithdraw.java
```

## Installation

1. **Clone the repository**
```bash
   git clone https://github.com/Constantin-Stamate/oop-banking-testing-laboratory
```

2. **Navigate to the project directory**

```bash
   cd oop-banking-testing-laboratory
```

3. **Compile project**
```bash
   javac com/laboratory/objecttesting/models/*.java com/laboratory/objecttesting/tests/*.java
```

## Technologies Used

- **Programming Language:** Java
- **Testing Framework:** JUnit 4
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA

## Laboratory Tasks Covered

- Identification and testing of class methods
- Verification of logic correctness
- Encapsulation validation
- Inheritance testing
- Class interaction analysis
- Integration testing between methods

## Author

This project was developed as part of the **Software Product Testing Course** at **UTM (Technical University of Moldova)**.

- GitHub: [Constantin-Stamate](https://github.com/Constantin-Stamate)
- Email: constantinstamate.r@gmail.com