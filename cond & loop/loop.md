## 🧠 THEORY: What are Loops in Java?

**Loops** are used to execute a block of code repeatedly until a certain condition is met.  
They **eliminate code redundancy** and **optimize** the execution of repetitive tasks.

---

## 🔄 Types of Loops in Java

| Loop Type       | When to Use                                          | Notes |
|-----------------|------------------------------------------------------|-------|
| `for` loop       | Known number of iterations                          | Best for counters |
| `while` loop     | Unknown iterations, condition-based                 | Checks before execution |
| `do-while` loop  | Ensure code runs at least once                      | Checks after execution |
| `for-each` loop  | Iterate over arrays or collections (read-only)      | Cleaner syntax |

---

### 🔹 `for` Loop Syntax
```java
for (initialization; condition; update) {
    // code block
}
```

### 🔹 `while` Loop Syntax
```java
while (condition) {
    // code block
}
```

### 🔹 `do-while` Loop Syntax
```java
do {
    // code block
} while (condition);
```

### 🔹 `for-each` Loop Syntax
```java
for (datatype var : array) {
    // read-only access to elements
}
```

---

## ✅ 10+ Coding Examples from Basic to Advanced

---

### 🔸 Example 1: **Print 1 to 10 (basic `for` loop)**

```java
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```

---

### 🔸 Example 2: **Sum of N numbers using `while` loop**

```java
import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum: " + sum);
    }
}
```

---

### 🔸 Example 3: **Menu-Driven Calculator using `do-while`**

```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+': System.out.println("Sum = " + (a + b)); break;
                case '-': System.out.println("Diff = " + (a - b)); break;
                case '*': System.out.println("Product = " + (a * b)); break;
                case '/': System.out.println("Div = " + (a / b)); break;
                default: System.out.println("Invalid operator");
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
}
```

---

### 🔸 Example 4: **Factorial of a Number using `for`**

```java
public class Factorial {
    public static void main(String[] args) {
        int num = 5, fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
```

---

### 🔸 Example 5: **Fibonacci Series up to N terms**

```java
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;

        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
```

---

### 🔸 Example 6: **Reverse a Number using `while`**

```java
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345, rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed: " + rev);
    }
}
```

---

### 🔸 Example 7: **Print 2D Array using Nested `for`**

```java
public class PrintMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

### 🔸 Example 8: **Loop with `break` and `continue`**

```java
public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;  // skip 5
            if (i == 9) break;     // stop at 9
            System.out.print(i + " ");
        }
    }
}
```

---

### 🔸 Example 9: **Loop through Array using `for-each`**

```java
public class ForEachExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
```

---

### 🔸 Example 10: **Pattern Printing – Pyramid**

```java
public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 2*i - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
```

---

### 🔸 Example 11: **Sum of Digits**

```java
public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234, sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum: " + sum);
    }
}
```

---

**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible introduction to the Java programming language.
