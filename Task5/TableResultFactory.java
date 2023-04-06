package ex01;

/**
 *
 * @author User
 */
public class TableResultFactory implements FactoryMethod {
    @Override
    public ResultFormatter createResultFormatter() {
        return new TableResultFormatter();
    }
}
