package decorator;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class DefaultPrinter implements Printer {

    private final String text;
    private int cursor;

    public DefaultPrinter(String text) {
        this.text = text;
        cursor = 0;
    }

    @Override
    public void print() {
        while (cursor < text.length()) {
            System.out.print(text.charAt(cursor++));
        }
    }

    @Override
    public String getText() {
        return text;
    }
}
