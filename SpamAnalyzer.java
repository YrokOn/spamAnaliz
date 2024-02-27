public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    SpamAnalyzer (String[] keywords) {
        this.keywords = keywords;
    }

    public Label getLabel () {
        return Label.SPAM;
    }

    protected String [] getKeyword() {
        return keywords;
    }
}
