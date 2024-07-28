import java.util.*;

class QuizQuestion {
    String question;
    String[] options;
    int correctAnswerIndex;

    QuizQuestion(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    boolean isAnswerCorrect(int answerIndex) {
        return answerIndex == correctAnswerIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(question + "\n");
        for (int i = 0; i < options.length; i++) {
            sb.append(i + 1).append(". ").append(options[i]).append("\n");
        }
        return sb.toString();
    }
}

public class Task_3_SimpleQuizApp {
    public static void main(String[] args) {
        
        List<QuizQuestion> questions = new ArrayList<>();
        questions.add(new QuizQuestion(
            "Which of the following sorting algorithms can be used to sort a random linked list with minimum time complexity?",
            new String[]{"Insertion Sort", "Quick Sort", "Heap Sort", "Merge Sort"},
            3 
        ));
        questions.add(new QuizQuestion(
            "In the worst case, the number of comparisons needed to search a singly linked list of length n for a given element is (GATE CS 2002)",
            new String[]{"log(2*n)", "n/2", "log(2*n) -1", "n"},
            3 
        ));
        questions.add(new QuizQuestion(
            "Which one of the following is an application of Stack Data Structure?",
            new String[]{"Managing function calls", "The stock span problem", "Arithmetic expression evaluation", "All of the above"},
            3 
        ));

        
        int score = 0;

        
        Scanner scanner = new Scanner(System.in);

        
        for (QuizQuestion question : questions) {
            // Display the question
            System.out.println(question);
            
            // Get the user's answer
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt(); // Read user input

            // Check if the answer is correct
            boolean isCorrect = question.isAnswerCorrect(userAnswer - 1);

            // Update the score
            if (isCorrect) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        
        System.out.println("Quiz finished!");
        System.out.println("Your final score: " + score + " out of " + questions.size());

        scanner.close();
    }
}
