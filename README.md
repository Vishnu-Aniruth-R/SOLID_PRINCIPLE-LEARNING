# SOLID Principles - A Practical Example

This repository contains examples of the SOLID principles in object-oriented design. SOLID is an acronym for five principles that help make software more understandable, flexible, and maintainable.

Each principle has a folder with a before and after example demonstrating how the code looks before applying the principle (tightly coupled) and after applying the principle (loosely coupled).

---

## Structure:

- **S - Single Responsibility Principle (SRP)**  
- **O - Open/Closed Principle (OCP)**  
- **L - Liskov Substitution Principle (LSP)**  
- **I - Interface Segregation Principle (ISP)**  
- **D - Dependency Inversion Principle (DIP)**  

Each folder will have two parts:
1. **Before**: A version of the code that doesn't follow the principle (tightly coupled).
2. **After**: A refactored version of the code that follows the principle (loosely coupled).

---

## Example Folder Structure:

### Single Responsibility Principle (SRP)

- **Before**: The `Employee` class does multiple things, like calculating salaries and generating reports, violating SRP.
- **After**: The `Employee` class is refactored so it only handles employee data, while a new `Payroll` class handles salary calculations, and a `Report` class handles report generation.

### Open/Closed Principle (OCP)

- **Before**: A `Shape` class where adding new shape types requires modifying the existing code.
- **After**: The `Shape` class is extended with polymorphism and abstract classes, allowing new shapes to be added without modifying existing code.

### Liskov Substitution Principle (LSP)

- **Before**: Derived classes override methods in a way that causes unexpected behavior.
- **After**: Derived classes maintain the behavior of base classes, ensuring that objects of derived classes can replace objects of base classes without changing program correctness.

### Interface Segregation Principle (ISP)

- **Before**: A class implements a large, unwieldy interface that forces it to implement unnecessary methods.
- **After**: The interface is split into smaller, more focused interfaces, ensuring that classes only implement the methods they actually need.

### Dependency Inversion Principle (DIP)

- **Before**: The `Cage` class is tightly coupled to specific implementations of `Bowl` and `Door`.
- **After**: The `Cage` class depends on abstractions (interfaces) instead of concrete implementations, allowing for greater flexibility and ease of change.

---

## Benefits of SOLID Principles:

1. **Maintainability**: SOLID principles help in writing clean and maintainable code.
2. **Flexibility**: Following these principles ensures that the code is flexible and easy to extend without changing existing code.
3. **Testability**: SOLID principles make it easier to write unit tests, as the code is decoupled and modular.
4. **Understandability**: Adhering to SOLID ensures that the code is easier to understand and reason about, even as it grows in size and complexity.

---

Feel free to explore the individual principle folders for detailed explanations and code examples.
