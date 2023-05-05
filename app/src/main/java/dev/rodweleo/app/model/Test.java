package dev.rodweleo.app.model;

public class Test {
    private int id;
    private int studentID;
    private int score;
    private int date;

    public Test() {
    }

    public Test(int id, int studentID, int score, int date) {
        this.id = id;
        this.studentID = studentID;
        this.score = score;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", studentID=" + studentID +
                ", score=" + score +
                ", date=" + date +
                '}';
    }
}
