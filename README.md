# Library_Management_System_Intern
Library Management System (Java OOP Project)

A mini Library Management System built using Java, OOP concepts, and CLI interaction.
This project demonstrates Encapsulation, Abstraction, Classes & Objects, Collections, and more.

 Features

Add and manage books

Register users

Display available books

Issue books to users

Return books

Prevent issuing unavailable books

User can hold multiple books

🛠️ Tech Stack

Language: Java

IDE: VS Code (or any Java IDE)

Tools: Terminal/Command Line

📂 Project Structure
LibraryManagementSystem/
│── Book.java      # Book entity class
│── User.java      # User entity class
│── Library.java   # Manages books & users
│── Main.java      # Entry point (menu-driven program)
│── README.md      # Project documentation

▶️ How to Run

Clone this repository:

git clone https://github.com/your-username/library-management-system.git
cd library-management-system


Compile the project:

javac *.java


Run the program:

java Main

📸 Sample Output
===== Library Menu =====
1. Display Books
2. Issue Book
3. Return Book
4. Exit
Enter choice: 1

Books in Library:
[Book ID: 1, Title: Java Programming, Author: James Gosling, Available: Yes]
[Book ID: 2, Title: Effective Java, Author: Joshua Bloch, Available: Yes]
[Book ID: 3, Title: Clean Code, Author: Robert C. Martin, Available: Yes]

🧑‍💻 Concepts Covered

Object-Oriented Programming (OOP)

Class & Object Design

Encapsulation & Abstraction

Collection Framework (ArrayList)

Method Overriding (toString())

Menu-driven CLI Application

🌟 Future Enhancements

Search book by title/author

Limit max issued books per user

Fine calculation on late return

Persistent storage with file/DB
