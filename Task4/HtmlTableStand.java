package Task4;

/**
 *
 * @author User
 */
public class HtmlTableStand extends Stand {

    public HtmlTableStand(double[] stand) {
    }

    public void printTable(int columnWidth, String cssClass) {
        double totalStand = getTotalStand();
        
        // Виводимо початок таблиці
        System.out.println("<table class=\"" + cssClass + "\">");
        System.out.println("<tr><th>Resistance</th><th>Voltage</th></tr>");
        int n = 0;

        // Виводимо дані таблиці
        for (int i = 0; i < n; i++) {
         
        // Виводимо результуючий загальний опір
        System.out.println("<tr><td colspan=\"2\">Total resistance: " + String.format("%.2f", totalStand)
                + "</td></tr>");

        // Завершуємо таблицю
        System.out.println("</table>");
    }
   
}

    private double getTotalStand() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}