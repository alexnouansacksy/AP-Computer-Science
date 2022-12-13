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
            ArrayList<Student> db = new ArrayList<Student>();

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
                out.println("First\nLast\nID\nGPA");
                for (Student stu : db) out.printf("%s\t%s\t%d\t%f\n", stu.getFirstName(), stu.getLastName(), stu.getId(), stu.getGPA());
            } else if (c == 3) {
                out.print("Enter student ID: ");
                int id = keyboard.nextInt();
                int index = indexOfStudent(db, id);
                if (index != -1) printStu(db.get(index));
                else out.println("No student was found with that ID.");
            } else if (c == 4) {
                out.print("Enter student last name: ");
                String lastName = keyboard.nextLine();
                int index = indexOfStudent(db, lastName);
                if (index != -1) printStu(db.get(index));
                else out.println("No student was found with that last name.");
            } else if (c == 5) {

            } else if (c == 6) {

            } else if (c == 7) {
                return;
            }

        }
    }
}
