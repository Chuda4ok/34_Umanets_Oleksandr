package Task4;

/**
 *
 * @author User
 */
public class StandSeriesResult {
    private final Stand resistance1;
    private final Stand resistance2;
    private final double totalResistance;

    public StandSeriesResult(Stand resistance1, Stand resistance2) {
        this.resistance1 = resistance1;
        this.resistance2 = resistance2;
        this.totalResistance = resistance1.getStand() + resistance2.getStand();
    }

    StandSeriesResult(double[] seriesStand) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void printTable(int columnWidth) {
        String format = "| %" + columnWidth + "s | %" + columnWidth + "s | %" + columnWidth + "s |%n";
        String separator = "+";
        for (int i = 0; i < columnWidth + 2; i++) {
            separator += "-";
        }
        separator += "+";

        System.out.format(separator + "%n");
        System.out.format(format, "Resistance 1", "Resistance 2", "Total Resistance");
        System.out.format(separator + "%n");
        System.out.format(format, formatStand(resistance1.getStand()), formatStand(resistance2.getStand()), formatStand(totalResistance));
        System.out.format(separator + "%n");
    }

    private String formatStand(double stand) {
        return String.format("%.2f", stand);
    }

    String getResult() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
