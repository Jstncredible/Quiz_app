//quiz app
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public boolean isCorrect(String userAnswer) {
        return userAnswer.equalsIgnoreCase(answer);
    }

    public String getQuestion() {
        return question;
    }
public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Add questions to the list
        questions.add(new Question("What is the capital of France?", "Paris"));
        questions.add(new Question("Which planet is known as the Red Planet?", "Mars"));
        // Add more questions here

        int score = 0;

        System.out.println("Welcome to the Quiz App!");
        System.out.println("Answer the following questions:\n");

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (currentQuestion.isCorrect(userAnswer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + currentQuestion.getAnswer() + "\n");
            }
        }

        System.out.println("Quiz complete!");
        System.out.println("Your score: " + score + " out of " + questions.size());

        scanner.close();
    }
}
