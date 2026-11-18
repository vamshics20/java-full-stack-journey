# ☕ Java Full Stack Journey

My daily learning log on the way to becoming a **Java Full Stack Developer** — from Core Java to deployed full stack apps.

**Started:** 15 Nov 2026 · **Target:** job-ready by May 2027

## 🗺️ Roadmap

| Phase | Months | Topics | Status |
|---|---|---|---|
| 1 | Nov – Dec 2026 | Core Java, OOP, Collections, Exceptions | 🟢 In progress |
| 2 | Jan 2027 | SQL, JDBC, Git | ⚪ Upcoming |
| 3 | Feb – Mar 2027 | Spring Boot, REST APIs, Spring Data JPA | ⚪ Upcoming |
| 4 | Mar – Apr 2027 | Spring AI, React, full stack integration | ⚪ Upcoming |
| 5 | Apr – May 2027 | Capstone project, deployment, DSA, interview prep | ⚪ Upcoming |

## 📁 Structure

Code is organised by week: `week-01/`, `week-02/`, … Each file is one day's practice.

## 📝 Progress log

| Week | Dates | What I learned |
|---|---|---|
| 1 | 15 – 21 Nov 2026 | Day 1: how Java works (JDK, JRE, JVM, javac, bytecode), setup, first programs · Day 2: variables and the 8 primitive data types |

### Day 1 — 15 Nov 2026

**Learned**
- What a program is, and how Java runs: `.java` source → `javac` compiler → `.class` bytecode → JVM → output
- JDK vs JRE vs JVM (the JDK contains the JRE; the JRE contains the JVM plus the standard libraries)
- Structure of a Java program: class, the `main` method (`public static void main(String[] args)`), statements
- Installed JDK 25 and IntelliJ IDEA on macOS (Apple Silicon)

**Practised**
- Compiled and ran programs from the Terminal with `javac` and `java`, and in IntelliJ
- Wrote programs with `System.out.println` and `System.out.print` (`Hello`, `Vamshi`, `ProfileCard`)
- Read and fixed compiler errors: `';' expected`, `cannot find symbol`, `unclosed string literal`

### Day 2 — 18 Nov 2026

**Learned**
- Variables: declaring (`int age = 24;`), using, and reassigning a value (`age = 25;`)
- Java runs top to bottom, so a variable's value depends on where it is read
- The 8 primitive types: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`; `String` is a class, not a primitive
- Literal rules: `char` uses single quotes, `String` double quotes, `long` needs `L`, `float` needs `f`
- Primitives (`long`, `float`) vs wrapper classes (`Long`, `Float`); camelCase naming

**Practised**
- `Box.java`: printing a variable vs a text literal, reassigning values
- `Mydetails.java`: one variable of each common type, joined into output with `+`
- Broke code on purpose and read the errors: `integer number too large`, `incompatible types: String cannot be converted to int`, `incompatible types: String cannot be converted to char`

**Code:** [`week-01/`](week-01/)

---
📫 [LinkedIn](https://www.linkedin.com/in/lankala-vamshi-yadav) · [GitHub](https://github.com/vamshics20)
