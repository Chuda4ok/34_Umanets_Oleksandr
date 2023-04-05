package ex01;
import java.util.ArrayList;

public class CalculationResult {
    private ArrayList<Problem> problems;

    public CalculationResult() {
        problems = new ArrayList<>();
    }

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public void solveProblems() {
        for (Problem problem : problems) {
            problem.solve();
        }
    }

    public static void main(String[] args) {
        CalculationResult problemSolver = new CalculationResult();

        // Add problems to solver
        problemSolver.addProblem(new AdditionProblem(5, 7));
        problemSolver.addProblem(new SubtractionProblem(10, 3));
        problemSolver.addProblem(new MultiplicationProblem(6, 4));
        problemSolver.addProblem(new DivisionProblem(12, 3));

        // Solve problems
        problemSolver.solveProblems();
    }
}

interface Problem {
    void solve();
}

class AdditionProblem implements Problem {
    private int operand1;
    private int operand2;

    public AdditionProblem(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void solve() {
        int result = operand1 + operand2;
        System.out.println(operand1 + " + " + operand2 + " = " + result);
    }
}

class SubtractionProblem implements Problem {
    private int operand1;
    private int operand2;

    public SubtractionProblem(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void solve() {
        int result = operand1 - operand2;
        System.out.println(operand1 + " - " + operand2 + " = " + result);
    }
}

class MultiplicationProblem implements Problem {
    private int operand1;
    private int operand2;

    public MultiplicationProblem(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void solve() {
        int result = operand1 * operand2;
        System.out.println(operand1 + " * " + operand2 + " = " + result);
    }
}

class DivisionProblem implements Problem {
    private int dividend;
    private int divisor;

    public DivisionProblem(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public void solve() {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println(dividend + " / " + divisor + " = " + quotient + " with remainder " + remainder);
    }
}
