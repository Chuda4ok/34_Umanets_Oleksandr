package ex01;

import java.util.ArrayList;

public class CalculationManager {
    private final ArrayList<UndoableCommand> undoableCommands;

    public CalculationManager() {
        undoableCommands = new ArrayList<>();
    }

    public CalculationResult calculateResistance(double res1, double res2, double res3) {
        ElectricalResistance electricalResistance = new ElectricalResistance(res1, res2, res3);
        double totalResistance = electricalResistance.getTotalResistance(1.0);
        CalculationResult result = new CalculationResult(totalResistance);
        return result;
    }

    public void undoLastCommand() {
        if (!undoableCommands.isEmpty()) {
            UndoableCommand command = undoableCommands.remove(undoableCommands.size() - 1);
            command.undo();
        }
    }
}
