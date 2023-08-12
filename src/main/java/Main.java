import java.util.Scanner;

public class Main {
    static int numberOfPersons;
    static Scanner scanner = new Scanner(System.in);//Попытка объявить Scanner для всех классов

    public static void main(String[] args) {
        System.out.println("Привет!\nВведи числом количество человек, на которых необходимо поделить счёт: ");
        while (true) {
            while (!scanner.hasNextInt()) { //До тех пор пока "не число", просим ввести "число".
                scanner.next();
                System.out.println("Введите количество человек числом: ");
            }
            numberOfPersons = scanner.nextInt();
            if (numberOfPersons > 1) {
                System.out.println("Отлично!");
                break;
            } else {
                System.out.println("Вы ввели \"" + numberOfPersons + "\" - это некоректное значение.\nДелить счет имеет смысл, если вас больше одного человека.\nВведите количество человек: ");
                }
        }
        System.out.println("Счет поделим на " + numberOfPersons + ".");
        Calculator calculator = new Calculator();
        calculator.calculator();
        Formatter.formatter();
        scanner.close();
    }

}