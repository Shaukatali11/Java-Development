# 🧩 Abstraction in Java 

---

## 📘 **What is Abstraction?**

**Abstraction** is the process of hiding complex internal details and showing only the **essential features** to the user.

> 🧠 Think of it as “**what** an object does” rather than “**how** it does it”.

---

## 🎯 **Key Idea:**

- Encapsulation **hides data**
- Abstraction **hides implementation**

---

## 🏁 **Real-Life Examples of Abstraction:**

| Real Object | Abstracted Detail |
|-------------|-------------------|
| **Car** | You only know to press accelerator/brake. You don’t see how fuel is ignited. |
| **TV Remote** | You press buttons. The internal wiring & circuits are hidden. |
| **ATM Machine** | You withdraw money without knowing the backend logic or API calls. |

---

## 🛠️ **How to Achieve Abstraction in Java?**

There are **two ways** to achieve abstraction in Java:

1. **Abstract Classes**
2. **Interfaces**

---

## 🔷 1. **Abstract Class in Java**

### ✅ Rules:
- Cannot be instantiated directly.
- May contain **abstract methods** (without body) and **concrete methods** (with body).
- Used when classes share **some behavior**, but have **different implementations**.

---

### 🧪 Example:

```java
abstract class Animal {
    abstract void makeSound(); // abstract method

    public void eat() {
        System.out.println("This animal eats food.");
    }
}
```

```java
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();  // Dog barks
        dog.eat();        // This animal eats food

        Animal cat = new Cat();
        cat.makeSound();  // Cat meows
    }
}
```

---

## 🔷 2. **Interface in Java**

### ✅ Rules:
- Defines a **contract** that a class must follow.
- Only contains **abstract methods** (until Java 7), and **default/static methods** (Java 8+).
- Achieves **100% abstraction** (in old versions).
- Supports **multiple inheritance**.

---

### 🧪 Example:

```java
interface Vehicle {
    void start();
    void stop();
}
```

```java
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}
```

---

## 🏘️ **Real-World Abstraction Example (Banking System)**

```java
abstract class BankAccount {
    protected double balance = 0;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
    public void checkBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}
```

```java
class SavingsAccount extends BankAccount {
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance");
    }
}
```

```java
public class Bank {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount();
        acc.deposit(10000);
        acc.withdraw(2000);
        acc.checkBalance();  // ₹8000
    }
}
```

🧠 You don’t see *how* balance is stored, you just call the public interface — **that’s abstraction**.

---

## ⚔️ **Abstract Class vs Interface**

| Feature             | Abstract Class      | Interface             |
|---------------------|---------------------|------------------------|
| Keywords            | `abstract`          | `interface`            |
| Can contain fields  | Yes                 | Only `public static final` |
| Can have constructors | Yes              | No                     |
| Supports multiple inheritance | No        | Yes                   |
| Purpose             | Base for similar objects | Defines capability     |

---

## ✅ Interview-Level Questions on Abstraction

| Question | Answer |
|----------|--------|
| What is abstraction in Java? | Hiding internal details and showing only functionality |
| How do you achieve abstraction? | Using abstract classes and interfaces |
| Can abstract class have non-abstract methods? | Yes |
| Can you instantiate an abstract class? | No |
| What's the difference between abstraction and encapsulation? | Abstraction hides **implementation**, encapsulation hides **data** |

---

## 🔍 Practice Coding Problems (Interview Style)

1. Create an abstract `Shape` class with `calculateArea()` method. Implement it for `Circle`, `Rectangle`, etc.
2. Interface `Payable` with `calculateSalary()`, implement for `Employee` and `Freelancer`.
3. `Login` interface for different authentication methods (Email, Google, OTP).
4. Interface `MediaPlayer` for `play()`, `pause()`, `stop()` — implement for MP3 and Video players.
5. Interface `Flyable` and `Swimmable` — create `Duck` class that implements both.
6. Abstract `Vehicle` with methods `start()` and `fuelType()`.
7. Abstract class `Appliance` with `turnOn()` and `turnOff()` methods, implemented by `Fan`, `AC`.
8. Interface `Encryptor` for `encrypt()` method — implement `AES`, `RSA` encryptors.

---
**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible **introduction** to the Java programming language.
