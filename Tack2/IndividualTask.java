public class IndividualTask {
    
    // метод для знаходження двійкового уявлення цілої частини числа
    public static String integerToBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.append(num % 2);
            num /= 2;
        }
        return binary.reverse().toString();
    }
    
    // метод для знаходження двійкового уявлення дробової частини числа
    public static String fractionToBinary(double num, int precision) {
        StringBuilder binary = new StringBuilder();
        while (num > 0 && precision > 0) {
            num *= 2;
            if (num >= 1) {
                binary.append(1);
                num -= 1;
            } else {
                binary.append(0);
            }
            precision--;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        // приклад використання
        double number = 20;
        int integerPart = (int) number;
        double fractionPart = number - integerPart;
        String binaryInteger = integerToBinary(integerPart);
        String binaryFraction = fractionToBinary(fractionPart, 4); // точність до 4 бітів
        System.out.println(number + " = " + binaryInteger + "." + binaryFraction);
    }
}