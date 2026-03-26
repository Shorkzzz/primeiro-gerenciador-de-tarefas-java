Task Manager (Java)
Overview

This project is a Task Management System developed in Java, designed to demonstrate core principles of Object-Oriented Programming (OOP) and clean code organization.

The application runs in a console environment and allows users to manage tasks efficiently through a simple and structured interface.

Features
Create new tasks
List all tasks
Mark tasks as completed
Remove tasks
Basic user handling (authentication logic)

Architecture & Design

The project follows a modular structure, separating responsibilities into distinct layers:

main → Application entry point and user interaction
model → Domain entities (Usuario, Tarefa)
service → Business logic and operations

This separation improves readability, maintainability, and scalability.

Concepts Applied

Object-Oriented Programming (OOP)
Encapsulation
Separation of Concerns
Layered Architecture
Code organization using packages
Basic data manipulation and control flow

Project Structure
src/

main/
    Main.java
model/
    Usuario.java
    Tarefa.java
service/
    TarefaService.java
    
Prerequisites

Java JDK 8 or higher installed
Command line or terminal access
Installation & Execution

Clone the repository:

git clone https://github.com/Shorkzzz/primeiro-gerenciador-de-tarefas-java.git

Navigate to the project directory:

cd primeiro-gerenciador-de-tarefas-java

Compile the project:

javac -d bin src/main/Main.java

Run the application:

java -cp bin main.Main

Notes

This project was built for educational purposes
The application uses a console-based interface
No external frameworks or libraries are required

Future Improvements

Data persistence (files or database integration)
Graphical User Interface (GUI)
Enhanced authentication system
Unit testing implementation
Codebase refactoring for scalability
Author

Developed as part of a continuous learning journey in software development, with a focus on building solid foundations in Java and OOP principles.

License

This project is open-source and available for study and improvement.
