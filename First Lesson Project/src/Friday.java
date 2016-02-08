import sun.security.jca.GetInstance;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by PetruninaIN on 15.01.2016.
 */

public class Friday {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 13);

        System.out.println(calendar.getTime());

        System.out.println(calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US));

        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter:");
        String str = scaner.nextLine();
        System.out.println(str + " " + "I read it");

        System.out.println("Enter:");
        int year = Integer.parseInt(scaner.nextLine());
        System.out.println(String.valueOf(year-10));

    }

}
