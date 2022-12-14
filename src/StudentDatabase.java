// Alex Nouansacksy
// StudentDatabase
// 12/13/20222

import java.util.*;
import static java.lang.System.out;

public class StudentDatabase {
    public static int indexOfStudent(ArrayList<Student> db, int id) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++)
            if(db.get(lcv).getId() == id) index = lcv;
        return index;
    }

    public static int indexOfStudent(ArrayList<Student> db, String last) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++)
            if(db.get(lcv).getLastName().equals(last)) index = lcv;
        return index;
    }

    public static void printStu(Student stu) {
        out.printf("%s\t%s\t%d\t%f\n", stu.getFirstName(), stu.getLastName(), stu.getId(), stu.getGPA());
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Student> db = new ArrayList<Student>();

        while (true) {
            out.println("\nStudent Menu: \n");
            out.println("1 - Add new student");
            out.println("2 - Display all students");
            out.println("3 - Search for student (by id)");
            out.println("4 - Search for student (by last name)");
            out.println("5 - Modify a student's GPA");
            out.println("6 - Remove student (by id)");
            out.print("7 - Exit\n\nPlease enter your choice: ");
            int c = keyboard.nextInt();

            if (c == 1) {
                out.print("Enter first name: ");
                String first = keyboard.next();
                out.print("Enter last name: ");
                String last = keyboard.next();
                out.print("Enter student ID: ");
                int id = keyboard.nextInt();
                out.print("Enter student GPA: ");
                double gpa = keyboard.nextDouble();
                Student st = new Student(first, last, id, gpa);
                db.add(st);
            } else if (c == 2) {
                out.println("First\tLast\tID\tGPA");
                for (Student stu : db) out.printf("%s\t%s\t%d\t%.2f\n", stu.getFirstName(), stu.getLastName(), stu.getId(), stu.getGPA());
            } else if (c == 3) {
                out.print("Enter student ID: ");
                int id = keyboard.nextInt();
                int index = indexOfStudent(db, id);
                if (index != -1) printStu(db.get(index));
                else out.println("No student was found with that ID.");
            } else if (c == 4) {
                out.print("Enter student last name: ");
                String lastName = keyboard.next();
                int index = indexOfStudent(db, lastName);
                if (index != -1) printStu(db.get(index));
                else out.println("No student was found with that last name.");
            } else if (c == 5) {
                out.print("Enter student ID: ");
                int id = keyboard.nextInt();
                int index = indexOfStudent(db, id);
                if (index == -1 ) out.println("No student was found with that id.");
                else {
                    out.print("Enter student GPA: ");
                    double gpa = keyboard.nextDouble();
                    db.get(index).setGPA(gpa);
                    out.println("GPA updated successfully");
                }
            } else if (c == 6) {
                out.print("Enter ID: ");
                int id = keyboard.nextInt();
                int index = indexOfStudent(db, id);
                if (index == -1) out.println("No student was found with that ID)");
                else db.remove(index);
            } else if (c == 7) {
                return;
            }

        }
    }
}
/*
Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 1
Enter first name: John
Enter last name: Smith
Enter student ID: 9
Enter student GPA: 4.0

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 2
First	Last	ID	GPA
John	Smith	9	4.00

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 3
Enter student ID: 9
John	Smith	9	4.000000

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 4
Enter student last name: Smith
John	Smith	9	4.000000

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 5
Enter student ID: 9
Enter student GPA: 3.0
GPA updated successfully

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 6
Enter ID: 9

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 2
First	Last	ID	GPA

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 7

Process finished with exit code 0

 */