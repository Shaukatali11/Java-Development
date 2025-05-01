# **Interfaces vs Abstract Classes in Java**

## **📘 Overview**

- **Abstract Classes** and **Interfaces** both provide a way to achieve **abstraction**, but they have different purposes and characteristics.
- **Abstract Classes** are used when you want to define some shared behavior among a group of related classes while still leaving certain details to be implemented by subclasses.
- **Interfaces** are used to define a contract for what a class should do, without dictating how it should do it.

---

## **Key Differences Between Interface and Abstract Class**

| Feature                     | **Abstract Class**                         | **Interface**                              |
|-----------------------------|--------------------------------------------|--------------------------------------------|
| **Instantiation**            | Cannot instantiate (abstract)              | Cannot instantiate                        |
| **Methods**                  | Can have both abstract and non-abstract methods | All methods are abstract (until Java 8, later it can have default and static methods) |
| **Fields**                   | Can have instance variables, constants     | Can only have constants (variables are `public static final`) |
| **Constructors**             | Can have constructors                      | No constructors                            |
| **Multiple Inheritance**     | Can inherit from only one class            | Can implement multiple interfaces          |
| **Access Modifiers**        | Can have any access modifier (`public`, `private`, etc.) | All members are `public` by default        |
| **Use Case**                 | Used to represent common behaviors         | Used to represent a contract of behaviors |
| **Inheritance**              | Extends a class                            | Implements an interface                    |

---

## **1. Abstract Class in Java**

An **abstract class** is a class that cannot be instantiated. It can have abstract methods (without implementation) and non-abstract methods (with implementation). Abstract classes are used when you have common functionality that can be shared across related classes, but some behavior still needs to be defined in subclasses.

### **Syntax**

```java
abstract class Animal {
    abstract void sound(); // abstract method

    void sleep() {         // non-abstract method
        System.out.println("Animal is sleeping.");
    }
}
```

### **Example**

```java
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void fuel();  // Abstract method

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    void fuel() {
        System.out.println("Car uses gasoline.");
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String brand) {
        super(brand);
    }

    void fuel() {
        System.out.println("Electric car uses electricity.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Tesla");
        myCar.displayBrand();  // Display brand
        myCar.fuel();          // Calls the overridden fuel method
    }
}
```

---

## **2. Interface in Java**

An **interface** defines a contract of methods that a class must implement. In an interface, methods are abstract by default (until Java 8 introduced default methods), and all fields are `public static final` by default.

### **Syntax**

```java
interface Animal {
    void sound();  // Abstract method (no implementation)
}
```

### **Example**

```java
interface Animal {
    void sound(); // No implementation, just declaration
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound(); // Output: Dog barks
        cat.sound(); // Output: Cat meows
    }
}
```

---

## **3. Default Methods in Interfaces (Java 8+)**

With Java 8, **default methods** were introduced in interfaces, allowing you to define method implementations in interfaces. This enables backward compatibility while allowing interface methods to have implementations.

### **Example:**

```java
interface Vehicle {
    void fuel(); // abstract method

    default void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car implements Vehicle {
    public void fuel() {
        System.out.println("Car uses gasoline.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Calls the default method from the interface
        car.fuel();  // Calls the implemented method from the class
    }
}
```

---

## **4. Multiple Inheritance (Interface)**

Unlike abstract classes, **interfaces** support **multiple inheritance**, i.e., a class can implement multiple interfaces. This is useful when a class needs to inherit behavior from multiple sources.

### **Example:**

```java
interface Engine {
    void startEngine();
}

interface AirConditioning {
    void turnOnAC();
}

class Car implements Engine, AirConditioning {
    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void turnOnAC() {
        System.out.println("AC turned on.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.turnOnAC();
    }
}
```

---

## **5. Key Differences in Real-World Scenario**

### **Use Case for Abstract Class:**
- An **abstract class** is like a blueprint for a family of related classes, and it can provide a **shared base implementation**. For example, a `Vehicle` class might define common properties (like `brand`) and some methods (like `displayBrand()`), but each subclass (`Car`, `Bike`) can implement specific behaviors (`fuel()`).

### **Use Case for Interface:**
- An **interface** is used when you want to specify a set of **required behaviors** across different, unrelated classes. For example, a `Flying` interface could be implemented by classes like `Airplane` and `Bird`, which are not related but both can `fly()`.

---

## **6. When to Use Abstract Class vs Interface?**

- **Use Abstract Class**:
  - When you want to share **common behavior** between related classes.
  - When you want to use **protected** or **private** fields and methods.
  - When you want to have **default implementation** for some methods.
  
- **Use Interface**:
  - When you want to define a **contract** that different classes must follow.
  - When you need to support **multiple inheritance**.
  - When you want to provide the **default behavior** but still allow flexibility.

---

## **⚙️ Conclusion**

- **Abstract Classes** are for sharing common behavior among a set of related classes while leaving some behavior to be implemented by subclasses.
- **Interfaces** are for defining a contract that different, potentially unrelated classes, must adhere to.

---

### **Example of Both Together:**

```java
interface Flying {
    void fly(); // Must be implemented
}

abstract class Animal {
    abstract void sound();  // Abstract method
}

class Bat extends Animal implements Flying {
    public void sound() {
        System.out.println("Bat makes a sound");
    }

    public void fly() {
        System.out.println("Bat can fly");
    }
}

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.sound();  // Bat makes a sound
        bat.fly();    // Bat can fly
    }
}
```

---


**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible **introduction** to the Java programming language.
