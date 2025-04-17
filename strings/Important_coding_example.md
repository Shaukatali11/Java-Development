# Coding examples related to Strings and Sentences
### 📄 1. **Find the First Non-Repeated Character**

```java
import java.util.HashMap;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        System.out.println("First non-repeated character: " + findFirstNonRepeating(input));
    }

    public static char findFirstNonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return '-'; // In case no non-repeating char found
    }
}
```

---

### 📄 2. **Check if a String is Anagram of Another**

```java
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Are the two strings anagrams? " + isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
```

---

### 📄 3. **Count Words in a Sentence**

```java
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word Count: " + words.length);
    }
}
```

---

### 📄 4. **Remove Duplicate Characters from a String**

```java
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        System.out.println("String without duplicates: " + removeDuplicateChars(input));
    }

    public static String removeDuplicateChars(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
}
```

---

### 📄 5. **Check if a String is a Palindrome**

```java
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String reverse = new StringBuilder(str).reverse().toString();
        
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
```

---

### 📄 6. **Find the Longest Palindromic Substring**

```java
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Longest Palindrome: " + longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        
        String longest = s.substring(0, 1);
        
        for (int i = 0; i < s.length(); i++) {
            String temp = expandAroundCenter(s, i, i);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
            
            temp = expandAroundCenter(s, i, i + 1);
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }
        
        return longest;
    }

    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
```

---

### 📄 7. **Convert String to Integer Without Using Integer.parseInt()**

```java
public class StringToInteger {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println("Converted Integer: " + stringToInt(str));
    }

    public static int stringToInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }
        return result;
    }
}
```

---

### 📄 8. **Count Frequency of Each Character in a String**

```java
import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "aabbcc";
        countCharFrequency(str);
    }

    public static void countCharFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            System.out.println(c + ": " + map.get(c));
        }
    }
}
```

---

### 📄 9. **Find the Most Frequent Character in a String**

```java
import java.util.HashMap;

public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println("Most frequent character: " + mostFrequentChar(str));
    }

    public static char mostFrequentChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxCount = 1;
        for (char c : map.keySet()) {
            if (map.get(c) > maxCount) {
                maxCount = map.get(c);
                maxChar = c;
            }
        }

        return maxChar;
    }
}
```

---

### 📄 10. **Convert Sentence to Title Case**

```java
import java.util.Scanner;

public class TitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Title Case: " + toTitleCase(sentence));
    }

    public static String toTitleCase(String str) {
        String[] words = str.split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            titleCase.append(word.substring(0, 1).toUpperCase())
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
        }

        return titleCase.toString().trim();
    }
}
```

---

### 📄 11. **Reverse Each Word in a Sentence**

```java
public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Java is awesome";
        System.out.println("Reversed words: " + reverseWords(sentence));
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        return reversed.toString().trim();
    }
}
```

---

### 📄 12. **Remove All White Spaces from a String**

```java
import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("String without spaces: " + removeSpaces(str));
    }

    public static String removeSpaces(String str) {
        return str.replaceAll("\\s", "");
    }
}
```

---

### 📄 13. **Find the Longest Word in a Sentence**

```java
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Longest word: " + findLongestWord(sentence));
    }

    public static String findLongestWord(String str) {
        String[] words = str.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
```
... (rest of your content)

---

**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible introduction to the Java programming language.
