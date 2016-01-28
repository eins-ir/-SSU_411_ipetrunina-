import java.io.File;
import java.util.Stack;

/**
 * Created by PetruninaIN on 23.01.2016.
 */

public class Transactions {
    public static void TransactionsInfo(String[] sender, String[] bankbookSender,
                                        String[] receiver, String[] bankbookReceiver,
                                        Integer[] sum) {
        Stack StackAll = new Stack();
        String BeginDir = "C:\\Users\\PetruninaIN\\GitTask\\SSU_411_ipetrunina\\Task4\\Data\\Transactions";

        File file = new File(BeginDir);
        String m[] = file.list();

        for (int i = 0; i < m.length; i++) {
            StackAll.add(BeginDir + "\\" + m[i]);
        }

        ReadCVS read = new ReadCVS();
        int k=0;

        while (StackAll.empty() == false) {
            BeginDir = (String) StackAll.pop();
            String[][] transaction = read.run(BeginDir, 2);

            sender[k] = transaction[0][0];
            bankbookSender[k] = transaction[0][1];
            receiver[k] = transaction[0][2];
            bankbookReceiver[k] = transaction[0][3];
            sum[k] = Integer.parseInt(transaction[0][4]);
            k++;
        }
    }
}