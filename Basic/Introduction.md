## 📌 What is Java?

**Java** is a **general-purpose**, **object-oriented**, **platform-independent** programming language created by **Sun Microsystems** (now owned by Oracle).

### 🔥 Key Features:
- **Write Once, Run Anywhere (WORA)** – thanks to JVM (Java Virtual Machine)
- Object-Oriented (everything revolves around classes/objects)
- Secure and Robust
- Used in large-scale enterprise systems

---

## 🛠️ What is Java Used For?

Java is used to build:
- Android Apps 📱
- Web Applications 🌐 (e.g., using Spring Framework)
- Desktop Applications 💻 (e.g., IntelliJ IDEA is itself built using Java)
- Embedded Systems 🔌
- Enterprise Software (Banking, E-commerce apps)
- Game Development 🎮 (e.g., Minecraft is written in Java)

---

## 🌍 Real-World Software Made with Java

| Software/Application | Description |
|----------------------|-------------|
| **Minecraft**        | Popular game, completely written in Java |
| **IntelliJ IDEA**    | Java IDE, built using Java & Swing |
| **Eclipse IDE**      | Another Java IDE used by developers |
| **LinkedIn backend** | Some parts are powered by Java |
| **Android Apps**     | Java was the primary language before Kotlin |

---

## 🧑‍💻 Why Do We Use Java?

- Large community and ecosystem
- Rich set of APIs
- Huge number of libraries and frameworks (Spring, Hibernate)
- Great for enterprise-level projects
- Runs on any device with JVM installed

---

## 🧩 Difference Between JDK and JRE

| Term | Full Form | Purpose |
|------|-----------|---------|
| **JDK** | Java Development Kit | Includes everything needed to write, compile, and run Java programs (JRE + Compiler + Tools) |
| **JRE** | Java Runtime Environment | Allows you to **run** Java programs but not develop them (includes JVM + libraries) |

**TL;DR:**  
- Want to **run** a Java program → Use **JRE**  
- Want to **write & compile** Java code → Install **JDK**

---

## 🛠️ How to Install Java (JDK) and IntelliJ IDEA

### 🔽 Step 1: Download and Install JDK
1. Visit: https://www.oracle.com/java/technologies/javase-downloads.html
2. Choose your OS (Windows/Linux/Mac)
3. Download JDK (e.g., JDK 21)
4. Install it, then set `JAVA_HOME` and add JDK to `PATH` environment variable

### 🔽 Step 2: Download IntelliJ IDEA
1. Visit: https://www.jetbrains.com/idea/download/
2. Choose **Community Edition** (free)
3. Install like any normal software
4. Open IntelliJ, start a new Java project (with JDK linked)

---

## 📄 Basic Java Programs (Human Style - GitHub style)

### 🧪 Program 1: Hello World

```java
// File: HelloWorld.java

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("👋 Hello, World from Java!");
    }
}
```

**💬 Output:**
```
👋 Hello, World from Java!
```

> 🔍 This is the simplest Java program. It has a `main` method which is the entry point of any Java app.

---

### 🧮 Program 2: Add Two Numbers

```java
// File: AddTwoNumbers.java

public class AddTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("🧮 Sum is: " + sum);
    }
}
```

**💬 Output:**
```
🧮 Sum is: 30
```

> 🔍 This demonstrates variable declaration, addition, and printing the result.

---

**About the Creator:**

This guide was created by Md Shaukat Ali from NIT Durgapur, aiming to provide a clear and accessible introduction to the Java programming language.
