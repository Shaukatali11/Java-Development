# 🔁 **Polymorphism in Java – Full Guide with All Types, Real-World Examples & Code**

---

## 🧠 What is Polymorphism?

**Polymorphism** means **"many forms."**

In Java:
> The same method name or object behaves differently **based on the context** — at compile-time or runtime.

---

## 📌 Why Use Polymorphism?

- 🚀 Enhances **code reusability**
- 🔁 Enables **method overriding/overloading**
- 🧱 Promotes **scalability and maintainability**
- 👨‍🔬 Achieves **dynamic behavior at runtime**

---

## 🧩 Types of Polymorphism in Java

| Type                        | Also Called As       | Resolved At     |
|----------------------------|----------------------|-----------------|
| 1. Compile-time Polymorphism | Method Overloading  | Compile-time    |
| 2. Runtime Polymorphism     | Method Overriding   | Runtime         |

---

# ✅ 1. **Compile-time Polymorphism** (Method Overloading)

### 🧠 Concept:
Same method name with **different signatures** (number or type of parameters) in **same class**.

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));          // 5
        System.out.println(calc.add(2.5, 4.5));      // 7.0
        System.out.println(calc.add(1, 2, 3));       // 6
    }
}
```

### 📌 Key Points:
- Done during **compilation**
- Based on **method signature**
- Doesn’t depend on return type

---

# ✅ 2. **Runtime Polymorphism** (Method Overriding)

### 🧠 Concept:
Method in the subclass **overrides** the method of the superclass.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Animal a; // reference of superclass

        a = new Dog();
        a.sound();  // Dog barks

        a = new Cat();
        a.sound();  // Cat meows
    }
}
```

### 📌 Key Points:
- Achieved via **inheritance**
- Supports **dynamic method dispatch**
- Happens during **runtime**
- Allows **one interface, multiple implementations**

---

## 🧪 Real-World Analogy

**Remote control (Parent)** → Operates **TV**, **AC**, **Fan** (Childs)

```java
class Remote {
    void pressButton() {
        System.out.println("Generic device ON");
    }
}

class TVRemote extends Remote {
    void pressButton() {
        System.out.println("TV turns ON");
    }
}

class ACRemote extends Remote {
    void pressButton() {
        System.out.println("AC turns ON");
    }
}
```

---

## 🤖 Dynamic Method Dispatch

> It’s the mechanism by which a call to an overridden method is resolved at runtime, based on the object type (not reference type).

```java
Remote r = new TVRemote(); // reference of parent, object of child
r.pressButton();           // Output: TV turns ON
```

---

## ⚙️ Polymorphism via Interface

```java
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();  s.draw();
        s = new Square();  s.draw();
    }
}
```

---

## 📙 Interview Questions

| Question | Answer |
|---------|--------|
| What is polymorphism? | Ability to take many forms |
| Types? | Compile-time (Overloading), Runtime (Overriding) |
| Can we override private methods? | ❌ No |
| Can constructors be overloaded? | ✅ Yes |
| Can method overloading happen in different class? | ❌ No, must be same class |

---

## 🔟+ Polymorphism Coding Practice Examples

1. `Calculator` class with `add`, `subtract` – method overloading.
2. Shape interface → `draw()` in Circle, Triangle, Square.
3. `Payment` class → `pay()` overridden by `UPI`, `Card`, `Cash`.
4. Method overloading in `Logger`: `log(String)`, `log(String, int)`.
5. Animal → Dog, Cat, Cow with different `makeSound()`.
6. Vehicle base class → `startEngine()` in `Car`, `Bike`, `Truck`.
7. Student Portal → showDetails overloaded for different input.
8. Banking App → `deposit()` & `withdraw()` with overloading.
9. `Notification` class → overridden by `Email`, `SMS`, `Push`.
10. `Printer` → overloaded `print()` for int, float, string arrays.

---

## 🛠️ Real-World Project Idea (Mini)

**Online Payment System**

```java
abstract class Payment {
    abstract void makePayment(double amount);
}
```

```java
class UPI extends Payment {
    void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }
}
```

```java
class Card extends Payment {
    void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " via Card");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Payment p;

        p = new UPI(); p.makePayment(500);
        p = new Card(); p.makePayment(1200);
    }
}
```

---


**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible **introduction** to the Java programming language.
