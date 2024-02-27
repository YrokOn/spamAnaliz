public class NegotiveTextAnalyzer extends KeywordAnalyzer{
    private String[] keywords = {":(", "=(", ":|"};
    public Label getLabel () {
        return Label.NEGOTIV_TEXT;
    }

    protected String [] getKeyword() {
        return keywords;
    }
}
