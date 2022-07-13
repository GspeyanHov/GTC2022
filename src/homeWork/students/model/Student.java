package homeWork.students.model;

public class Student {

    private String name;
    private String surName;
    private String phoneNumber;
    private int age;
    private String city;
    private Lesson lesson;
    private User registeredUser;

    public Student(String name, String surName, String phoneNumber,
                   int age, String city, Lesson lesson, User registeredUser) {

        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.city = city;
        this.lesson = lesson;
        this.registeredUser = registeredUser;

    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    public int getByIndex(int index) {
        return index;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lesson ='" + lesson.getName() +
                ", registeredUser ='" + registeredUser +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
