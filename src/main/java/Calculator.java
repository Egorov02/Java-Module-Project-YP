import java.util.Scanner;

public class Calculator {
    double totalCost = 0.0;

    void сalculationOfItems(Scanner scan) {
        StringBuilder listProducts = new StringBuilder("Ваш список товаров:");// Так как у нас

        Product product = new Product();
        // Открываем цикл для ввода товара и подсчета общей стоимости
        while (true) {
            // Вводим название товара
            System.out.println("Введите название товара.");
            product.setProductName(scan.next());
            // Проверка на завершение цикла по ключевому слову
            if (product.getProductName().equalsIgnoreCase("Завершить")) {
                System.out.println("Ввод товаров завершен.\n");
                break;
            }
            // Вводим стоимость товара
            System.out.println("Введите стоимость товара в формате рубли,копейки.");
            // Открываем цикл для проверки соответсвия нашим требованиям введенной цены
            while (true) {
                if (scan.hasNextDouble()) {
                    product.setPrice(scan.nextDouble());// При вводе значение типа int автоматически преобразует в тип double
                    if (product.getPrice() > 0) {
                        break;
                    } else {
                        System.out.println("Вы указали некоректную стоимость. Стоимость товара должна быть больше 0.");
                    }
                } else {
                    System.out.print("Введите стоимость товара числом в формате рубли,копейки: ");
                    scan.next();
                }
            }
            totalCost = totalCost + product.getPrice();

            System.out.println("Вы добавили в список: " + product.getProductName() + ", стоимостью " + product.getPrice());
            listProducts.append("\n").append(product.getProductName());
            //System.out.println(listProducts.toString());
            System.out.println("Если хотите добавить ещё один товар, напишите его название.\nЕсли хотите закончить ввод товаров напишите слово \"Завершить\" в поле ввода товара.");
        }
        System.out.println(listProducts.toString() + "\n" + "Общая стоимость: " + String.format("%.2f", totalCost));

    }
    double getTotalCost() {
        return totalCost;
    }
}