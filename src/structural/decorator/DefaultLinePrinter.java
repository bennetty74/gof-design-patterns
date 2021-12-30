package structural.decorator;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class DefaultLinePrinter implements LinePrinter {

    private int cursor;


    private final Printer printer;

    public DefaultLinePrinter(Printer printer) {
        this.cursor = 0;
        this.printer = printer;
    }


    @Override
    public void println() {
        String text = printer.getText();
        while (cursor < text.length()) {
            System.out.println(text.charAt(cursor));
            cursor++;
        }
    }
}
