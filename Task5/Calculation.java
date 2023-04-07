package ex01;
import java.io.Serializable;
import java.util.Scanner;

public class Calculation implements Serializable {
    private double decimal;
    private String binaryIntegerPart;
    private String binaryFractionalPart;

    public Calculation(double decimal) {
        this.decimal = decimal;
        calculateBinaryRepresentation();
    }

    private void calculateBinaryRepresentation() {
        // Separate integer and fractional parts
        int integerPart = (int) decimal;
        double fractionalPart = decimal - integerPart;

        // Convert integer part to binary
        binaryIntegerPart = Integer.toBinaryString(integerPart);

        // Convert fractional part to binary
        StringBuilder binaryFractionalPartBuilder = new StringBuilder();
        while (fractionalPart > 0) {
            double product = fractionalPart * 2;
            if (product >= 1) {
                binaryFractionalPartBuilder.append("1");
                fractionalPart = product - 1;
            } else {
                binaryFractionalPartBuilder.append("0");
                fractionalPart = product;
            }
        }
        binaryFractionalPart = binaryFractionalPartBuilder.toString();
    }

    public double getDecimal() {
        return decimal;
    }

    public String getBinaryIntegerPart() {
        return binaryIntegerPart;
    }

    public String getBinaryFractionalPart() {
        return binaryFractionalPart;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();

        Calculation binaryRepresentation = new Calculation(decimal);

        System.out.println("Binary representation of " + binaryRepresentation.getDecimal() + ":");
        System.out.println(binaryRepresentation.getBinaryIntegerPart() + "." + binaryRepresentation.getBinaryFractionalPart());
    }
}

