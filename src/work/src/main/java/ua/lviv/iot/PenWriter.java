package work.src.main.java.ua.lviv.iot;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PenWriter {
    private String filePath;

    public PenWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeToFile(List<Pen> pens) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Write headers to file
            writer.write(pens.get(0).getHeaders() + "\n");

            // Write pen data to file
            for (Pen pen : pens) {
                writer.write(pen.toCSV() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
