import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by PetruninaIN on 16.01.2016.
 */

// 1. Вывести название всех месяцев, в которых встречается пятница 13-е в указанном году.

public class Friday1 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        //определяем переменную с воскресеньем
        String FindDay = "Sun";
        //определяем счетчик
        int kol = 0;


        //консольный ввод года
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = Integer.parseInt(scaner.nextLine());


        //проверка на валидность года
        if (year < 2020 && year > 1900) {
            //присвоение года и числа
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.set(Calendar.YEAR, year);


            //проход по всем месяцам.
            //поиск, если воскресенье попадает на 1 число.
            for (int i = 0; i < 11; i++) {

                //присвоение месяца
                calendar.set(Calendar.MONTH, i);

                if (calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US) == FindDay) {
                    kol += 1;
                    System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US));
                }
            }

            System.out.println("In 2001 Friday, 13 was " + kol);

        }
    }
}
