import java.util.Scanner;

public class QuestionService {
    

    Question[] questions = new Question[5];
    String selections[] = new String[5];

    public QuestionService() {

        questions[0] = new Question(1, "What is my name?", "Jong", "Jovy", "Justin", "Julius", "Jong");
        questions[1] = new Question(2, "How many is 10?", "9", "8", "7", "10", "10");
        questions[2] = new Question(3, "Where are you?", "Here", "There", "Over", "Everywhere", "There");
        questions[3] = new Question(4, "Why is it big", "Because yes", "Idk", "yr", "wdyt", "yr");
        questions[4] = new Question(5, "When do you sleep?", "11PM", "12PM", "1AM", "3AM", "3AM");
    }

    public void playQuiz(){
        
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question  no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("a) " + q.getOpt1());
            System.out.println("b) " + q.getOpt2());
            System.out.println("c) " + q.getOpt3());
            System.out.println("d) " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selections[i] = sc.nextLine();
            i++;
        }

        for (String ans: selections) {
            System.out.println("Answer: " + ans);
        }
    }

    public void printScore(){

        int i = 0;
        int score = 0;
        for (Question question : questions) {
            //System.out.println(question.getAnswer());
            if(question.getAnswer().equals(selections[i])) {
                score++;
            }
            i++;
        }

        System.out.println("Your score is: " + score);
    }
}
