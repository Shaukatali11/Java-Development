# 🏗️ **Constructors in Java — Full Guide with Real-World Examples**

---

## 📘 What is a Constructor?

A **constructor** in Java is a special method that:

- Is used to **initialize objects**
- Has the **same name** as the class
- **No return type** (not even `void`)
- Called **automatically** when an object is created

---

## 📌 Syntax

```java
class ClassName {
    ClassName() {
        // constructor body
    }
}
```

---

## 💡 Why Use Constructors?

- To set default or initial values
- To enforce **object initialization rules**
- To overload and initialize objects in **multiple ways**

---

## 🔄 Types of Constructors in Java

| Type                  | Description |
|-----------------------|-------------|
| 1. Default Constructor | No parameters, Java creates it if none provided |
| 2. Parameterized Constructor | Accepts arguments to initialize fields |
| 3. Copy Constructor (Custom) | Initializes an object using another object (user-defined) |

---

### ✅ 1. **Default Constructor**

```java
class Car {
    Car() {
        System.out.println("Car is created!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();  // Constructor is called
    }
}
```

---

### ✅ 2. **Parameterized Constructor**

```java
class Car {
    String model;
    int year;

    Car(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println(model + " - " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 2022);
        c1.display();  // Tesla - 2022
    }
}
```

---

### ✅ 3. **Copy Constructor (User-defined)**

```java
class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    Student(Student s) { // Copy constructor
        name = s.name;
        age = s.age;
    }

    void show() {
        System.out.println(name + " is " + age + " years old.");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student(s1);  // copy
        s2.show();  // Alice is 20 years old.
    }
}
```

---

## 🧱 Constructor Overloading

> Same class having **multiple constructors** with different parameters.

```java
class Rectangle {
    int length, width;

    Rectangle() {
        length = 1; width = 1;
    }

    Rectangle(int l, int w) {
        length = l; width = w;
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();      // 1x1
        Rectangle r2 = new Rectangle(4, 5);  // 4x5
        r1.area(); r2.area();
    }
}
```

---

## 🔗 `this()` Keyword to Call One Constructor from Another

```java
class Box {
    int height, width;

    Box() {
        this(10, 10); // calls parameterized constructor
    }

    Box(int h, int w) {
        height = h;
        width = w;
    }

    void display() {
        System.out.println("H: " + height + ", W: " + width);
    }
}
```

---

## ❌ Important Rules

- No return type allowed
- Can’t be `abstract`, `final`, `static`, or `synchronized`
- Can use `this()` to call another constructor
- `super()` is used to call parent class constructor (must be first line)

---

## 👨‍🔬 Real World Analogy

Imagine you're buying a phone:

- You can buy with default settings → `new Phone()`
- Or you specify RAM, storage, color → `new Phone(8, 256, "Black")`
- You can duplicate your friend’s config → `new Phone(friendPhone)`

---

## 💼 Real-world Code Snippet (Constructor Overloading)

```java
class BankAccount {
    String holderName;
    double balance;

    BankAccount() {
        this.holderName = "Default User";
        this.balance = 0;
    }

    BankAccount(String name, double balance) {
        this.holderName = name;
        this.balance = balance;
    }

    void display() {
        System.out.println(holderName + " has ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("Shaukat", 10000);
        acc1.display();
        acc2.display();
    }
}
```

---

## ❓ Constructor vs Method

| Feature         | Constructor         | Method                |
|----------------|---------------------|------------------------|
| Name            | Same as class       | Any name              |
| Return type     | No return type      | Must have one         |
| Called by       | JVM during object creation | Manually             |
| Purpose         | Initialize object   | Define behavior       |

---

## ✅ 10+ Constructor Practice Examples

1. Car with model and price
2. Student class with ID, name
3. BankAccount with overloading
4. Book constructor chaining
5. Laptop copy constructor
6. Circle default and parameterized
7. Employee class with `this()` keyword
8. Rectangle constructor using `super()`
9. Person constructor overloading with age, name, and country
10. MobilePhone with user-specified features

---



**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible **introduction** to the Java programming language.
