package Task3;

/**
 *
 * @author User
 */
public class TextResultPrinterFactory implements ResultPrinterFactory {
    public ResultPrinter createSimpleTextPrinter() {
        return new SimpleTextResultPrinter();
    }
}