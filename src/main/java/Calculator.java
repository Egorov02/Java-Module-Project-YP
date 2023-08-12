public class Calculator {
    static double totalAmount;

    void calculator() {
        StringBuilder allProducts = new StringBuilder("\"Добавленные товары\":");//Используем класс StringBuilder, так как он является изменяемым и эффективенее работает с памятью, при конкатинации
        Product product = new Product();
        System.out.println("Давайте добавим товар в счет.");
        while (true) {
            System.out.print("Введите название товара: ");
            product.productName = Main.scanner.next();
            if (product.productName.equalsIgnoreCase("Завершить")) {
                System.out.println("Вы ввели команду \"Завершить\".\nПроцесс добавления товаров остановлен.");
                break;
            }
            System.out.print("Введите стоимость товара в формате \"рубли,копейки\": ");//проверить что вводить для отделеня дробной части от целой ( точка или запятая)
            while (true) {
                while (!Main.scanner.hasNextDouble() && !Main.scanner.hasNextInt()) {
                    Main.scanner.next();
                    System.out.print("Введите стоимость товара числом: ");
                }
                product.productPrice = Main.scanner.nextDouble();
                if (product.productPrice > 0) {
                    break;
                } else {
                    System.out.println("Некоректная стоимость. Стоимость товара должна быть больше \"0\".");
                }
            }
            allProducts = new StringBuilder(allProducts + "\n" + product.productName);
            totalAmount = totalAmount + product.productPrice;
            System.out.println("Товар успешно добавлен!\nДобавленный товар: " + product.productName);

            System.out.println("Хотите добавить еще один товар?");
            String approved = Main.scanner.next();
            if (approved.equalsIgnoreCase("Да")) {
                System.out.println("Продолжаем.");
            } else {
                System.out.println("Для прекращения заполнения введите команду \"Завершить\" или продолжите добавлять товар.");
            }
        }
        System.out.println(allProducts + "\n" + "Общая стоимость: " + totalAmount);
    }
}
