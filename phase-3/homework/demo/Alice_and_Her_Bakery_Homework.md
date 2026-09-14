# Homework 4 — Alice and her Bakery

## Objective

Build a small Java application to practice:

- Interfaces
- Interface implementations
- Dependency Injection (DI)
- Constructor injection
- Dependency inversion / loose coupling

---

## Problem Statement

Create a class called `CakeBaker` that depends on two other types:

- `Frosting`
- `Syrup`

`CakeBaker` should have a function called:

```java
bakeCake()
```

Create two interfaces:

```text
Frosting
Syrup
```

with these methods:

```text
getFrostingType()
getSyrupType()
```

Create implementations for two flavors:

- Chocolate
- Strawberry

Therefore, you should have **4 implementation classes** in total:

```text
ChocolateFrosting
StrawberryFrosting
ChocolateSyrup
StrawberrySyrup
```

Use **Dependency Injection** to inject the `Frosting` and `Syrup` dependencies into `CakeBaker`.

Then use the injected dependencies when calling `bakeCake()`.

---

# Suggested Project Structure

You can organize your project like this:

```text
src/
└── bakery/
    ├── CakeBaker.java
    │
    ├── Frosting.java
    ├── ChocolateFrosting.java
    └── StrawberryFrosting.java
    │
    ├── Syrup.java
    ├── ChocolateSyrup.java
    └── StrawberrySyrup.java
    │
    └── Main.java
```

---

# 1. Frosting Interface

Create:

```java
public interface Frosting {

    // TODO: return the frosting type
    String getFrostingType();
}
```

Think about:

- What should the method return?
- Should the interface know whether the frosting is chocolate or strawberry?

---

# 2. Syrup Interface

Create:

```java
public interface Syrup {

    // TODO: return the syrup type
    String getSyrupType();
}
```

---

# 3. Chocolate Frosting

Create a class:

```java
public class ChocolateFrosting implements Frosting {

    @Override
    public String getFrostingType() {
        // TODO
    }
}
```

Decide what value this method should return.

---

# 4. Strawberry Frosting

Create:

```java
public class StrawberryFrosting implements Frosting {

    @Override
    public String getFrostingType() {
        // TODO
    }
}
```

---

# 5. Chocolate Syrup

Create:

```java
public class ChocolateSyrup implements Syrup {

    @Override
    public String getSyrupType() {
        // TODO
    }
}
```

---

# 6. Strawberry Syrup

Create:

```java
public class StrawberrySyrup implements Syrup {

    @Override
    public String getSyrupType() {
        // TODO
    }
}
```

---

# 7. CakeBaker — Main DI Practice

This is the most important class.

Start with:

```java
public class CakeBaker {

    private Frosting frosting;
    private Syrup syrup;

    // TODO: create constructor injection

    // TODO: create bakeCake()
}
```

### Your task

Make `CakeBaker` receive its dependencies from outside.

Think about this:

```text
Main
 │
 │ creates
 ▼
ChocolateFrosting
 │
 └──────────────┐
                │
                ▼
             CakeBaker
                ▲
                │
 ┌──────────────┘
 │
ChocolateSyrup
```

The important idea is:

> `CakeBaker` should NOT create `ChocolateFrosting` or `StrawberryFrosting` itself.

Avoid doing this inside `CakeBaker`:

```java
Frosting frosting = new ChocolateFrosting();
Syrup syrup = new ChocolateSyrup();
```

Instead, the objects should be supplied to `CakeBaker`.

---

# 8. bakeCake ()

Inside `CakeBaker`, your `bakeCake()` method should use the injected dependencies.

Conceptually:

```text
bakeCake()
   │
   ├── ask frosting → getFrostingType()
   │
   ├── ask syrup → getSyrupType()
   │
   └── print/display the cake information
```

You decide the exact output.

For example, the output could communicate something like:

```text
Baking cake...
Frosting: Chocolate
Syrup: Strawberry
```

You don't have to use this exact wording.

---

# 9. Main Class

Create a `Main` class.

Your job is to:

1. Create a frosting implementation.
2. Create a syrup implementation.
3. Inject them into `CakeBaker`.
4. Call `bakeCake()`.

Start with this skeleton:

```java
public class Main {

    public static void main(String[] args) {

        // TODO: create Frosting object

        // TODO: create Syrup object

        // TODO: inject both into CakeBaker

        // TODO: call bakeCake()
    }
}
```

---

# 10. Experiment With Different Combinations

Once your basic solution works, try different combinations.

For example:

```text
Chocolate Frosting + Chocolate Syrup

Chocolate Frosting + Strawberry Syrup

Strawberry Frosting + Chocolate Syrup

Strawberry Frosting + Strawberry Syrup
```

The interesting part is that `CakeBaker` itself should not need to change.

Only the dependencies you inject should change.

---

# DI Concept You Should Understand

The goal is to achieve something like:

```text
                 ┌─────────────────────┐
                 │      CakeBaker      │
                 │                     │
                 │  Frosting frosting  │
                 │  Syrup syrup        │
                 └──────────┬──────────┘
                            │
                   dependencies injected
                            │
             ┌──────────────┴──────────────┐
             ▼                             ▼
      ┌───────────────┐             ┌───────────────┐
      │    Frosting   │             │     Syrup     │
      │   interface   │             │   interface   │
      └───────┬───────┘             └───────┬───────┘
              │                             │
        ┌─────┴─────┐                 ┌─────┴─────┐
        ▼           ▼                 ▼           ▼
   Chocolate   Strawberry        Chocolate   Strawberry
```

---

# Questions to Ask Yourself While Solving

Don't look for the answers immediately. Try to answer these yourself:

### Q1. Why should `CakeBaker` depend on an interface instead of a concrete class?

### Q2. Where should `new ChocolateFrosting()` happen?

### Q3. Where should `new StrawberrySyrup()` happen?

### Q4. Why is constructor injection useful here?

### Q5. Can I change from Chocolate to Strawberry without modifying `CakeBaker`?

### Q6. What happens if we create a new `VanillaFrosting` later?

Ideally, you should only need to create:

```java
class VanillaFrosting implements Frosting
```

and inject it into `CakeBaker`.

---

# Constraints

Try to solve it without:

- Spring
- Spring Boot
- Any DI framework
- Static/global dependencies

Use **plain Java** first.

The objective is to understand the Dependency Injection concept before using a framework.

---

# Bonus Challenge

After completing the basic version, try this:

### Challenge 1

Create:

```text
VanillaFrosting
VanillaSyrup
```

without modifying `CakeBaker`.

### Challenge 2

Create a cake with:

```text
Strawberry Frosting
Chocolate Syrup
```

### Challenge 3

Try setter injection instead of constructor injection.

Compare:

```text
Constructor Injection
vs
Setter Injection
```

Which one makes more sense for `CakeBaker`?

---

# Expected Learning

By the end, you should understand this relationship:

```text
Concrete implementation
        ↓
implements
        ↓
Interface
        ↓
injected into
        ↓
CakeBaker
```

And especially this principle:

> **The class that needs a dependency should receive it from outside rather than creating it itself.**
