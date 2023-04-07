package Task3;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


 /**
 * The class Resistance collection implements serializable
 */ 
public class StandCollection implements Serializable {
    private List<Stand> resistanceList;


/** 
 *
 * Resistance collection
 *
 * @return public
 */
    public StandCollection() { 

        resistanceList = new ArrayList<>();
    }


/** 
 *
 * Add resistance
 *
 * @param resistance  the resistance
 */
    public void addResistance(Stand resistance) { 

        resistanceList.add(resistance);
    }


/** 
 *
 * Gets the resistance list
 *
 * @return the resistance list
 */
    public List<Stand> getResistanceList() { 

        return resistanceList;
    }


/** 
 *
 * Save to file
 *
 * @param fileName  the file name
 */
    public void saveToFile(String fileName) { 

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(resistanceList);
        } catch (IOException e) {
        }
    }


/** 
 *
 * Load from file
 *
 * @param fileName  the file name
 */
    public void loadFromFile(String fileName) { 

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            resistanceList = (List<Stand>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
    }


/** 
 *
 * Add result
 *
 * @param result  the result
 * @param resultsCollection  the results collection
 */
    public void addResult(StandResult result, Object resultsCollection) { 

    results.add(result);
    try {
        try (FileOutputStream fileOut = new FileOutputStream("results.ser"); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(resultsCollection);
        }
    System.out.println("Результат зберiгається в results.ser");
} catch (IOException e) {
}
   try {
        try (FileInputStream fileIn = new FileInputStream("results.ser")) {
            ObjectInputStream in = new ObjectInputStream(fileIn);
            in.close();
        }
    System.out.println("Результат скачаний з results.ser");
} catch (IOException e) {
}
 

}

}