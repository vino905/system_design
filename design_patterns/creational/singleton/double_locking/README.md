# Singleton Design Pattern – Double-Checked Locking (Thread-Safe Lazy Initialization)

##  Overview

This demonstrates the **Singleton Design Pattern** using the **Double-Checked Locking** approach in Java.

This approach provides:

- Lazy Initialization (object created only when needed)
- Thread Safety
- Better performance compared to full method synchronization

---

##  Why Double-Checked Locking?

Basic Lazy Initialization is **not thread-safe**.

If multiple threads call `getInstance()` at the same time,  
multiple objects may be created.

Double-Checked Locking solves this by:

1. Checking `null` before locking
2. Locking only when necessary
3. Checking `null` again inside synchronized block

This ensures:

- Only one instance is created
- Synchronization happens only once

---

##  Implementation

```java
package creational.singleton.double_locking;

public class SingleTon {

    private static volatile SingleTon obj;

    private SingleTon() {
    }

    public static SingleTon getInstance() {

        if (obj == null) { // First check (no locking)
            synchronized (SingleTon.class) {
                if (obj == null) { // Second check (with locking)
                    obj = new SingleTon();
                }
            }
        }
        return obj;
    }
}
```

---

##  How It Works

### Step 1: First Null Check
If `obj` is not null → return it immediately (no synchronization needed).

### Step 2: Synchronization
If `obj` is null → lock the class to prevent multiple threads entering.

### Step 3: Second Null Check
Check again inside synchronized block to ensure another thread hasn’t already created the instance.

### Step 4: Create Object
If still null → create new instance.

---
#  Why `volatile` Is Required?

Without `volatile`, this implementation may fail in rare cases due to **instruction reordering**.

---

##  What Actually Happens Internally?

When you write:

```java
obj = new SingleTon();
```

It does NOT happen in one step.

It happens in 3 steps internally:

1️⃣ Allocate memory  
2️⃣ Initialize the object (call constructor)  
3️⃣ Assign reference to `obj`

---

##  The Problem: Instruction Reordering

JVM and CPU are allowed to reorder instructions for performance.

So steps can become:

1️⃣ Allocate memory  
2️⃣ Assign reference to `obj`  
3️⃣ Initialize the object

 This is the dangerous case.

---

##  What Goes Wrong?

Imagine two threads:

### Thread 1

- Enters `getInstance()`
- Starts creating object
- Due to reordering:
    - Memory allocated
    - `obj` is assigned (but NOT fully initialized yet)

### Thread 2

- Enters `getInstance()`
- Sees `obj != null`
- Returns it immediately

But object is **not fully constructed yet** 

---

## This Can Lead To

- Unexpected behavior
- NullPointerException
- Corrupted object state
- Very hard-to-debug concurrency bugs

---

##  Real-Time Example

### Example: Database Connection Pool

Suppose:

- Creating connection pool is expensive
- Application is multi-threaded
- You want lazy initialization
- But must ensure only one instance exists

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

Even in multi-threaded environments, only one instance is created.

---

##  Advantages

1. **Thread-Safe**
2. **Lazy Initialization**
3. **Better Performance**
   Synchronization happens only once.
4. **Memory Efficient**

---

##  Disadvantages

1. **More Complex Code**
2. **Harder to Understand**
3. **Requires volatile**
4. Slightly harder to maintain compared to simpler approaches

---

##  When to Avoid

Avoid if:

- Application is single-threaded (use simple lazy)
- You want cleaner implementation (use Bill Pugh method)
- You prefer safest approach (use Enum Singleton)
