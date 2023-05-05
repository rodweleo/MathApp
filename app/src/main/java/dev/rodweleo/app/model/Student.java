package dev.rodweleo.app.model;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String username;
    private String password;


    public static final Student[] students = {
      new Student(1, "rodweleo", "rodweleo"),
      new Student(2, "alextopsy", "alextopsy"),
    };



    public Student() {
    }

    public Student(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
