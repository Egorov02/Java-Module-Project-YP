import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto[] cars = new Auto[3]; //Создаю массив, так как известно окончательное количество участников (3 авто)

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Auto();
            System.out.println("— Введите название машины №" + (i + 1) + ": ");
            String name = scanner.nextLine();
            cars[i].setNameAuto(name);

            System.out.println(); // Добавляю пустую строку, чтобы создать отступ (как в примере в задании)

            boolean validSpeed = false;
            while (!validSpeed) {
                System.out.println("— Введите скорость машины №" + (i + 1) + ": ");
                if (scanner.hasNextInt()) {// Проверка ввода в нужном диапазоне описана в классе Auto
                    int speed = scanner.nextInt();
                    validSpeed = cars[i].setSpeedAuto(speed);

                    System.out.println(); // Добавляю пустую строку, чтобы создать отступ (как в примере в задании)

                } else {
                    System.out.println("Скорость автомобиля введена неверно.\nВведите скорость целым числом.");
                    scanner.next();
                }
            }
            scanner.nextLine(); // Очистка буфера после ввода int (так как остаётся символ \n после ввода пользователя)
            // или лучше использовать  Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            //        scan.useDelimiter("\n");?
        }
        Race leman24 = new Race();
        Auto raceLeader = leman24.findRaceLeader(cars);
        System.out.println("Самая быстрая машина: " + raceLeader.getNameAuto());

        scanner.close();
    }
}