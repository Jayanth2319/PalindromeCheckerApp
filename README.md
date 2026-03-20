# Palindrome Checker App

## Project Flow

1. **Start Application:**
    * User opens the app, and the program starts execution from the `main()` method.

2. **Display Welcome Message:**
    * The application displays a welcome banner, application name, and version.

3. **Establish Startup Flow:**
    * This first use case ensures that the application starts properly and the basic structure is working.

4. **Future Use Cases:**
    * In subsequent versions, the application will implement logic to check whether a string is a palindrome (user input or hardcoded strings).

---

## Objective

The goal of this project is to create a **Java-based Palindrome Checker Management System** that:

* Validates whether a string is a palindrome.
* Demonstrates proper **Git workflow** with branches, commits, and pull requests.
* Shows a **clear modular structure** in IntelliJ with source files, modules, and proper project organization.
* Provides a **stepwise learning approach**, starting with startup flow and gradually adding features.

---

## Use Case 1: Application Startup & Welcome Message

**Description:**

* This use case focuses on the **initial setup of the application**.
* At this stage:
    * The application starts execution from the `main()` method.
    * A **welcome message** is displayed in the console.
    * The application **version** is shown.
    * **No palindrome logic** is implemented yet.

**Purpose:**

* To **verify that the project structure is correct**.
* To provide a **clear starting point** for further development.

---

## Use Case 2: Hardcoded Palindrome Check

**Description:**

* This use case focuses on checking whether a **hardcoded string** is a palindrome.
* At this stage:
    * The program starts execution from the `main()` method.
    * A **hardcoded string** (e.g., `"madam"`) is checked for palindrome.
    * The result is displayed on the console.
    * The program then exits.

**Purpose:**

* To **demonstrate palindrome checking logic** using a predefined string.
* To introduce **basic Java programming concepts** such as:
    * **Class** – A container for program logic.
    * **Main Method** – Entry point of the Java application.
    * **Static Keyword** – Allows JVM to call `main` without creating an object.
    * **String** – Stores the word to be checked.
    * **String Literal** – Hardcoded text like `"madam"`.
    * **Conditional Statement (if-else)** – Checks whether the string is a palindrome.
    * **Console Output** – Displays the result using `System.out.println()`.

**Data Structure:**

* **String**

---

## Use Case 3: Palindrome Check Using String Reverse

**Description:**

* This use case checks whether a string is a palindrome by **reversing the string**.
* At this stage:
    * The program asks the user to **enter a string**.
    * The string is reversed using a **for loop**.
    * The reversed string is compared to the original using the **`equals()` method**.
    * The result is displayed on the console.

**Purpose:**

* To demonstrate **palindrome checking logic** using **string reversal**.
* To introduce **key Java concepts**:
    * **Loop (for loop)** – Iterates through string characters in reverse order.
    * **String Immutability** – Each modification creates a new string object.
    * **String Concatenation (+)** – Builds the reversed string character by character.
    * **equals() Method** – Compares the content of strings rather than references.

**Data Structure:**

* **String**

**Flow:**

1. Prompt user to enter a string.
2. Reverse the string using a loop.
3. Compare the original and reversed strings.
4. Display whether the string is a palindrome.

## Use Case 4: Character Array Based Palindrome Check

**Description:**

* This use case checks whether a string is a palindrome by **converting it to a character array** and comparing characters.
* At this stage:
    * The program asks the user to **enter a string**.
    * The string is converted to a `char[]` array.
    * Two pointers are used: one at the start and one at the end.
    * Characters are compared until the pointers meet or a mismatch is found.
    * The result is displayed on the console.

**Purpose:**

* To demonstrate **palindrome checking logic** using **character arrays**.
* To introduce **key Java concepts**:
    * **Character Array (char[])** – Stores individual characters for index-based access.
    * **Array Indexing** – Access elements using their indices.
    * **Two-Pointer Technique** – Efficiently compare characters from both ends.
    * **Time Complexity Awareness** – Avoids creating extra objects, more efficient than string reversal.

