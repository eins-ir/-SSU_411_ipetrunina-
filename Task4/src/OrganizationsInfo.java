import java.io.*;

/**
 * Created by PetruninaIN on 23.01.2016.
 */

public class OrganizationsInfo {
    public static void readFile(String[] name, String[] bankBook, Integer[] budget) throws FileNotFoundException {

        String filename = "C:\\Users\\PetruninaIN\\GitTask\\SSU_411_ipetrunina\\Task4\\Data\\information.csv";

        ReadCVS read = new ReadCVS();
        String[][] org = read.run(filename, 1);

        for (int i = 0; i < 10; i++) {
            name[i] = org[i][0];
            bankBook[i] = org[i][1];
            budget[i] = Integer.parseInt(org[i][2]);
        }
    }
}
