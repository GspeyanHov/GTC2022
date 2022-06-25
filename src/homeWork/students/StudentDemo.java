package homeWork.students;

import java.util.Scanner;

public class StudentDemo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentList studentList = new StudentList();

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("Please input 0 for exit ");
            System.out.println("Please input 1 for add student ");
            System.out.println("Please input 2 for print all students ");
            System.out.println("Please input 3 for delete student by index ");
            System.out.println("Please input 4 for print student by lesson ");
            System.out.println("Please input 5 for students count ");
            System.out.println("Please input 6 for change student's lesson ");

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    StudentList.printArray();
                    break;
                case 3:
                    StudentList.printArray();
                    System.out.println("Please choose student index ");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentList.delete(index);
                    break;
                case 4:
                    System.out.println("Print student's lesson ");
                    String lessonName = scanner.nextLine();
                    StudentList.printStudentByLessonName(lessonName);
                    break;
                case 5:
                    System.out.println("Student's count: ");
                    System.out.println(StudentList.getSize());
                    break;
                case 6:
                    StudentList.printArray();
                    System.out.println("print student's index for change student's lesson: ");
                    int index1 = Integer.parseInt(scanner.nextLine());
                    StudentList.getByIndex(index1);
                    System.out.println("print student's new lesson: ");
                    String newLesson = scanner.nextLine();
                    StudentList.printNewLesson(index1, newLesson);
                    StudentList.printArray();
                    break;
                default:
                    System.out.println("Invalid command ");
                    break;
            }
        }
    }

    private static void addStudent() {
        System.out.println("Please input student's name ");
        String name = scanner.nextLine();
        System.out.println("please input student's surname ");
        String surname = scanner.nextLine();
        System.out.println("please input student's phone number ");
        String phoneNumber = scanner.nextLine();
        System.out.println("please input student's age ");
        String ageStr = scanner.nextLine();
        System.out.println("please input student's city ");
        String city = scanner.nextLine();
        System.out.println("Please input student's lesson ");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);

        Student student = new Student(name, surname, phoneNumber, age, city, lesson);
        studentList.add(student);
        System.out.println("Student created ");

    }
}
