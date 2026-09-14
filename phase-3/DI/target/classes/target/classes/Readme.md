# Java Spring Dependency Injection (DI) Guide

This guide covers the core concepts of **Dependency Injection (DI)** in Spring Boot, how it supports loose coupling, and
the three different ways to inject dependencies into your classes.

---

## What is Dependency Injection?

Dependency Injection is a design pattern used to achieve **Inversion of Control (IoC)** between classes and their
dependencies. Instead of a class hardcoding or instantiating its own dependencies (using the `new` keyword), those
dependencies are "injected" (passed in) from the outside by the Spring container.

### Why use DI?

* **Loose Coupling:** Classes are independent of how their dependencies are created.
* **Easy Testing:** You can easily mock dependencies when writing unit tests.
* **Maintainability:** Changing an implementation does not require rewriting the classes that consume it.

---

## The Three Types of Dependency Injection

Spring supports three primary styles of dependency injection. Below is how each one looks in practice using a
`NotificationService` example.

### 1. Constructor Injection (Recommended)

Dependencies are provided as parameters through the class constructor. Spring automatically resolves and passes them
when the bean is created.

* **Key Benefit:** Allows fields to be marked `final` (ensuring immutability), prevents `NullPointerException`, and
  makes unit testing effortless in pure Java.

```java

@SpringBootApplication
public class DependencyInjection {

    private final NotificationService notificationService;

    // Constructor Injection (Spring automatically wires this)
    public DependencyInjection(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // ... main method and beans
}

```

---

### 2. Setter Injection

Dependencies are injected by the container calling a public `setter` method *after* the object has been instantiated
using a no-arg constructor.

* **Key Benefit:** Useful for optional dependencies or properties that need to be re-configured at runtime.
* **Drawback:** Fields cannot be `final` and run the risk of being `null` if the setter is missed.

```java

@SpringBootApplication
public class DependencyInjection {

    private NotificationService notificationService;

    // Setter Injection
    @Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // ... main method and beans
}

```

---

### 3. Field Injection

Dependencies are injected directly into class fields via reflection using the `@Autowired` annotation. No constructors
or setters are required.

* **Key Benefit:** Boilerplate-free and keeps code looking clean at first glance.
* **Drawback:** Discouraged by the Spring team because it hides dependencies, prevents immutability (`final`), and makes
  manual unit testing difficult without a framework.

```java

@SpringBootApplication
public class DependencyInjection {

    // Field Injection
    @Autowired
    private NotificationService notificationService;

    // ... main method and beans
}

```

---

## Summary Comparison

| Injection Type  | Immutability (`final`) | Mandatory? | Spring Recommendation              |
|-----------------|------------------------|------------|------------------------------------|
| **Constructor** | Yes                    | Yes        | **Recommended Best Practice**      |
| **Setter**      | No                     | Optional   | Use for optional dependencies only |
| **Field**       | No                     | Yes        | **Avoid**                          |



## 