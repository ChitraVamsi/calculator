# Java CLI Calculator

A simple command-line calculator built with plain Java. Supports **Add**, **Subtract**, **Multiply**, and **Divide** operations with input validation and error handling.

## Project Structure

```
java-calculator/
├── src/
│   └── com/
│       └── calculator/
│           ├── Calculator.java   # Core arithmetic operations
│           └── Main.java         # CLI interface & entry point
├── .gitignore
└── README.md
```

## How to Compile & Run

### Using terminal (javac)

```bash
# Compile
javac -d out src/com/calculator/*.java

# Run
java -cp out com.calculator.Main
```

### Using an IDE
Import the project as a Java project in IntelliJ IDEA, Eclipse, or VS Code and run `Main.java`.

## Sample Session

```
=============================
     Java CLI Calculator     
=============================

Select an operation:
  1. Add
  2. Subtract
  3. Multiply
  4. Divide
  5. Exit

Enter choice (1-5): 1
Enter first number  : 25
Enter second number : 17

  25.0 + 17.0 = 42
```

## Features

- Four operations: Add, Subtract, Multiply, Divide
- Division by zero error handling
- Invalid input protection (non-numeric values)
- Clean integer display (e.g., `42` instead of `42.0`)
- Loop until user exits

## Requirements

- Java 8 or higher
