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
        int count = 0;

        while (StackAll.empty() == false) {
            BeginDir = (String) StackAll.pop();
            String[][] transaction = read.run(BeginDir, 2);

            sender[count] = transaction[1][0];
            bankbookSender[count] = transaction[1][1];
            receiver[count] = transaction[1][2];
            bankbookReceiver[count] = transaction[1][3];
            sum[count] = Integer.parseInt(transaction[1][4]);
            count++;
        }
    }

    public static Integer GetCountTrans() {
        String BeginDir = "C:\\Users\\PetruninaIN\\GitTask\\SSU_411_ipetrunina\\Task4\\Data\\Transactions";
        File file = new File(BeginDir);
        String m[] = file.list();
        return m.length;
    }

}