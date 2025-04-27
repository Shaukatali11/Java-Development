# 🧬 Inheritance in Java – Complete Guide with All Types & Real-world Examples

---

## 🧠 What is Inheritance?

> **Inheritance** allows one class (child/subclass) to **acquire** the properties and behavior (fields and methods) of another class (parent/superclass).

It helps with:
- ✅ Code reusability  
- ✅ Method overriding  
- ✅ Runtime polymorphism  
- ✅ Cleaner architecture  

---

## 📌 Why Use Inheritance?

Imagine writing the same `name`, `age`, `displayInfo()` again and again for `Student`, `Teacher`, `Staff`, etc. Instead, define once in `Person`, and **reuse** it.

---

## 🔰 Syntax

```java
class Parent {
   // properties and methods
}

class Child extends Parent {
   // can use/override Parent’s stuff
}
```

---

## 💡 Real-life Analogy

- `Animal` → `Dog`, `Cat`, `Elephant`  
- `Vehicle` → `Car`, `Bike`, `Truck`  
- `Employee` → `Manager`, `Engineer`, `Intern`

---

## 🧪 Basic Example

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}
```

```java
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // inherited
        dog.bark();  // own
    }
}
```

---

## 🎯 Types of Inheritance in Java

Java supports the following:

| Type                 | Supported in Java |
|----------------------|------------------|
| Single Inheritance   | ✅ Yes           |
| Multilevel Inheritance | ✅ Yes         |
| Hierarchical Inheritance | ✅ Yes       |
| Multiple Inheritance (via class) | ❌ No (but supported via Interface ✅) |
| Hybrid Inheritance   | ✅ Only through Interfaces |

---

## 1️⃣ Single Inheritance

```java
class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Car extends Vehicle {
    void drive() { System.out.println("Car drives"); }
}
```

---

## 2️⃣ Multilevel Inheritance

```java
class Animal {
    void breathe() { System.out.println("Breathing..."); }
}

class Mammal extends Animal {
    void walk() { System.out.println("Walking..."); }
}

class Human extends Mammal {
    void speak() { System.out.println("Speaking..."); }
}
```

✅ `Human` inherits `Mammal` and `Animal`

---

## 3️⃣ Hierarchical Inheritance

```java
class Shape {
    void draw() { System.out.println("Drawing shape..."); }
}

class Circle extends Shape {
    void radius() { System.out.println("Radius of circle"); }
}

class Square extends Shape {
    void side() { System.out.println("Side of square"); }
}
```

---

## 4️⃣ Multiple Inheritance (via Interface)

```java
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() { System.out.println("A's method"); }
    public void methodB() { System.out.println("B's method"); }
}
```

---

## 🔀 Hybrid Inheritance

It’s a combination — only allowed via interfaces to avoid ambiguity.

---

## 🚀 Real-World Example: Employee Management System

```java
class Person {
    String name;
    int age;
    
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

```java
class Employee extends Person {
    double salary;

    void showSalary() {
        System.out.println("Salary: ₹" + salary);
    }
}
```

```java
class Manager extends Employee {
    String department;

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.name = "Shaukat";
        mgr.age = 30;
        mgr.salary = 90000;
        mgr.department = "IT";
        
        mgr.displayInfo();
        mgr.showSalary();
        mgr.showDepartment();
    }
}
```

---

## ⚔️ Method Overriding

Used to override parent class methods in child class:

```java
class Animal {
    void sound() { System.out.println("Animal makes sound"); }
}

class Dog extends Animal {
    @Override
    void sound() { System.out.println("Dog barks"); }
}
```

---

## 📚 Interview Questions

| Question | Answer |
|---------|--------|
| What is inheritance? | Mechanism to inherit properties from parent class |
| Does Java support multiple inheritance? | No (via classes), Yes (via interfaces) |
| What's the use of `super` keyword? | To call parent class constructor/method |
| Can private members be inherited? | No, but accessible via public methods |
| What is method overriding? | Redefining a parent method in subclass |

---

## 🧪 Coding Practice Ideas

1. Create `Employee`, `Developer`, `Manager`, `HR` classes with inheritance.
2. Abstract class `Shape` → Implement `Triangle`, `Rectangle`, `Circle` and calculate area.
3. Class `Device` → `Phone`, `Laptop`, `Tablet` → use overriding.
4. Interface `Playable` + `Recordable` → class `MediaDevice`.
5. Class `UniversityMember` → `Student`, `Faculty` (with fields & overrides).
6. Hybrid Inheritance via interfaces: `Flyable`, `Shootable` → `Drone`.

---


**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible **introduction** to the Java programming language.
