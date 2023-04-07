package ex01;
import java.io.*;

public class CalculationDemo implements Serializable {
    private int nonTransientField;
    private transient String transientField;

    public CalculationDemo(int nonTransientField, String transientField) {
        this.nonTransientField = nonTransientField;
        this.transientField = transientField;
    }

    public void saveToFile(String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Object has been serialized");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static CalculationDemo loadFromFile(String filename) {
        CalculationDemo obj = null;
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj = (CalculationDemo) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Object has been deserialized");
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public int getNonTransientField() {
        return nonTransientField;
    }

    public String getTransientField() {
        return transientField;
    }
}