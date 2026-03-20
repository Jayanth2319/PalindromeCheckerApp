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