package ex01;

/**
 *
 * @author User
 */
public abstract class UndoableCommand {
    public abstract void execute();
    public abstract void undo();
}
