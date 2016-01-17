import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by PetruninaIN on 16.01.2016.
 */

// Вывести года, где пятница 13-е попадается в указанном месяце.
// Вывести количество совпадений.
// Проверку проводить до сегодняшнего дня.
// Сделать проверку входных данных на валидность.

public class Friday2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        //определяем переменную с воскресеньем
        String FindDay = "Fri";
        //определяем счетчик
        int kol = 0;


        //консольный ввод месяца
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите месяц:");
        int month = Integer.parseInt(scaner.nextLine());

        //консольный ввод года
        System.out.println("Введите год, с которого нужно начинать подсчет пятниц 13:");
        int year = Integer.parseInt(scaner.nextLine());
        int yearenter = year;


        //сохранение данных о сегодняшнем дне
        String NowDayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US);
        int NowMonth = MonthCase(calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US));
        int NowYear = 2016;


        //проверка на то, что месяц введенный меньше или равен месяцу текущему, если введенный год совпадает с текущим.
        // Чтобы не перепрыгнуть текущую дату в подсчетах пятниц.
        if (month > NowMonth && NowYear == year) NowYear--;


        //проверка на правильность введенных вх.данных
        if (year <= NowYear && year > 1899 && month >= 0 && month < 12) {
            //присвоение года, месяца и числа
            calendar.set(Calendar.DAY_OF_MONTH, 13);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.YEAR, year);

            //проход по всем годам.
             while (year <= NowYear) {
                if (calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US) == FindDay) {
                    kol += 1;
                    System.out.println(year);
                }
                year++;
                calendar.set(Calendar.YEAR, year);
            }
            System.out.println("С " + yearenter + " года количество пятниц 13 равно " + kol);
        }
        else System.out.println("Введите правильные значения! Месяц в числовом формате от 0 до 11. Год в числовом формате от 1900 до 2016");
    }

    //перевод месяца в числовой вид
    private static int MonthCase(String monthString){
        int month;
        switch (monthString) {
            case "Jan": month = 0;
                break;
            case "Feb": month = 1;
                break;
            case "Mar": month = 2;
                break;
            case "Apr": month = 3;
                break;
            case "May": month = 4;
                break;
            case "Jun": month = 5;
                break;
            case "Jul": month = 6;
                break;
            case "Aug": month = 7;
                break;
            case "Sep": month = 8;
                break;
            case "Oct": month = 9;
                break;
            case "Nov": month = 10;
                break;
            case "Dec": month = 11;
                break;
            default: month = 15;
                break;
        }
        return month;
    }
}
