import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        scan.useDelimiter("\n");//при сканировании данных устанавливаем разделитель как симвал новой строки (по умолчанию им является и пробел)
        int visitors;
        System.out.println("Здравствуйте!\nНа сколько человек необходимо разделить счет? Введите число.");
        while (true) {
            if(scan.hasNextInt()) { //До тех пор пока "не число", просим ввести количество человек целым числом
                visitors = scan.nextInt();
                //scan.nextLine(); //Если не писать scan.useDelimiter("\n");
                if (visitors == 1) {//Проверяем,если число, то из нужного диапазона
                    System.out.println("Количество человек равно 1. В этом случае нет смысла ничего считать и делить.\nВведите количество человек числом.");
                } else if (visitors < 1) {
                    System.out.println("Количество человек меньше 1. Это некорректное значение для подсчёта.\nВведите количество человек числом.");
                } else {
                    System.out.println("Отлично! Счет разделим на " + visitors + "!\n");
                    break;
                }
            } else {
                System.out.println("Количество человек введено неверно.\nВведите количество человек целым числом.");
                scan.next();
                //scan.nextLine();
            }
        }
        Calculator calculator = new Calculator();
        calculator.сalculationOfItems(scan);

        Сurrency_designation сurrencyDesignation = new Сurrency_designation();
        сurrencyDesignation.choosingAnEnding(calculator.getTotalCost(), visitors);

        scan.close();

    }
}