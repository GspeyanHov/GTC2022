package chapters.chapter13.fileExample.serialization;

import homeWork.students.model.Lesson;
import homeWork.students.model.User;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private String surName;
    private int age;
    private String email;


    public Student(String name, String surName,
                   int age, String email) {

        this.name = name;
        this.surName = surName;
        this.age = age;
        this.email = email;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email ='" + email +
                ", age=" + age +
                '}';
    }
}
