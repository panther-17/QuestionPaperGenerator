public class Question {

    private String question;
    private String subject;
    private String topic;
    private String difficulty;
    private int marks;

    public Question(String question, String subject, String topic, String difficulty, int marks) {
        this.question = question;
        this.subject = subject;
        this.topic = topic;
        this.difficulty = difficulty;
        this.marks = marks;
    }

    public String getQuestion() {
        return question;
    }

    public String getSubject() {
        return subject;
    }

    public String getTopic() {
        return topic;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getMarks() {
        return marks;
    }
}
