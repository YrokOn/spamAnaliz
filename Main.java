public class Main {
    public static void main(String[] args) {

        String[] keywords = {"плохой", "отстой"};
        SpamAnalyzer spamA = new SpamAnalyzer(keywords);
        NegotiveTextAnalyzer negotiveTA = new NegotiveTextAnalyzer();
        TooLongTextAnalyzer tooLongTA = new TooLongTextAnalyzer(25);

        TextAnalyzer[] analyzers = {spamA, negotiveTA, tooLongTA};

        String text = "Это плохой комментарий";
            
        public Label checkLabels(TextAnalyzer[] analyzers, String text) {
            for (analiz : analyzers){
                analiz.processText(text);
            }

        };
    }
}