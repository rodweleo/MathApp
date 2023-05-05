package dev.rodweleo.app.model;

public class Answer {
    private int id;
    private int questionID;
    private String answerText;
    private boolean isCorrect;

    public Answer() {
    }

    public Answer(int id, int questionID, String answerText, boolean isCorrect) {
        this.id = id;
        this.questionID = questionID;
        this.answerText = answerText;
        this.isCorrect = isCorrect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
