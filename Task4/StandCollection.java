package Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StandCollection implements Serializable {
    private List<Stand> resistanceList;

    public StandCollection() {
        resistanceList = new ArrayList<>();
    }

    public void addResistance(Stand resistance) {
        resistanceList.add(resistance);
    }

    public List<Stand> getResistanceList() {
        return resistanceList;
    }

    public void saveToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(resistanceList);
        } catch (IOException e) {
        }
    }

    public void loadFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            resistanceList = (List<Stand>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    public void addResult(ResistanceResult result, Object resultsCollection) {
    results.add(result);
    try {
        try (FileOutputStream fileOut = new FileOutputStream("results.ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(resultsCollection);
        }
    System.out.println("Results saved to results.ser");
} catch (IOException e) {
}
   try {
        try (FileInputStream fileIn = new FileInputStream("results.ser")) {
            ObjectInputStream in = new ObjectInputStream(fileIn);
            in.close();
        }
    System.out.println("Results loaded from results.ser");
} catch (IOException e) {
}
 

}

}