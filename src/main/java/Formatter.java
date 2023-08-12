public class Formatter {
    static void formatter() {
        double amountPerPerson = Calculator.totalAmount / Main.numberOfPersons;
        String rub;
        if (10 < (int) amountPerPerson % 100 && (int) amountPerPerson % 100 < 15) {
            rub = "рублей";
        } else {
            int lastDigit = (int) amountPerPerson % 10;
            switch (lastDigit) {
                case 1:
                    rub = "рубль";
                    break;
                case 2:
                case 3:
                case 4:
                    rub = "рубля";
                    break;
                default:
                    rub = "рублей";
                    break;
            }
        }
        String amountPerPersonLine = String.format("%.2f", amountPerPerson);
        System.out.println("Каждый человек должен заплатить: " + amountPerPersonLine + " " + rub);
    }
}
