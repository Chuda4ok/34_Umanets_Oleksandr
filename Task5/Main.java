package ex01;

import java.util.Stack;

public class Main {
    private double result;
    private Stack<Double> history;

    public Main() {
        result = 0.0;
        history = new Stack<>();
    }

    public double getResult() {
        return result;
    }

    public void add(double number) {
        history.push(result);
        result += number;
    }

    public void subtract(double number) {
        history.push(result);
        result -= number;
    }

    public void multiply(double number) {
        history.push(result);
        result *= number;
    }

    public void divide(double number) {
        history.push(result);
        result /= number;
    }

    public void addOperation(double number, String operation) {
        history.push(result);
        switch(operation) {
            case "+":
                result += number;
                break;
            case "-":
                result -= number;
                break;
            case "*":
                result *= number;
                break;
            case "/":
                result /= number;
                break;
        }
    }

    public void undo() {
        if(!history.isEmpty()) {
            result = history.pop();
        }
    }

    public void clearHistory() {
        history.clear();
    }
}
