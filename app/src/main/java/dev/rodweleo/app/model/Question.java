package dev.rodweleo.app.model;

public class Question {
    private int id;
    private String questionText;

    public Question() {
    }

    public Question(int id, String questionText) {
        this.id = id;
        this.questionText = questionText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionText='" + questionText + '\'' +
                '}';
    }
}
