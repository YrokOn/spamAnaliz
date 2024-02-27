public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;

    TooLongTextAnalyzer (int maxLength) {
        this.maxLength = maxLength;
    }

    public Label processText(String text) {
        return (maxLength >= text.length()) ? Label.TOO_LONG : Label.OK;
        }
    }
}
