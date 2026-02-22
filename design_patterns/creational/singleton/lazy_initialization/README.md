# Singleton Design Pattern – Lazy Initialization

##  Overview

This project demonstrates the **Singleton Design Pattern** using the **Lazy Initialization** approach in Java.

The Singleton pattern ensures that:

- Only **one instance** of a class exists
- A **global access point** is provided to that instance

In Lazy Initialization, the object is created **only when it is needed**.

---

##  What is Lazy Initialization?

In lazy initialization, the Singleton instance is created:

> Only when `getInstance()` is called for the first time.

This improves memory efficiency because the object is not created at class loading time.

---

##  Implementation

```java
package creational.singleton.lazy_initialization;

public class SingleTon {

    private static SingleTon obj;

    // Private constructor prevents external instantiation
    private SingleTon() {
    }

    // Instance created only when requested
    public static SingleTon getInstance() {
        if (obj == null) {
            obj = new SingleTon();
        }
        return obj;
    }
}
```

---

##  How It Works

1. The static variable `obj` is initially `null`.
2. When `getInstance()` is called:
    - It checks if `obj` is `null`.
    - If yes, it creates a new object.
    - If not, it returns the existing object.
3. The instance is created only once and reused afterward.

---

## Real-Time Example

### Example: Database Connection Manager

Suppose creating a database connection is expensive.

Instead of creating it at application startup,  
you create it only when it is first required.

```java
public class App {
    public static void main(String[] args) {
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();

        System.out.println(obj1 == obj2);  // true
    }
}
```

Output:

```
true
```

Both references point to the same instance.

---


## Advantages

1. **Memory Efficient**  
   Object is created only when needed.

2. **Better Startup Performance**  
   Application loads faster since object is not created at class loading time.

3. **Simple Implementation**

---

##  Disadvantages

1. **Not Thread-Safe** 
   In multithreaded environments, multiple threads may create multiple instances.

2. **Race Condition Possible**  
   If two threads enter `getInstance()` simultaneously, two objects may be created.

3. **Needs Extra Handling for Thread Safety**  
   Requires synchronization or advanced techniques like:
    - Synchronized method
    - Double-Checked Locking
    - Bill Pugh Singleton
    - Enum Singleton

---

##  When to Avoid

Avoid this basic lazy implementation when:

- Your application is multi-threaded
- Thread safety is critical
- High concurrency is expected

In such cases, use:

- Thread-safe Lazy Singleton
- Double-Checked Locking
- Bill Pugh Implementation
- Enum Singleton

