package structural.decorator;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public interface Printer {
    /**
     * Print word one by one
     */
    void print();

    /**
     * Get the text will be print
     * @return text
     */
    String getText();
}
