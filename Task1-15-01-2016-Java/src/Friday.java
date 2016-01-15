import sun.security.jca.GetInstance;
import java.util.Calendar;
import java.util.Locale;

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

    }

}