**Data Structure:**

* **char[]**

**Flow:**

1. Prompt user to enter a string.
2. Convert string to char array.
3. Initialize two pointers (start and end).
4. Compare characters at start and end pointers.
5. Move pointers inward until they meet.
6. Display whether the string is a palindrome.

## Use Case 5: Stack-Based Palindrome Checker

**Description:**

* This use case checks whether a string is a palindrome using a **stack**.
* At this stage:
  * The program asks the user to **enter a string**.
  * Each character is pushed into a stack.
  * Characters are popped from the stack and compared to the original string.
  * The result is displayed on the console.

**Purpose:**

* To demonstrate **palindrome checking logic** using a **stack**.
* To introduce **key Java concepts**:
  * **Stack (LIFO)** – Last-In-First-Out linear data structure.
  * **Push Operation** – Adds characters to the stack.
  * **Pop Operation** – Removes characters from the stack in reverse order.
  * **Reversal Logic** – Stack naturally reverses the order of elements for comparison.

**Data Structure:**

* **Stack<Character>**

**Flow:**

1. Prompt user to enter a string.
2. Push characters into the stack.
3. Pop characters and compare with original string.
4. Display whether the string is a palindrome.

## Use Case 6: Queue + Stack Based Palindrome Check

**Description:**

* This use case checks whether a string is a palindrome using both **Queue and Stack**.
* At this stage:
  * Characters are enqueued into a queue (FIFO).
  * Characters are pushed onto a stack (LIFO).
  * Compare elements dequeued from the queue and popped from the stack.
  * Display the result on the console.

**Purpose:**

* To demonstrate **FIFO vs LIFO** behavior using Queue and Stack.
* To introduce **key Java concepts**:
  * **Queue (FIFO)** – First-In-First-Out linear data structure.
  * **Stack (LIFO)** – Last-In-First-Out linear data structure.
  * **Enqueue & Dequeue** – Insert/remove elements from the queue.
  * **Push & Pop** – Add/remove elements from the stack.
  * **Logical Comparison** – Comparing queue vs stack output for palindrome validation.

**Data Structures:**

* **Queue<Character>**
* **Stack<Character>**

**Flow:**

1. Prompt user to enter a string.
2. Enqueue each character into a queue.
3. Push each character onto a stack.
4. Compare dequeued and popped characters.
5. Display whether the string is a palindrome.

## Use Case 7: Deque-Based Optimized Palindrome Checker

**Description:**

* This use case checks whether a string is a palindrome using a **Deque**.
* At this stage:
  * Characters are inserted into a deque.
  * Compare the first and last elements.
  * Remove the first and last elements after comparison.
  * Continue until deque is empty.
  * Display the result on the console.

**Purpose:**

* To demonstrate **Deque usage** for palindrome checking.
* To introduce **key Java concepts**:
  * **Deque (Double Ended Queue)** – Insert/remove elements from both ends.
  * **Front and Rear Access** – Compare first and last characters directly.
  * **Optimized Data Handling** – Avoids extra reversal structures.

**Data Structure:**

* **Deque<Character>**

**Flow:**

1. Prompt user to enter a string.
2. Insert characters into deque.
3. Compare front and rear elements.
4. Remove front and rear elements after comparison.
5. Continue until deque is empty.
6. Display whether the string is a palindrome.

## Use Case 8: Linked List Based Palindrome Checker

**Description:**

* This use case checks whether a string is a palindrome using a **Singly Linked List**.
* At this stage:
  * The input string is converted into a linked list.
  * The **fast and slow pointer technique** is used to find the middle of the list.
  * The **second half of the list is reversed in-place**.
  * Both halves are compared node by node.
  * The result is displayed on the console.

---

**Purpose:**

