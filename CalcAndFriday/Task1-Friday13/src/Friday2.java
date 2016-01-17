import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by PetruninaIN on 16.01.2016.
 */

//2. Вывести года, где пятница 13-е попадается в указанном месяце.
// Вывести количество совпадений.
// Проверку проводить до сегодняшнего дня.
// Сделать проверку входных данных на валидность.

public class Friday2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        //определяем переменную с воскресеньем
        String FindDay = "Sun";
        //определяем счетчик
        int kol = 0;


        //консольный ввод месяца
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter month:");
        int month = Integer.parseInt(scaner.nextLine());

        //консольный ввод года
        System.out.println("Enter year:");
        int year = Integer.parseInt(scaner.nextLine());


        //сохранение данных о сегодняшнем дне
        //String NowDayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US);
        //String NowMonth = calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US);
        int NowYear = 2016;
        //проверка на то, что месяц введенный меньше или равен месяцу текущему. Чтобы не перепрыгнуть текущую дату в подсчетах пятниц.
        //  if (month > NowMonth) NowYear--;


        //проверка на валидность года
        if (year < NowYear && year > 1900 && month >= 0 && month < 12) {
            //присвоение года, месяца и числа
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.YEAR, year);


            //проход по всем годам.
            //поиск, если воскресенье попадает на 1 число.
            while (year <= NowYear) {

                if (calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US) == FindDay) {
                    kol += 1;
                    System.out.println(year);
                }

                year++;
                calendar.set(Calendar.YEAR, year);
            }

            System.out.println("number of coincidences is equal " + kol);
        }
    }
}
