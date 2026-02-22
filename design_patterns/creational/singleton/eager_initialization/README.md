# Singleton Design Pattern – Eager Initialization

##  Overview

This project demonstrates the **Singleton Design Pattern** using the **Eager Initialization** approach in Java.

The Singleton pattern ensures that:

- Only **one instance** of a class exists
- A **global access point** is provided to that instance

---

##  What is Eager Initialization?

In eager initialization, the Singleton instance is created at the time of **class loading**.

This means the object is created even before it is actually used in the application.

---

## Implementation

```java
package creational.singleton.eager_initialization;

public class SingleTon {

    private static final SingleTon obj = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        return obj;
    }
}

```

---

## How It Works

1. When the JVM loads the `SingleTon` class, it immediately creates the static instance.
2. The constructor is marked `private`, so no other class can create an object using `new`.
3. The `getInstance()` method always returns the same object.
4. Class loading in Java is thread-safe, so this implementation is automatically thread-safe.

---

## 🔍 Real-Time Example

### Example: Logger System

In a real-world application, you may want only one logger instance.

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

Both references point to the same object.

---

##  Advantages

1. **Thread-Safe by Default**  
   No synchronization required.

2. **Simple Implementation**  
   Easy to understand and maintain.

3. **Better Performance**  
   No locking or synchronization overhead.

4. **Controlled Access**  
   Prevents multiple object creation.

---

##  Disadvantages

1. **No Lazy Loading**  
   Object is created even if never used.

2. **Memory Consumption**  
   May waste memory if instance is heavy and unused.

3. **Difficult to Unit Test**  
   Global state makes testing harder.

---

## When to Avoid

Avoid eager Singleton when:

- Object creation is expensive
- Instance may not always be required
- You need better scalability
- You are using Dependency Injection frameworks (like Spring)

