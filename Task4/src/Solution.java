import java.io.*;

/**
 * Created by PetruninaIN on 23.01.2016.
 */

/*
  1) Копейки подсчитывать не обязательно, достаточно работать с целочисленными данными.
  2) result.csv должен содержать все предприятия с информацией о их бюджете.
  Названия у предприятий может совпадать, но различать их в данном случае будет лицевой счет.
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

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (bankBook[j].equals(bankbookSender[i])) {
                    for (int k = 0; k < 10; k++) {
                        if (bankbookReceiver[i].equals(bankBook[k])) {
                            if (sum[i] <= budget[j]) {
                                budget[j] -= sum[i];
                                budget[k] += sum[i];
                            }
                        }
                    }
                }
            }
        }

        WriteCVS writeResult = new WriteCVS();
        writeResult.writeCSV(name, bankBook, budget);
    }
}

