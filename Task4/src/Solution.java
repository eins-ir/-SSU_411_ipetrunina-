import java.io.*;
import java.util.Stack;

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
        Stack StackAll = new Stack();

        String[] name = new String[100];
        String[] bankBook = new String[100];
        Integer[] budget = new Integer[100];
        OrganizationsInfo organizationtmp = new OrganizationsInfo();
        organizationtmp.readFile(name, bankBook, budget);

        String[] sender = new String[10];
        String[] bankbookSender = new String[10];
        String[] receiver = new String[10];
        String[] bankbookReceiver = new String[10];
        Integer[] sum = new Integer[10];

        Transactions transactions = new Transactions();
        transactions.TransactionsInfo(sender, bankbookSender, receiver, bankbookReceiver, sum);

        WriteCVS writeResult = new WriteCVS();
        writeResult.writeCSV(name, bankBook, budget);
    }
}

