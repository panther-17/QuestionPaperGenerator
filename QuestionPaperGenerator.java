public class QuestionPaperGenerator {

    private QuestionStore questionStore;

    public QuestionPaperGenerator(QuestionStore questionStore) {
        this.questionStore = questionStore;
    }

    public List<Question> generateQuestionPaper(int totalMarks, HashMap<String, Integer> difficultyDistribution) {
        List<Question> questionPaper = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : difficultyDistribution.entrySet()) {
            String difficulty = entry.getKey();
            int marksForDifficulty = entry.getValue();

            int numberOfQuestions = marksForDifficulty / questionStore.getQuestionsByDifficulty(difficulty).get(0).getMarks();

            List<Question> questionsByDifficulty = questionStore.getQuestionsByDifficulty(difficulty);
            Collections.shuffle(questionsByDifficulty);

            questionPaper.addAll(questionsByDifficulty.subList(0, numberOfQuestions));
        }

        return questionPaper;
    }
}
