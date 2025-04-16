# 📘 Java User Input – Notes & Examples


---

## 📌 Overview

In Java, the **`Scanner`** class is most commonly used to read input from the user (keyboard). It's part of the `java.util` package.

### 🔑 Syntax
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

Once you’ve created a `Scanner` object, you can use it to take input of various types.

---

## 🛠 Common `Scanner` Methods

| Method               | Type Read                  | Example             |
|----------------------|----------------------------|---------------------|
| `nextInt()`          | Integer                    | `int x = sc.nextInt();` |
| `nextFloat()`        | Float                      | `float f = sc.nextFloat();` |
| `nextDouble()`       | Double                     | `double d = sc.nextDouble();` |
| `next()`             | Single word                | `String s = sc.next();` |
| `nextLine()`         | Whole line (with spaces)   | `String line = sc.nextLine();` |
| `nextBoolean()`      | true / false               | `boolean b = sc.nextBoolean();` |

---

## 📂 GitHub-Style Code Files

---

### 📄 `01_InputNumber.java`

```java
// java-basics/user-input/01_InputNumber.java

import java.util.Scanner;

public class InputNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.println("You entered: " + num);
    }
}
```

---

### 📄 `02_InputStringWordVsLine.java`

```java
// java-basics/user-input/02_InputStringWordVsLine.java

import java.util.Scanner;

public class InputStringWordVsLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single word: ");
        String word = sc.next(); // Reads only till space

        sc.nextLine(); // Flush leftover newline

        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine(); // Reads full line

        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);
    }
}
```

🧠 **Note**: After `next()`, you **must call `nextLine()` once** to consume the remaining newline.

---

### 📄 `03_InputArray.java`

```java
// java-basics/user-input/03_InputArray.java

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

### 📄 `04_Input2DArray.java`

```java
// java-basics/user-input/04_Input2DArray.java

import java.util.Scanner;

public class Input2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
```

---

### 📄 `05_MixedInputExample.java`

```java
// java-basics/user-input/05_MixedInputExample.java

import java.util.Scanner;

public class MixedInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your GPA: ");
        float gpa = sc.nextFloat();

        sc.nextLine(); // flush newline
        System.out.print("Enter your favorite quote: ");
        String quote = sc.nextLine();

        System.out.println("\nHello, " + name + "!");
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Favorite Quote: \"" + quote + "\"");
    }
}
```

---

## 🧠 Extra Notes

### 🔄 Flushing the Scanner
Always flush `sc.nextLine()` after `nextInt()`, `nextDouble()`, etc., to avoid input skipping due to leftover `\n`.

### 📌 Input for Different Types
- 🔢 `int`, `float`, `double` → `nextInt()`, `nextFloat()`, `nextDouble()`
- 🆔 `String` (one word) → `next()`
- ✏️ Full sentence → `nextLine()`
- 📑 Array → loop + `nextInt()`
- 🔲 2D Array → nested loops + `nextInt()`

---


**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible introduction to the Java programming language.
