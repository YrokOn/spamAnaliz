public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String [] getKeyword();
    protected abstract Label getLabel ();
    Label processText (String text) {
        for (String keyword : getKeyword()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        } return Label.OK;
    }
}
