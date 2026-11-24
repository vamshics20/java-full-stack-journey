# ☕ Java Full Stack Journey

My daily learning log on the way to becoming a **Java Full Stack Developer with AI** — from Core Java to deployed full stack and AI apps.

**Started:** 15 Nov 2026 · **Target:** job-ready by May 2027

## 🗺️ Roadmap

| Phase | Dates | Topics | Status |
|---|---|---|---|
| 1 | 15 Nov – 17 Dec 2026 | Core Java basics: operators, input, conditions, loops, methods, arrays, Strings, Git | 🟢 In progress |
| 2 | 18 Dec 2026 – 21 Jan 2027 | OOP, exceptions, collections, lambdas, streams | ⚪ Upcoming |
| 3 | 22 Jan – 22 Feb 2027 | SQL (MySQL), JDBC, Maven, Git, DSA fundamentals | ⚪ Upcoming |
| 4 | 23 Feb – 22 Mar 2027 | Spring Boot, REST APIs, Spring Data JPA, JWT security, testing | ⚪ Upcoming |
| 5 | 23 Mar – 20 Apr 2027 | HTML, CSS, JavaScript, React, deployment, Docker | ⚪ Upcoming |
| 6 | 21 Apr – 15 May 2027 | Spring AI, RAG, AI project, interview prep | ⚪ Upcoming |

## 📁 Structure

Code is organised by week: `week-01/`, `week-02/`, … Each file is one day's practice.

## 📝 Progress log

| Week | Dates | What I learned |
|---|---|---|
| 1 | 15 – 21 Nov 2026 | Day 1: how Java works (JDK, JRE, JVM, javac, bytecode), setup, first programs · Day 2: variables and the 8 primitive data types · Day 3: arithmetic operators |

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
- Primitives (`long`, `float`) vs wrapper classes (`Long`, `Float`); camelCase naming; `float` vs `double` precision

**Practised**
- `Box.java`: printing a variable vs a text literal, reassigning values
- `Mydetails.java`: one variable of each common type, joined into output with `+`
- Broke code on purpose and read the errors: `integer number too large`, `incompatible types: String cannot be converted to int`, `incompatible types: String cannot be converted to char`

### Day 3 — 19 Nov 2026

**Learned**
- Arithmetic operators: `+ - * / %`
- Integer division: `int / int` drops the decimal part (`17 / 5` is `3`); use a `double` to keep decimals
- `%` gives the remainder: even/odd check with `n % 2 == 0`; `n % 10` is the last digit, `n / 10` removes it
- Order of operations: `* / %` before `+ -`; brackets first
- `+` after text joins instead of adding (`"Total: " + 4 + 6` prints `Total: 46`)
- Doubles can't store every decimal exactly (`1.2999999999999998`), so never compare doubles with `==`

**Practised**
- `Calculator.java`: every operator with `int` and `double` values, predicted before running
- `EvenOdd.java`: printing `n % 2 == 0` as `true`/`false`


### Day 4 – Comparison, logical, ++/-- and shorthand (20 Nov)
- `==` vs `.equals()`, `&&` `||` `!`, short-circuit evaluation
- Pre vs post increment (locked-box method), `+=` `-=` `*=` `/=` `%=`
- Programs: Operators, Increment, Eligibility, Counter, ATM, Marks, DaySplit, ComparisonOperators, LogicalOperators

### Day 5 – Type casting (21 Nov)
- Widening (automatic) vs narrowing (manual `(type)`), char ↔ int codes
- Fixing integer division with `(double) a / b`
- Program: CastPractice

### Sunday revision (22 Nov)
- Full Days 1–5 revision: 80+ predict-the-output questions, logic drills
- Story → table → code method for word problems

### Day 6 – User input with Scanner (22 Nov 2026)
- `import java.util.Scanner;` and `new Scanner(System.in)`
- `nextInt()`, `nextDouble()`, `next()`, `nextLine()`, `nextBoolean()`, `next().charAt(0)`
- The `nextLine()` trap after reading numbers, and how to avoid it
- `print` for prompts, `println` for results
- Programs: `Hey`, `BioData`
 ### Day 7 – if / else / else-if (23 Nov 2026)
- `if` runs a block only when the condition is true; `if-else` picks one of two
- `else if` chains: checked top to bottom, only the first true block runs — strictest condition first
- Common traps: `;` right after `if (...)`, `=` vs `==`, Strings need `.equals()`
- Code placement: a line for one branch goes inside its `{ }`; a line for everyone goes after the closing `}`
- Testing both branches and boundary values (0, 100, 90, 75, 50)
- Programs: `IfDemo`, `VoteCheck`, `EvenOdd2`, `Grade`
  ### Day 8 – Nested if, Ternary Operator, Leap Year

**What I learned**
- **Nested if**: an if inside another if. The inner check runs only when the outer check is true.
- **Largest of 3 numbers**: solved two ways, with nested if and with `&&` + else-if.
- **Ternary operator**: a one-line if/else that returns a value.
  `String result = (num % 2 == 0) ? "EVEN" : "ODD";`
- **Leap year rule**: divisible by 4 and not by 100, or divisible by 400.
  `(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)`

**Programs**
| Program | Concept |
|---|---|
| Largest3.java | `&&` with if / else-if / else |
| LeapYear.java | combined conditions with `&&` and `\|\|` |
| LeapYearBonus.java | leap year check in one ternary line |

**Key lessons**
- One answer needs one chain (if → else if → else), not separate ifs.
- The value being tested goes on the left of both comparisons: `a >= b && a >= c`.
- Ternary is best for short conditions; use if/else when the condition is long.
- Always test edge cases (1900 and 2000 for leap year).
- 
**Code:** [`week-01/`](week-01/)

---
📫 [LinkedIn](https://www.linkedin.com/in/lankala-vamshi-yadav) · [GitHub](https://github.com/vamshics20)
