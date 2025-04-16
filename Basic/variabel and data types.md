# 🧠 1. Theory: Variables & Data Types in Java

## 📦 What is a Variable?
A **variable** is like a container in memory that stores data (value), which can be used and modified during program execution.

```java
int age = 25;
```
Here, `int` is the **data type**, `age` is the **variable name**, and `25` is the **value**.

---

## 🧪 Types of Variables in Java

| Type         | Scope                                             |
|--------------|---------------------------------------------------|
| **Local**    | Declared inside methods or blocks                 |
| **Instance** | Declared inside a class, but outside any method   |
| **Static**   | Declared with `static` keyword, shared across all objects |

---

## 🔢 Java Data Types

Java is **strongly typed**, meaning every variable must have a declared data type.

### ➤ **1. Primitive Data Types (8 types)**

| Type      | Size     | Description               | Example       |
|-----------|----------|---------------------------|---------------|
| `byte`    | 1 byte   | Whole number (–128 to 127)| `byte b = 10;`|
| `short`   | 2 bytes  | Whole number              | `short s = 1000;`|
| `int`     | 4 bytes  | Common int type           | `int x = 5000;`|
| `long`    | 8 bytes  | Large whole number        | `long l = 123456789L;`|
| `float`   | 4 bytes  | Decimal with `f`          | `float f = 3.14f;`|
| `double`  | 8 bytes  | More precise decimal      | `double d = 9.81;`|
| `char`    | 2 bytes  | Single character (Unicode)| `char c = 'A';`|
| `boolean` | 1 bit    | `true` or `false`         | `boolean b = true;`|

### ➤ **2. Non-Primitive Data Types**
- **String** (e.g., `String name = "Shaukat";`)
- **Arrays**, **Classes**, **Interfaces**, **Objects**

---

## 💡 Notes:
- Strings are **not** primitives in Java (they're objects).
- Java is case-sensitive: `int` ≠ `Int`
- Use meaningful variable names (`age`, `salary`, etc.)

---

# 👨‍💻 2. Code Examples
---

## 📄 File: `01_PrimitiveTypes.java`

```java
// java-basics/variables-and-datatypes/01_PrimitiveTypes.java

public class PrimitiveTypes {
    public static void main(String[] args) {
        // Integer types
        byte age = 25;
        short year = 2024;
        int salary = 50000;
        long population = 7900000000L;

        // Floating-point types
        float pi = 3.14f;
        double g = 9.80665;

        // Character type
        char grade = 'A';

        // Boolean type
        boolean isJavaFun = true;

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Salary: " + salary);
        System.out.println("Population: " + population);
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + g);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
    }
}
```

---

## 📄 File: `02_StringAndNonPrimitives.java`

```java
// java-basics/variables-and-datatypes/02_StringAndNonPrimitives.java

public class StringAndNonPrimitives {
    public static void main(String[] args) {
        // String (non-primitive)
        String name = "Shaukat Ali";
        String greeting = "Hello, " + name + "!";

        System.out.println(greeting);

        // Arrays
        int[] marks = {85, 90, 78};
        System.out.println("First subject marks: " + marks[0]);
    }
}
```

---

## 📄 File: `03_VariableScopes.java`

```java
// java-basics/variables-and-datatypes/03_VariableScopes.java

public class VariableScopes {
    int instanceVar = 10; // Instance variable
    static int staticVar = 20; // Static variable

    public void printVariables() {
        int localVar = 30; // Local variable
        System.out.println("Instance Var: " + instanceVar);
        System.out.println("Static Var: " + staticVar);
        System.out.println("Local Var: " + localVar);
    }

    public static void main(String[] args) {
        VariableScopes obj = new VariableScopes();
        obj.printVariables();
    }
}
```

---

## 📄 File: `04_TypeCasting.java`

```java
// java-basics/variables-and-datatypes/04_TypeCasting.java

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (small to big)
        int x = 100;
        long y = x;

        // Explicit casting (big to small)
        double pi = 3.14159;
        int approxPi = (int) pi;

        System.out.println("Long y: " + y);
        System.out.println("Approximate Pi: " + approxPi);
    }
}
```

---

**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible introduction to the Java programming language.
