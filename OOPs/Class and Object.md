
# **Object-Oriented Programming (OOP)** 

---

# 🚀 **1. Class & Object in Java**
# 🛡️ **2. Access Modifiers in Java**

---

## 🧠 **What is Object-Oriented Programming (OOP)?**

OOP is a programming paradigm based on the concept of **“objects”**. Everything is modeled as an object that contains **data (fields)** and **behavior (methods)**.

---

### 📌 Key OOP Principles:
1. **Encapsulation**
2. **Abstraction**
3. **Inheritance**
4. **Polymorphism**

(We will explore these in next steps — today we’ll focus on **class, object, and access modifiers**.)

---

## 🔶 1. What is a Class?

A **class** is a **blueprint** or **template** for creating objects.  
It defines the **fields (data)** and **methods (behavior)** of objects.

### 📘 Syntax:
```java
class ClassName {
    // fields or variables
    // methods or functions
}
```

---

### ✅ Example:

```java
class Car {
    // Fields
    String color;
    int speed;

    // Method
    void drive() {
        System.out.println("Car is driving at " + speed + " km/h.");
    }
}
```

---

## 🔷 2. What is an Object?

An **object** is an **instance** of a class.  
It is created using the `new` keyword.

### 📘 Example:

```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating object
        myCar.color = "Red";
        myCar.speed = 80;
        myCar.drive(); // Calling method
    }
}
```

### 🧠 In Memory:
Object gets memory allocated for its variables and can call class methods.

---

## 🧩 Real-life Analogy:
- **Class** → Blueprint of a House
- **Object** → Actual House built using that blueprint

---

## 🛡️ 3. Access Modifiers in Java

Access modifiers **control the visibility** of classes, variables, constructors, and methods.

---

### 🔐 Types of Access Modifiers:

| Modifier | Access Level | Can Access From |
|----------|--------------|------------------|
| `public` | Everywhere | Any class |
| `private` | Within class only | Same class only |
| `protected` | Package + subclasses | Same package or subclass |
| *default* (no keyword) | Package-level | Same package only |

---

### ✅ Examples of Each:

#### 🔸 `public`:
```java
public class Animal {
    public void speak() {
        System.out.println("Animal speaks");
    }
}
```
Used anywhere.

---

#### 🔸 `private`:
```java
class Animal {
    private int age = 5;

    private void info() {
        System.out.println("Age: " + age);
    }
}
```
Only within this class.

---

#### 🔸 `protected`:
```java
class Animal {
    protected void walk() {
        System.out.println("Animal walking");
    }
}
```
Accessible within package and in subclass in other packages.

---

#### 🔸 Default (Package-Private):
```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
```
Accessible only in the same package.

---

## 💻 5+ Code Examples Covering Class, Object, and Access Modifiers

---

### ✅ 1. Simple Class and Object

```java
class Student {
    String name;
    int roll;

    void display() {
        System.out.println(name + " - " + roll);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Shaukat";
        s.roll = 1;
        s.display();
    }
}
```

---

### ✅ 2. Using Private Variables and Getter/Setter (Encapsulation base)

```java
class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());
    }
}
```

---

### ✅ 3. Access Modifier Testing

```java
class A {
    public int pub = 1;
    private int priv = 2;
    protected int prot = 3;
    int def = 4;

    void show() {
        System.out.println(pub + ", " + priv + ", " + prot + ", " + def);
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.pub);  // ✅
        // System.out.println(obj.priv); // ❌
        System.out.println(obj.prot); // ✅ (same package)
        System.out.println(obj.def);  // ✅
    }
}
```

---

### ✅ 4. Multiple Objects from One Class

```java
class Laptop {
    String brand;

    void info() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
        l1.brand = "HP";
        l2.brand = "Dell";
        l1.info();
        l2.info();
    }
}
```

---

### ✅ 5. Object References

```java
class Pen {
    String color;
}

public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = p1;
        p1.color = "Blue";
        System.out.println(p2.color); // Output: Blue (same object reference)
    }
}
```

---

## 🧪 Interview Questions (Class/Object + Access Modifier)

| Question | Answer |
|---------|--------|
| Can we create object without class? | No |
| Can we have multiple objects from same class? | Yes |
| Can a class have multiple methods with same name? | Yes (Overloading) |
| What is the default access level in Java? | Package-private |
| Can we access private variables directly? | No, use getters/setters |
| Can we access protected members from subclass outside package? | Yes |

---

**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible **introduction** to the Java programming language.
