import java.io.*;

/**
 * Created by PetruninaIN on 23.01.2016.
 */

public class Solution {
    public static void main(String[] args) throws IOException {

        String[] name = new String[11];
        String[] bankBook = new String[11];
        Integer[] budget = new Integer[11];
        OrganizationsInfo organizations = new OrganizationsInfo();
        organizations.readFile(name, bankBook, budget);

        String filenameO = "C:\\Users\\PetruninaIN\\GitTask\\SSU_411_ipetrunina\\Task4\\Data\\information.csv";
        ReadCVS read = new ReadCVS();
        String[][] org = read.run(filenameO, 1);
        int countOrg = read.getCount() - 1;

        String[] sender = new String[10];
        String[] bankbookSender = new String[10];
        String[] receiver = new String[10];
        String[] bankbookReceiver = new String[10];
        Integer[] sum = new Integer[10];

        Transactions transactions = new Transactions();
        transactions.TransactionsInfo(sender, bankbookSender, receiver, bankbookReceiver, sum);
        int countTrans = transactions.GetCountTrans();

        int errorTrans = 0;
        boolean errorSum = true;

        for (int i = 0; i < countTrans; i++) {
            for (int j = 0; j < countOrg; j++) {
                if (bankBook[j].equals(bankbookSender[i])) {
                    for (int k = 0; k < countOrg; k++) {
                        if (bankbookReceiver[i].equals(bankBook[k])) {
                            if (sum[i] <= budget[j]) {
                                budget[j] -= sum[i];
                                budget[k] += sum[i];
                                errorTrans++;
                            } else {
                                System.out.println("Error: SUM < BUDGET!");
                                errorSum = false;
                            }
                        }
                    }
                }
            }
        }

        if (errorSum && errorTrans == countTrans) {
            WriteCVS writeResult = new WriteCVS();
            writeResult.writeCSV(name, bankBook, budget, countOrg);
        } else {
            System.out.println("ERROR: Invalid transactions");
        }
    }
}