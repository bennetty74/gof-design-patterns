package structural.decorator;

/**
 * @author bugkit
 * @since 2021.12.30
 */
public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new DefaultPrinter("hello");
        printer.print();
        System.out.println("\n-------------------------------------- ");
        LinePrinter linePrinter = new DefaultLinePrinter(printer);
        linePrinter.println();
    }
}
