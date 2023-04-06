package ex01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalculationManager calculationManager = new CalculationManager();

        while (true) {
            System.out.println("Введіть значення для кожного провідника (через пробіл):");
            double res1 = scanner.nextDouble();
            double res2 = scanner.nextDouble();
            double res3 = scanner.nextDouble();

            CalculationResult result = calculationManager.calculateResistance(res1, res2, res3);

            System.out.println("Enter 't' for text output or 'q' to quit:");
            String outputFormat = scanner.next();

            if (outputFormat.equals("q")) {
                break;
            }

            FactoryMethod factoryMethod;

            if (outputFormat.equals("tab")) {
                factoryMethod = new TableResultFactory();
            } else {
                factoryMethod = new TextResultFactory();
            }

            ResultFormatter formatter = factoryMethod.createResultFormatter();
            String output = formatter.formatResult(result);

            System.out.println(output);
        }
    }
}
