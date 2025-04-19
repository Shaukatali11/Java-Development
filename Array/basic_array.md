## 🧠 What is an Array?

An **array** in Java is a **container object** that holds **a fixed number of values** of a **single data type**.

### 🔹 Key Points:
- Stores elements **in contiguous memory**.
- Fixed size once created.
- Index-based access (`0` to `length-1`).
- Can be **1D, 2D, or multi-dimensional**.
- Can store **primitive types** (`int`, `double`, etc.) or **objects** (`String`, `Student`, etc.).

---

## ✅ Array Declaration, Creation & Initialization

```java
int[] arr1;           // declaration
arr1 = new int[5];    // creation

int[] arr2 = new int[3];              // declaration + creation
int[] arr3 = {1, 2, 3, 4};            // initialization
String[] names = {"Alice", "Bob"};    // string array
```

---

## 🧪 Common Properties

- `arr.length`: gives the number of elements
- Arrays are **zero-indexed**: `arr[0]` is the first element

---

## 📦 Array Types

| Type     | Description                   |
|----------|-------------------------------|
| 1D Array | Single row/column of elements |
| 2D Array | Matrix form (rows x cols)     |
| Jagged   | Uneven sub-arrays             |
| Object[] | Array of objects like String  |

---

## 🔁 Traversing Arrays

```java
for (int i = 0; i < arr.length; i++)
    System.out.println(arr[i]);

for (int x : arr) // for-each loop
    System.out.println(x);
```

---

## 💡 10+ Array Coding Examples (With Explanation)

---

### 🔸 Example 1: **Initialize and Print Array**

```java
public class ArrayBasics {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
```

---

### 🔸 Example 2: **Sum and Average of Elements**

```java
public class ArraySumAvg {
    public static void main(String[] args) {
        int[] marks = {90, 80, 70};
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double avg = (double) sum / marks.length;
        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}
```

---

### 🔸 Example 3: **Find Maximum and Minimum**

```java
public class MaxMinArray {
    public static void main(String[] args) {
        int[] nums = {10, 25, 5, 40};

        int max = nums[0], min = nums[0];
        for (int n : nums) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Max: " + max + ", Min: " + min);
    }
}
```

---

### 🔸 Example 4: **Reverse an Array**

```java
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

---

### 🔸 Example 5: **Search an Element in Array**

```java
public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 9};
        int key = 2;
        boolean found = false;

        for (int val : arr) {
            if (val == key) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}
```

---

### 🔸 Example 6: **Check Array is Sorted**

```java
public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted ? "Sorted" : "Not Sorted");
    }
}
```

---

### 🔸 Example 7: **Copy One Array into Another**

```java
public class CopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        for (int num : copy)
            System.out.print(num + " ");
    }
}
```

---

### 🔸 Example 8: **2D Array: Input and Print**

```java
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2x3 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }
    }
}
```

---

### 🔸 Example 9: **Frequency of Elements**

```java
public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2, 1};
        int[] freq = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            if (freq[i] == visited) continue;

            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
            }

            freq[i] = count;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited)
                System.out.println(arr[i] + " occurs " + freq[i] + " times");
        }
    }
}
```

---

### 🔸 Example 10: **Sort Array in Ascending Order**

```java
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2};
        Arrays.sort(arr);

        for (int val : arr)
            System.out.print(val + " ");
    }
}
```

---

### 🔸 Example 11: **Find Second Largest Element**

```java
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 6};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }

        System.out.println("Second Largest: " + second);
    }
}
```

---


**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible introduction to the Java programming language.
