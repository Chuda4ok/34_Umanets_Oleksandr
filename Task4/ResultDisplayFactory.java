package Task4;

/**
 *
 * @author User
 */
public interface ResultDisplayFactory {
    public ResultDisplay createResultDisplay(ResistanceResult result);
    public String getDisplayName();
}
