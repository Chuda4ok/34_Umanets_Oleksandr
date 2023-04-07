package ex01;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculationParallel implements Serializable {
    private List<Double> numbers;

    public CalculationParallel(List<Double> numbers) {
        this.numbers = numbers;
    }

    public double findMinimum() {
        return numbers.parallelStream().mapToDouble(Double::doubleValue).min().orElse(Double.NaN);
    }

    public double findMaximum() {
        return numbers.parallelStream().mapToDouble(Double::doubleValue).max().orElse(Double.NaN);
    }

    public double calculateAverage() {
        return numbers.parallelStream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
    }

    public List<Double> selectByCriterion(double criterion) {
        return numbers.parallelStream().filter(number -> number >= criterion).collect(Collectors.toList());
    }

    public double calculateStandardDeviation() {
        double average = calculateAverage();
        double sumOfSquares = numbers.parallelStream().mapToDouble(number -> Math.pow(number - average, 2)).sum();
        return Math.sqrt(sumOfSquares / numbers.size());
    }

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(2.0);
        numbers.add(5.0);
        numbers.add(10.0);
        numbers.add(1.0);
        numbers.add(8.0);

        CalculationParallel calculation = new CalculationParallel(numbers);

        System.out.println("Minimum value: " + calculation.findMinimum());
        System.out.println("Maximum value: " + calculation.findMaximum());
        System.out.println("Average value: " + calculation.calculateAverage());
        System.out.println("Values greater than or equal to 5: " + calculation.selectByCriterion(5));
        System.out.println("Standard deviation: " + calculation.calculateStandardDeviation());
    }
}


