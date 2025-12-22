# Day 02 - Learning Notes

## 🧠 Key Concepts

### If-Else Statements
- **Definition:** Conditional statements that execute different code blocks based on conditions
- **Usage:** Making decisions in code
- **Example:**
```java
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### Switch-Case Statements
- **Definition:** Multi-way branch statement for selecting one of many code blocks
- **Usage:** When you have multiple conditions based on a single variable
- **Example:**
```java
switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("Good");
        break;
    default:
        System.out.println("Invalid grade");
}
```

### For Loops
- **Definition:** Loop that repeats a block of code for a specified number of times
- **Usage:** When you know the exact number of iterations
- **Example:**
```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

### While Loops
- **Definition:** Loop that continues as long as a condition is true
- **Usage:** When the number of iterations is not known beforehand
- **Example:**
```java
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}
```

### Do-While Loops
- **Definition:** Similar to while loop but executes at least once
- **Usage:** When you need the code to run at least one time
- **Example:**
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 10);
```

## 💡 Tips & Tricks
- Always remember to include `break` in switch-case statements to avoid fall-through
- Use for loops when you know the iteration count
- Use while loops when the condition is unknown
- Avoid infinite loops by ensuring the loop condition will eventually become false

## ⚠️ Common Mistakes
- Forgetting to increment the counter in while loops (causes infinite loop)
- Missing `break` statements in switch-case
- Using `=` (assignment) instead of `==` (comparison) in conditions
- Off-by-one errors in loop conditions

## 🔍 Things to Remember
- The condition in if/while statements must be a boolean expression
- For loop has three parts: initialization, condition, increment/decrement
- Do-while loop always executes at least once
- Switch-case works with int, char, String (Java 7+), and enums

## 📚 Further Reading
- [Java Control Flow Documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Understanding Loops in Java](https://www.baeldung.com/java-loops)

## 🤔 Questions/Doubts
- When should I use switch-case vs if-else?
- What are the performance differences between loop types?
- Can I use break and continue in all types of loops?

## 📈 Progress
- **Difficulty Level:** Easy to Medium
- **Time Spent:** 3 hours
- **Completion:** 0/4 problems solved (ready for implementation)
