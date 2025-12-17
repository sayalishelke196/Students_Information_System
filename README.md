# Students_Information_System

Student Information System (Core Java)
A structured, menu-driven console application developed using Core Java to manage student records.
The project focuses on clean design, input validation, and separation of concerns while remaining beginner-friendly.

🎯 Purpose of the Project
The purpose of this project is to:

Apply object-oriented programming principles
Practice safe user input handling
Understand data management using collections
Build a real-world style console-based system
Follow professional GitHub project structur
This project is part of a learning-oriented approach, starting from beginner level and gradually extending to medium and advanced features.

✨ Key Features

Menu-driven user interface
Add and manage student records
View all stored students
Search students by unique Student ID
Input validation to prevent runtime errors
Clean separation between data, logic, and UI
Beginner-safe and scalable code structure


🧱 Design & Architecture Overview
The application follows a layered structure:

1.Model Layer
Student.java represents the student entity.

2.Business Logic Layer
StudentManager.java handles data storage and operations.

3.Utility Layer
ValidationUtils.java ensures reusable validation logic.

4.Presentation Layer
StudentInformationSystem.java manages user interaction and menu flow.

This structure improves readability, maintainability, and scalability.


🛠️ Technologies & Tools Used
| Tool / Technology | Description | |------------------|-------------| | Java | Core Java (JDK 17) | | IDE | Spring Tool Suite (STS) | | Data Structure | ArrayList | | Version Control | Git | | Repository Hosting | GitHub |


📂 Project Structure
Student-Information-System-Java │ ├── README.md │ ├── src/studentsysytem │ ├── Student.java │ ├── StudentManager.java │ ├── ValidationUtils.java │ └── StudentInformationSystem.java │ ├── docs/ │ ├── Project_Documentation.pdf └── test_data/ └── sample_students.txt


⚙️ How to Run the Application
Install JDK 17 or above
Open the project in Spring Tool Suite (STS)
Navigate to StudentInformationSystem.java
Right-click → Run As → Java Application
Follow the menu displayed in the console


🧠 Concepts Demonstrated
Object-Oriented Programming (OOP)
Encapsulation using private variables
Use of ArrayList for dynamic data storage
Input validation using conditional logic
Menu-driven program design
Basic error prevention techniques
Clean and readable Java code structure



🧪 Testing & Validation Strategy
Invalid numeric inputs are handled safely
Age must be a positive number
Grade must be within valid range (0–100)
Searching handles both existing and non-existing IDs
Sample test cases are available in the test_data/directory.


🚀 Future Enhancements
This project is intentionally designed to be extensible. Planned improvements include:
Update and delete student records
File handling for data persistence
Sorting student records
Custom exception handling
Database integration
GUI version using JavaFX or Swing


👩‍🎓 Author
Sayali Shelke
B.Sc. Computer Science
Aspiring Software Developer
Focused on building strong programming fundamentals


