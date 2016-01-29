import java.io.*;

import com.csvreader.CsvWriter;

/**
 * Created by PetruninaIN on 28.01.2016.
 */

public class WriteCVS {
    public static void writeCSV(String[] name, String[] bankbook, Integer[] budget, int countOrg) throws FileNotFoundException {
        String outputFile = "C:\\Users\\PetruninaIN\\GitTask\\SSU_411_ipetrunina\\Task4\\Data\\result.csv";

        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, false), ';');

            csvOutput.write("Name");
            csvOutput.write("Business Account");
            csvOutput.write("Budget");
            csvOutput.endRecord();


            for (int i = 0; i < countOrg; i++) {
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
