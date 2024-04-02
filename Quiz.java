import java.util.Scanner;

public class Quiz {
    private static class Question {
        String question;
        String[] options;
        String correctAnswer;

        public Question(String question, String[] options, String correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }

    public static void main(String[] args) {
        Question[] questions = {
            new Question("What is the capital of India?", new String[]{"A. NewDelhi", "B. London", "C. Rome", "D. Madrid"}, "A"),
            new Question("Who painted the Mona Lisa?", new String[]{"A. Leonardo da Vinci", "B. Vincent van Gogh", "C. Pablo Picasso", "D. Michelangelo"}, "A"),
            new Question("Which planet is known as the Red Planet?", new String[]{"A. Jupiter", "B. Mars", "C. Venus", "D. Mercury"}, "B"),
            new Question("What is the largest mammal in the world?", new String[]{"A. Elephant", "B. Giraffe", "C. Blue Whale", "D. Polar Bear"}, "C"),
            new Question("Who is the Father of INDIA?", new String[]{"A. Narendra Modi", "B. Mahatma Gandhi", "C. Subash Chandra Bose", "D. William Faulkner"}, "B"),
            new Question("What is the chemical symbol for gold?", new String[]{"A. Au", "B. Ag", "C. Cu", "D. Fe"}, "A"),
            new Question("What is the tallest mountain in the world?", new String[]{"A. Mount Everest", "B. K2", "C. Kangchenjunga", "D. Mount Kilimanjaro"}, "A"),
            new Question("Which country Ruled INDIA?", new String[]{"A. China", "B. Britain", "C. South Korea", "D. Vietnam"}, "B"),
            new Question("Who wrote 'National Anthem'?", new String[]{"A. Rabindranath Tagore", "B. Mahatma Gandhi", "C. Lal Bahadur Shastri", "D. Tennessee Williams"}, "A"),
            new Question("What is the largest organ in the human body?", new String[]{"A. Heart", "B. Liver", "C. Skin", "D. Brain"}, "C"),
        };

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.question);
            for (String option : question.options) {
                System.out.println(option);
            }
            System.out.print("Enter your answer (A, B, C, or D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.equals(question.correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }

            try {
                Thread.sleep(2000); // Wait for 2 seconds before showing the next question
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Quiz completed!");
        System.out.println("You scored " + score + " out of " + questions.length);

        scanner.close();
    }
}
