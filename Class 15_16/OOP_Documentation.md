# OOP Documentation for Java Banking System

This document provides a comprehensive analysis of Object-Oriented Programming (OOP) concepts implemented in the Java banking system project. The project demonstrates core OOP principles through a class hierarchy representing different types of bank accounts.

## Project Overview

The banking system consists of multiple Java files that showcase OOP concepts including abstraction, encapsulation, inheritance, and polymorphism. The system models a banking application with different account types (Savings Account and Current Account) inheriting from a common base.

## OOP Concepts

### 1. Abstraction

Abstraction is the process of hiding implementation details and showing only the necessary functionality to the user. In Java, this is achieved through abstract classes and methods.

**Example from [Bank.java](Bank.java):**

```java
abstract class Bank {
    public abstract void cal_Bal();
}
```

The `Bank` class is abstract and defines an abstract method `cal_Bal()`. This forces all subclasses to provide their own implementation of balance calculation, hiding the specific details while providing a common interface.

**Example from [Account.java](Account.java):**

```java
public class Account extends Bank {
    // ... fields ...
    public void cal_Bal() {
        // Empty implementation - to be overridden by subclasses
    }
}
```

The `Account` class provides a concrete (though empty) implementation of the abstract method, serving as an intermediate layer.

### 2. Encapsulation

Encapsulation is the bundling of data and methods that operate on that data within a single unit (class), restricting direct access to some components. This is achieved using access modifiers like `private` and providing public getter/setter methods.

**Example from [CA.java](CA.java) and [SA.java](SA.java):**

```java
public class CA extends Account {
    // ... other fields ...
    private double min_Bal;

    public double getMin_Bal() {
        return min_Bal;
    }

    public void setMin_Bal(double min_Bal) {
        this.min_Bal = min_Bal;
    }
    // ... rest of class ...
}
```

The `min_Bal` field is declared as `private`, preventing direct access from outside the class. Public getter and setter methods provide controlled access to this data, ensuring data integrity and hiding implementation details.

### 3. Inheritance

Inheritance is a mechanism where one class acquires the properties and behaviors of another class. It promotes code reusability and establishes a relationship between classes.

**Multi-level Inheritance Hierarchy:**

- `Bank` (Abstract base class)
- `Account` (Extends `Bank`)
- `CA` and `SA` (Both extend `Account`)

**Example from [Account.java](Account.java):**

```java
public class Account extends Bank {
    String acc_Name;
    String acc_Email;
    String acc_Addr;
    // ... constructor and methods ...
}
```

The `Account` class inherits from `Bank` and adds additional fields for account information.

**Example from [CA.java](CA.java):**

```java
public class CA extends Account {
    int acc_Id;
    double acc_Bal;
    private double min_Bal;

    public CA(int id, String name, String email, String addr, double amount) {
        super(name, email, addr);  // Calls parent constructor
        this.acc_Id = id;
        this.acc_Bal = amount;
    }
    // ... methods ...
}
```

The `CA` class extends `Account`, inheriting its fields and methods, and adds specific fields for Current Account functionality. The `super()` call in the constructor demonstrates constructor chaining.

### 4. Polymorphism

Polymorphism allows objects of different classes to be treated as objects of a common superclass. It includes method overriding (runtime polymorphism) and method overloading (compile-time polymorphism).

**Method Overriding:**

Both `CA` and `SA` override the `cal_Bal()` method from `Account`:

```java
// In CA.java
public void cal_Bal() {
    System.out.println(this.acc_Bal - getMin_Bal());
}

// In SA.java (identical implementation)
public void cal_Bal() {
    System.out.println(this.acc_Bal - getMin_Bal());
}
```

**Runtime Polymorphism:**

The `AccountService` class demonstrates polymorphism by accepting an `Account` reference that can point to any subclass:

```java
// From AccountService.java
public class AccountService {
    public static void getService(Account a) {
        a.cal_Bal();  // Calls the appropriate overridden method
    }
}
```

**Usage in [Demo.java](Demo.java):**

```java
public class Demo {
    public static void main(String[] args) {
        SA sa = new SA(101, "Rahul", "rg@gmail.com", "Bang", 5000.50);
        CA ca = new CA(102, "Sonia", "sg@gmail.com", "Hyd", 3000.50);
        
        AccountService.getService(sa);  // Calls SA's cal_Bal()
        AccountService.getService(ca);  // Calls CA's cal_Bal()
    }
}
```

## Class Hierarchy Diagram

```
                    Bank (Abstract)
                      ↑
                   Account
                    ↑      ↑
                   CA      SA
                (Current) (Savings)
                 Account  Account
```

**Multi-level Inheritance Chain:**
- `Bank` (Abstract Root) → `Account` (Intermediate) → `CA`, `SA` (Concrete Implementations)

## Constructor Chaining

The [Super.java](Super.java) file demonstrates constructor chaining in a multi-level inheritance hierarchy:

```java
public class Super {
    Super() {
        super();  // Calls Object constructor
        System.out.println("GP Class constructor");
    }
}

class Parent extends Super {
    Parent() {
        super();  // Calls Super constructor
        System.out.println("Parent class Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // Calls Parent constructor
        System.out.println("Child Class Constructor");
    }
}
```

When a `Child` object is created, constructors are called in order: `Super` → `Parent` → `Child`.

## Design Patterns

1. **Template Method Pattern**: The `Bank` abstract class defines the contract; subclasses provide specific implementations.
2. **Strategy Pattern**: Different account types implement different balance calculation strategies.
3. **Service Locator Pattern**: `AccountService` provides static methods to interact with accounts polymorphically.

## Summary

This Java banking system project effectively demonstrates all four pillars of Object-Oriented Programming:

- **Abstraction**: Abstract classes and methods define contracts without implementation details.
- **Encapsulation**: Private fields with public accessors protect data integrity.
- **Inheritance**: Multi-level class hierarchy promotes code reuse and relationships.
- **Polymorphism**: Method overriding and runtime polymorphism enable flexible, extensible code.

The project shows how OOP principles can be applied to create a maintainable and extensible banking system where different account types share common functionality while maintaining their unique behaviors.