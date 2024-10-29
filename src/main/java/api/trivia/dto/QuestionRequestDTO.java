package api.trivia.dto;

public class QuestionRequestDTO {
    private String question;
    private String answer;
    private String difficulty;
    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }

    public String getDifficulty() { return difficulty; } // Return String
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; } // Accept String
}