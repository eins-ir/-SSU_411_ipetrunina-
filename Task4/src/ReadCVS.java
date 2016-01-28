import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCVS {
    public String[][] run(String csvFile, int o) {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        String[][] org = new String[100][3];
        String[][] trans = new String[100][4];
        int i = 0;

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                if (o == 1) {
                    String[] orgtmp = line.split(cvsSplitBy);
                    org[i] = orgtmp;
                    i++;
                }

                if (o == 2) {
                    String[] transtmp = line.split(cvsSplitBy);
                    trans[i] = transtmp;
                    i++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (o == 1) return org;
        else return trans;
    }

}
