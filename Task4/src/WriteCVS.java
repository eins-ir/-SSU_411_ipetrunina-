import java.io.*;

import com.csvreader.CsvWriter;

/**
 * Created by PetruninaIN on 28.01.2016.
 */

public class WriteCVS {
    public static void writeCSV(String[] name, String[] bankbook, Integer[] budget) throws FileNotFoundException {
        String outputFile = "C:\\Users\\PetruninaIN\\GitTask\\SSU_411_ipetrunina\\Task4\\Data\\result.csv";

        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, false), ';');

            for (int i = 0; i < 10; i++) {
                csvOutput.write(name[i]);
                csvOutput.write(bankbook[i]);
                csvOutput.write(budget[i].toString());
                csvOutput.endRecord();
            }
            csvOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
