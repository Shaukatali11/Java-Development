## 🧠 THEORY: Conditional Statements in Java

Conditional statements are used to perform different actions based on different conditions. Java provides the following types:

### 1. `if` statement
- Executes block if condition is true.
```java
if (condition) {
    // code
}
```

### 2. `if-else` statement
```java
if (condition) {
    // true block
} else {
    // false block
}
```

### 3. `if-else if-else` ladder
```java
if (cond1) {
    // block1
} else if (cond2) {
    // block2
} else {
    // default block
}
```

### 4. `switch-case`
- Used when a variable is tested against multiple values.
```java
switch(expression) {
    case value1: // code
        break;
    case value2: // code
        break;
    default: // default code
}
```

---

## 💻 10+ Coding Examples

---

### 🔸 Example 1: **Check Positive or Negative**

```java
public class PositiveOrNegative {
    public static void main(String[] args) {
        int num = -10;
        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
```

---

### 🔸 Example 2: **Check Even or Odd**

```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
```

---

### 🔸 Example 3: **Find Largest of Three Numbers**

```java
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 30, b = 25, c = 45;

        if (a >= b && a >= c)
            System.out.println("Largest: " + a);
        else if (b >= a && b >= c)
            System.out.println("Largest: " + b);
        else
            System.out.println("Largest: " + c);
    }
}
```

---

### 🔸 Example 4: **Check Leap Year**

```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
```

---

### 🔸 Example 5: **Grade System Using if-else-if**

```java
public class GradeSystem {
    public static void main(String[] args) {
        int marks = 76;

        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 80)
            System.out.println("Grade: B");
        else if (marks >= 70)
            System.out.println("Grade: C");
        else if (marks >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}
```

---

### 🔸 Example 6: **Menu-Driven Program using `switch-case`**

```java
import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int choice = sc.nextInt();
        int a = 10, b = 5;

        switch (choice) {
            case 1: System.out.println("Sum: " + (a + b)); break;
            case 2: System.out.println("Diff: " + (a - b)); break;
            case 3: System.out.println("Product: " + (a * b)); break;
            case 4: System.out.println("Quotient: " + (a / b)); break;
            default: System.out.println("Invalid Option");
        }
    }
}
```

---

### 🔸 Example 7: **Day of Week using `switch-case`**

```java
public class DayOfWeek {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid Day");
        }
    }
}
```

---

### 🔸 Example 8: **Check Character is Vowel or Consonant**

```java
public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'E';

        switch (Character.toLowerCase(ch)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Vowel"); break;
            default:
                System.out.println("Consonant");
        }
    }
}
```

---

### 🔸 Example 9: **Simple ATM Menu (withdraw, deposit, check balance)**

```java
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance: " + balance);
                break;
            case 2:
                System.out.print("Enter amount: ");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("Updated Balance: " + balance);
                break;
            case 3:
                System.out.print("Enter amount: ");
                int withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Updated Balance: " + balance);
                } else {
                    System.out.println("Insufficient Funds");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
```

---

### 🔸 Example 10: **Nested if: Login System**

```java
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "1234";

        System.out.print("Enter username: ");
        String userInput = sc.nextLine();

        if (userInput.equals(username)) {
            System.out.print("Enter password: ");
            String passInput = sc.nextLine();
            if (passInput.equals(password)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            System.out.println("User Not Found");
        }
    }
}
```

---

**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible introduction to the Java programming language.

