import java.util.Scanner;

public class StudentInformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean running = true;

        while (running) {

            System.out.println("\n=== STUDENT INFORMATION SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("❌ Please enter a number!");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Student ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    int age;
                    while (true) {
                        System.out.print("Age: ");
                        if (sc.hasNextInt()) {
                            age = sc.nextInt();
                            sc.nextLine();
                            if (ValidationUtils.isValidAge(age))
                                break;
                        } else {
                            sc.nextLine();
                        }
                        System.out.println("❌ Enter valid age!");
                    }

                    double grade;
                    while (true) {
                        System.out.print("Grade: ");
                        if (sc.hasNextDouble()) {
                            grade = sc.nextDouble();
                            sc.nextLine();
                            if (ValidationUtils.isValidGrade(grade))
                                break;
                        } else {
                            sc.nextLine();
                        }
                        System.out.println("❌ Enter grade between 0–100!");
                    }

                    System.out.print("Contact: ");
                    String contact = sc.nextLine();

                    manager.addStudent(new Student(id, name, age, grade, contact));
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2:
                    if (manager.getAllStudents().isEmpty()) {
                        System.out.println("⚠ No students available.");
                    } else {
                        System.out.println("\nID | Name | Age | Grade | Contact");
                        System.out.println("---------------------------------");
                        for (Student s : manager.getAllStudents()) {
                            System.out.printf("%s | %s | %d | %.2f | %s\n",
                                    s.getStudentId(),
                                    s.getName(),
                                    s.getAge(),
                                    s.getGrade(),
                                    s.getContact());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    String searchId = sc.nextLine();
                    Student found = manager.searchStudent(searchId);

                    if (found != null) {
                        System.out.println("✅ Student Found");
                        System.out.println("Name: " + found.getName());
                        System.out.println("Age: " + found.getAge());
                        System.out.println("Grade: " + found.getGrade());
                        System.out.println("Contact: " + found.getContact());
                    } else {
                        System.out.println("❌ Student not found!");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
        sc.close();
    }
}
