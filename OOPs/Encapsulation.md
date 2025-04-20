

# 🔐 **Encapsulation in Java — Full Deep Dive**

---

## 📘 **What is Encapsulation?**

Encapsulation is the **binding of data (variables)** and **methods (functions)** that operate on that data into a **single unit (class)**.  
It’s a **protective shield** that prevents data from being accessed directly — instead, it’s accessed via methods (getters/setters).

---

## 🧠 **Why Encapsulation is Important?**

| 🔍 Purpose | ✅ Benefit |
|-----------|------------|
| Hides internal data | Security & abstraction |
| Controls access | Prevents misuse |
| Increases flexibility | Easy to change internal code |
| Improves maintainability | Modularity & cleaner code |

---

## 🔧 **How to Achieve Encapsulation in Java?**

1. Declare **class variables as `private`**  
2. Provide **public getter and setter methods** to access and update the value of a private variable

---

### ✅ **Basic Example of Encapsulation**

```java
class Person {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Shaukat");
        p.setAge(25);
        System.out.println(p.getName() + " is " + p.getAge() + " years old.");
    }
}
```

---

## 🏘️ **Real-World Example of Encapsulation**

Let’s say you are designing an **ATM system**:

```java
class ATM {
    private int balance = 10000;

    public int getBalance(String pin) {
        if(pin.equals("1234")) {
            return balance;
        } else {
            System.out.println("Invalid PIN!");
            return 0;
        }
    }

    public void deposit(int amount) {
        if(amount > 0) balance += amount;
    }

    public void withdraw(int amount) {
        if(amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }
}
```

```java
public class Bank {
    public static void main(String[] args) {
        ATM user1 = new ATM();
        user1.deposit(5000);
        user1.withdraw(2000);
        System.out.println("Balance: " + user1.getBalance("1234"));
    }
}
```

🧠 In this example:
- User cannot directly modify `balance`
- Must use `deposit()`, `withdraw()` and `getBalance()` methods

---

## 📌 **Benefits Recap with Java Code Links (GitHub Style)**

| Concept | GitHub-style Summary |
|--------|------------------------|
| 🔐 Private Variables | Cannot access directly: `person.name ❌` |
| 🛠 Getter & Setter | Access via `person.getName()` |
| 🏛 Well-Defined Interface | Developer knows only safe ways to interact |
| ✅ Input Validation | Setter methods can check invalid values |
| 📦 Maintains Integrity | Keeps object safe from random changes |

---

## 🔍 Advanced Concept: Immutable Encapsulation

Immutable classes are fully encapsulated and their fields **can’t be changed after creation**.

```java
final class User {
    private final String username;
    private final int id;

    public User(String username, int id) {
        this.username = username;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
}
```

✅ No setter → Fully immutable.

---

## ✅ 5+ Interview Questions (Encapsulation)

| Question | Answer |
|---------|--------|
| What is encapsulation in Java? | Wrapping data and methods into one unit |
| How is it implemented in Java? | Using private fields and public getters/setters |
| Why is encapsulation important? | Data hiding, access control, input validation |
| Can you have encapsulation without private variables? | No, private fields are key |
| Is encapsulation related to abstraction? | Yes, abstraction hides complexity, encapsulation hides data |

---

## 🧪 Practice Coding Challenges (Try on your own)

1. Create a `Car` class with private speed and method to increase speed with limit.
2. Create `Student` class with GPA and allow access only to approved users.
3. Create `OnlineOrder` class that prevents users from directly changing order status.
4. Build `TemperatureConverter` class that encapsulates temperature and allows safe conversion.
5. Design `Employee` class with validation in `setSalary()` method.

---


**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible **introduction** to the Java programming language.