* To demonstrate palindrome checking using a **linked list data structure**.
* To introduce advanced **data structure techniques**:
  * **Singly Linked List** – Nodes connected via references.
  * **Fast & Slow Pointer Technique** – Efficient middle detection.
  * **In-Place Reversal** – Memory-efficient list reversal.
  * **Node Traversal** – Sequential access using `next`.

---

**Data Structure:**

* **Singly Linked List**

---

**Flow:**

1. Convert input string into a linked list.
2. Find the middle using fast and slow pointers.
3. Reverse the second half of the list.
4. Compare first half and reversed second half.
5. Display whether the string is a palindrome.

## Use Case 9: Recursive Palindrome Checker

**Description:**

* This use case checks whether a string is a palindrome using **recursion**.
* At this stage:
  * The program compares characters at the start and end.
  * Recursively checks the remaining substring.
  * Stops when base condition is reached.
  * Displays the result on the console.

---

**Purpose:**

* To demonstrate **recursive problem-solving approach**.
* To introduce key concepts:
  * **Recursion** – Function calling itself
  * **Base Condition** – Stops recursion
  * **Call Stack** – Tracks recursive calls

---

**Data Structure:**

* **Call Stack**

---

**Flow:**

1. Compare first and last characters.
2. If equal → recursive call for inner substring.
3. If mismatch → not palindrome.
4. Stop when start >= end.
5. Display result.

## Use Case 10: Case-Insensitive & Space-Ignored Palindrome

**Description:**

* This use case checks whether a string is a palindrome by ignoring **case, spaces, and special characters**.
* At this stage:
  * The input string is preprocessed using regular expressions.
  * All non-alphanumeric characters are removed.
  * The string is converted to lowercase.
  * A two-pointer approach is used to check palindrome.
  * The result is displayed on the console.

---

**Purpose:**

* To demonstrate **real-world palindrome validation**.
* To introduce key concepts:
  * **String Preprocessing**
  * **Regular Expressions (Regex)**
  * **Case Normalization**
  * **Efficient Two-Pointer Technique**

---

**Data Structure:**

* **String / Character Array**

---

**Flow:**

1. Accept input string.
2. Remove spaces and special characters.
3. Convert string to lowercase.
4. Compare characters using two-pointer method.
5. Display result.

## Use Case 11: Object-Oriented Palindrome Service

**Description:**

* This use case encapsulates palindrome logic inside a dedicated service class.
* At this stage:
  * A `PalindromeChecker` class is created.
  * The method `checkPalindrome()` is exposed for external use.
  * Internal logic is hidden using private methods.
  * The main class interacts with the service class.

---

**Purpose:**

* To demonstrate **Object-Oriented Programming (OOPS)** principles:
  * **Encapsulation** – Hiding internal logic
  * **Single Responsibility Principle** – One class, one responsibility
  * **Modular Design** – Reusable components

---

**Data Structure:**

* Internal (String / Two-pointer / Optional Stack)

---

**Flow:**

1. User enters input.
2. Main class creates object of `PalindromeChecker`.
3. Calls `checkPalindrome()` method.
4. Internal logic processes input.
5. Result is returned and displayed.

## Use Case 12: Strategy Pattern for Palindrome Algorithms

**Description:**

* This use case implements multiple palindrome algorithms using the **Strategy Pattern**.
* At this stage:
  * A common interface `PalindromeStrategy` is defined.
  * Multiple implementations (Stack, Deque) are created.
  * Strategy is selected dynamically at runtime.
  * Context class executes the selected strategy.

---

**Purpose:**

* To demonstrate advanced **design patterns**:
  * **Strategy Pattern**
  * **Polymorphism**
  * **Loose Coupling**
  * **Extensibility**

---

**Data Structure:**

* Varies per strategy:
  * Stack
  * Deque

---

**Flow:**

1. User selects a strategy.
2. Input string is taken.
3. Selected strategy is injected into context.
4. Strategy executes palindrome logic.
5. Result is displayed.