import java.io.*;

/**
 * Created by PetruninaIN on 23.01.2016.
 */

public class Solution {
    public static void main(String[] args) throws IOException {

        String[] name = new String[10];
        String[] bankBook = new String[10];
        Integer[] budget = new Integer[10];
        OrganizationsInfo organizations = new OrganizationsInfo();
        organizations.readFile(name, bankBook, budget);

        String[] sender = new String[10];
        String[] bankbookSender = new String[10];
        String[] receiver = new String[10];
        String[] bankbookReceiver = new String[10];
        Integer[] sum = new Integer[10];

        Transactions transactions = new Transactions();
        transactions.TransactionsInfo(sender, bankbookSender, receiver, bankbookReceiver, sum);

        int errTr = 0;
        boolean errSUM = true;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (bankBook[j].equals(bankbookSender[i])) {
                    for (int k = 0; k < 10; k++) {
                        if (bankbookReceiver[i].equals(bankBook[k])) {
                            if (sum[i] <= budget[j]) {
                                budget[j] -= sum[i];
                                budget[k] += sum[i];
                                errTr++;
                            } else {
                                System.out.println("Error: SUM < BUDGET!");
                                errSUM = false;
                            }
                        }
                    }
                }
            }
        }

        if (errSUM && errTr == 5) {
            WriteCVS writeResult = new WriteCVS();
            writeResult.writeCSV(name, bankBook, budget);
        } else {
            System.out.println("ERROR: Invalid transactions");
        }
    }
}