package homeWork.students;

import homeWork.students.commands.Commands;
import homeWork.students.model.Lesson;
import homeWork.students.model.Student;
import homeWork.students.storage.LessonList;
import homeWork.students.storage.StudentList;

import java.util.Scanner;

public class StudentDemo implements Commands {



    private static Scanner scanner = new Scanner(System.in);
    private static StudentList studentList = new StudentList();
    private static LessonList lessonList = new LessonList();

    public static void main(String[] args) {

        Lesson java = new Lesson("java","Gasparyan",5,35);
        Lesson php = new Lesson("php","Poghosyan",4,30);
        Lesson kotlin = new Lesson("kotlin","Sargsyan",3,25);
        lessonList.add(java);
        lessonList.add(php);
        lessonList.add(kotlin);
        studentList.add(new Student("Poghos", "Poghosyan", "098154578", 18, "Gyumri", java));
        studentList.add(new Student("Surik", "Surikyan", "098154579", 24, "Paris", php));
        studentList.add(new Student("Levon", "Levonyan", "098154558", 22, "London", kotlin));

        boolean run = true;
        while (run) {
             Commands.printCommands();

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    StudentList.printArray();
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;
                case PRINT_STUDENT_BY_LESSON:
                    printStudentByLessonName();
                    break;
                case COUNT:
                    System.out.println("Student's count: " + StudentList.getSize());
                    break;
                case CHANGE_STUDENTS_LESSON:
                    changeStudentLessonName();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    LessonList.printArray();
                    break;
                default:
                    System.out.println("Invalid command ");
                    break;
            }
        }
    }

    private static void addLesson() {
        System.out.println("please input lesson name ");
        String lessonName = scanner.nextLine();
        System.out.println("please input teacher's name ");
        String teacherName = scanner.nextLine();
        System.out.println("please input lesson duration by month ");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("please input lesson price ");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson("name","teacherName",duration,price);
        lessonList.add(lesson);
        System.out.println("lesson created! ");

    }

    private static void changeStudentLessonName() {
        StudentList.printArray();
        System.out.println("print student's index for change student's lesson: ");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentList.getByIndex(index);
        if (student == null) {
            System.out.println("Wrong index!!! ");
        } else {
            if(LessonList.getSize() != 0) {
                LessonList.printArray();
                System.out.println("Please choose lesson index! ");
                int lessonIndex = Integer.parseInt(scanner.nextLine());
                Lesson lesson = lessonList.getLessonByIndex(lessonIndex);
                if (lesson != null) {
                   student.setLesson(lesson);
                    System.out.println("lesson changed! ");
                }
            }
        }
    }

    private static void printStudentByLessonName() {
        System.out.println("Print student's lesson ");
        String lessonName = scanner.nextLine();
        StudentList.printStudentByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        StudentList.printArray();
        System.out.println("Please choose student index ");
        int index = Integer.parseInt(scanner.nextLine());
        studentList.delete(index);
    }

    private static void addStudent() {
        if(LessonList.getSize() != 0){
            LessonList.printArray();
            System.out.println("Please choose lesson index! ");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonList.getLessonByIndex(lessonIndex);
            if(lesson == null){
                System.out.println("Wrong index!. Please choose correct index ");
                addStudent();
            }else{
                System.out.println("Please input student's name ");
                String name = scanner.nextLine();
                System.out.println("please input student's surname ");
                String surname = scanner.nextLine();
                System.out.println("please input student's phone number ");
                String phoneNumber = scanner.nextLine();
                System.out.println("please input student's age ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("please input student's city ");
                String city = scanner.nextLine();

                Student student = new Student(name, surname, phoneNumber, age, city, lesson);
                studentList.add(student);
                System.out.println("Student created ");

            }
        }



    }
}
