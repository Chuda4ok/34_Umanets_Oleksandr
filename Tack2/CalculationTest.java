package ex01;
import ex01.CalculationDemo;
import java.io.*;

public class CalculationTest {

    public CalculationTest(int par, int par1, int par2) {
    }

    public static void main(String[] args) {
        // Створюємо об'єкт рівняння квадратного
        CalculationTest equation = new CalculationTest(1, -5, 6);

        // Тестуємо обчислення коренів рівняння
        double[] expectedRoots = {2, 3};
        double[] actualRoots = equation.getRoots();
        if (expectedRoots[0] == actualRoots[0] && expectedRoots[1] == actualRoots[1]) {
            System.out.println("Корені обчислені правильно.");
        } else {
            System.out.println("Помилка в обчисленні коренів.");
        }

        // Тестуємо серіалізацію та десеріалізацію об'єкта
        String fileName = "quadratic_equation.ser";
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(equation);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            System.out.println("Помилка при серіалізації об'єкта: " + e.getMessage());
        }

        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            CalculationTest deserializedEquation = (CalculationTest) in.readObject();
            in.close();
            fileIn.close();

            if (equation.equals(deserializedEquation)) {
                System.out.println("Серіалізація та десеріалізація пройшли успішно.");
            } else {
                System.out.println("Помилка при серіалізації та десеріалізації об'єкта.");
            }
        } catch (IOException e) {
            System.out.println("Помилка при десеріалізації об'єкта: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Помилка при десеріалізації об'єкта: " + e.getMessage());
        }
    }

    private double[] getRoots() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
