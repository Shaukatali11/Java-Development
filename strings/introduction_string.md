# 📘 Java Strings – Deep Dive with Code

---

## 🔍 What is a String?

- In Java, a `String` is **not a primitive** — it's a **class in `java.lang` package**.
- Strings are **immutable** — once created, their value **cannot be changed**.

```java
String name = "Java";  // String literal
String another = new String("Java");  // String object
```

---

## 🔐 Why Strings are Immutable?

- For **security** (e.g., passwords in memory).
- **Thread-safe** by default.
- Used in **String pool** for performance optimization.

---

## 📦 String Methods (Most Used)

| Method                        | Description                                  | Example                              |
|------------------------------|----------------------------------------------|--------------------------------------|
| `length()`                   | Returns length of the string                 | `str.length()`                       |
| `charAt(int index)`          | Returns char at given index                  | `str.charAt(2)`                      |
| `substring(int begin, end)`  | Extract substring                            | `str.substring(2,5)`                 |
| `contains(String)`           | Checks if substring is present               | `str.contains("abc")`                |
| `equals(String)`             | Compares two strings                         | `str.equals("Java")`                 |
| `equalsIgnoreCase(String)`   | Ignores case while comparing                 | `str.equalsIgnoreCase("java")`       |
| `compareTo(String)`          | Lexicographical compare                      | `str1.compareTo(str2)`               |
| `startsWith(String)`         | Checks beginning                            | `str.startsWith("Hello")`            |
| `endsWith(String)`           | Checks end                                   | `str.endsWith(".com")`               |
| `toLowerCase()`              | Converts to lowercase                        | `str.toLowerCase()`                  |
| `toUpperCase()`              | Converts to uppercase                        | `str.toUpperCase()`                  |
| `trim()`                     | Removes leading/trailing spaces              | `str.trim()`                         |
| `replace(old, new)`          | Replaces char or substring                   | `str.replace("a", "e")`              |
| `split(delimiter)`           | Splits into array                            | `str.split(" ")`                     |
| `indexOf(String)`            | Finds position of first occurrence           | `str.indexOf("a")`                   |
| `lastIndexOf(String)`        | Finds last occurrence                        | `str.lastIndexOf("a")`               |
| `isEmpty()`                  | Checks if string is empty                    | `str.isEmpty()`                      |
| `join(delim, args...)`       | Joins multiple strings                       | `String.join("-", "a", "b")`         |
| `valueOf(any)`               | Converts to string                           | `String.valueOf(123)`                |

---

## 💡 Immutable Example

```java
public class ImmutableDemo {
    public static void main(String[] args) {
        String a = "Hello";
        a.concat(" World"); // not stored
        System.out.println(a); // Hello

        a = a.concat(" World");
        System.out.println(a); // Hello World
    }
}
```

---

## 📂 GitHub-Style: `strings/01_StringMethods.java`

```java
public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";

        System.out.println("Original: '" + str + "'");
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Upper: " + str.toUpperCase());
        System.out.println("Lower: " + str.toLowerCase());
        System.out.println("Char at 6: " + str.charAt(6));
        System.out.println("Substring(6,10): " + str.substring(6, 10));
        System.out.println("Contains 'Java'? " + str.contains("Java"));
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println("Split by space:");
        for (String word : str.trim().split(" ")) {
            System.out.println("- " + word);
        }
    }
}
```

---

## 🧪 10+ User Input String Programs

> 🔁 Use `Scanner` for input:
```java
import java.util.Scanner;
```

---

### 📄 01_ReadSimpleString.java

```java
import java.util.Scanner;

public class ReadSimpleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next(); // single word input

        System.out.println("Hello, " + name + "!");
    }
}
```

---

### 📄 02_ReadSentence.java

```java
import java.util.Scanner;

public class ReadSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine(); // whole line input

        System.out.println("You entered: " + sentence);
    }
}
```

---

### 📄 03_StringLength.java

```java
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type something: ");
        String input = sc.nextLine();

        System.out.println("Length: " + input.length());
    }
}
```

---

### 📄 04_ReverseString.java

```java
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}
```

---

### 📄 05_CheckPalindrome.java

```java
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}
```

---

### 📄 06_CountVowels.java

```java
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str = sc.nextLine().toLowerCase();

        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }

        System.out.println("Vowels: " + count);
    }
}
```

---

### 📄 07_CompareStrings.java

```java
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First string: ");
        String a = sc.nextLine();

        System.out.print("Second string: ");
        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are different.");
        }
    }
}
```

---

### 📄 08_WordCount.java

```java
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word Count: " + words.length);
    }
}
```

---

### 📄 09_CharFrequency.java

```java
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = sc.nextLine();

        System.out.print("Character to count: ");
        char ch = sc.next().charAt(0);

        int freq = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) freq++;
        }

        System.out.println("Frequency of '" + ch + "': " + freq);
    }
}
```

---

### 📄 10_SplitToArray.java

```java
import java.util.Scanner;

public class SplitToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("CSV input (comma separated): ");
        String csv = sc.nextLine();

        String[] values = csv.split(",");

        for (String val : values) {
            System.out.println("- " + val.trim());
        }
    }
}
```

---

**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible introduction to the Java programming language.

