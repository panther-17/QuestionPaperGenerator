public class Main {

    public static void main(String[] args) {
        QuestionStore questionStore = new QuestionStore();

        questionStore.addQuestion(new Question("What is the speed of light", "Physics", "Waves", "Easy", 5));
        questionStore.addQuestion(new Question("What is the law of gravitation", "Physics", "Motion", "Medium", 10));
        questionStore.addQuestion(new Question("What is the chemical formula for water", "Chemistry", "Inorganic Chemistry", "Hard", 15));

        HashMap<String, Integer> difficultyDistribution = new HashMap<>();
        difficultyDistribution.put("Easy", 20);
        difficultyDistribution.put("Medium", 50);
        difficultyDistribution.put("Hard", 30);

        QuestionPaperGenerator questionPaperGenerator = new QuestionPaperGenerator(questionStore);
        List<Question> questionPaper = questionPaperGenerator.generateQuestionPaper(100, difficultyDistribution);

        for (Question question : questionPaper) {
            System.out.println(question);
        }
    }
}

