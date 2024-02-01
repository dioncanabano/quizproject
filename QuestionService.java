public class QuestionService {
    

    Question[] questions = new Question[5];

    public QuestionService() {

        questions[0] = new Question(1, "What is my name?", "Jong", "Jovy", "Justin", "Julius", "Jong");
        questions[1] = new Question(2, "How many is 10?", "9", "8", "7", "10", "10");
        questions[2] = new Question(3, "Where are you?", "Here", "There", "Over", "Everywhere", "There");
        questions[3] = new Question(4, "Why is it big", "Because yes", "Idk", "yr", "wdyt", "yr");
        questions[4] = new Question(5, "When do you sleep?", "11PM", "12PM", "1AM", "3AM", "3AM");
    }

    public void displayQuestions(){
        
        for (Question q : questions) {
            System.out.println(q);
        }
    }
}
