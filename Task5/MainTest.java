import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ex01.Main;

/**
 *
 * @author User
 */
public class MainTest {
    public static void main(String[] args) {
        Main calculator = new Main();

        // Test add operation
        calculator.add(5);
        System.out.println("Result after adding 5: " + calculator.getResult()); // Expected output: 5.0

        // Test subtract operation
        calculator.subtract(2);
        System.out.println("Result after subtracting 2: " + calculator.getResult()); // Expected output: 3.0

        // Test multiply operation
        calculator.multiply(3);
        System.out.println("Result after multiplying by 3: " + calculator.getResult()); // Expected output: 9.0

        // Test divide operation
        calculator.divide(2);
        System.out.println("Result after dividing by 2: " + calculator.getResult()); // Expected output: 4.5

        // Test addOperation and undo operations
        calculator.addOperation(10, "+");
        System.out.println("Result after adding 10: " + calculator.getResult()); // Expected output: 14.5

        calculator.addOperation(2, "*");
        System.out.println("Result after multiplying by 2: " + calculator.getResult()); // Expected output: 29.0

        calculator.undo();
        System.out.println("Result after undoing multiply operation: " + calculator.getResult()); // Expected output: 14.5

        calculator.addOperation(3, "/");
        System.out.println("Result after dividing by 3: " + calculator.getResult()); // Expected output: 4.833333333333333

        calculator.undo();
        System.out.println("Result after undoing divide operation: " + calculator.getResult()); // Expected output: 14.5

        calculator.clearHistory();
        System.out.println("Cleared history"); // Expected output: Cleared history
    }
}
