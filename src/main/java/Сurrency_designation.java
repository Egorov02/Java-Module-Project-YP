public class Сurrency_designation {
    void choosingAnEnding(double totalCost, int visitors){
        double totalPerVisior = totalCost / visitors;
        String currency;
        String rub;
        if (10 < (int) totalPerVisior % 100 && (int) totalPerVisior % 100 < 15) {
            rub = "рублей";
        } else {
            int lastDigit = (int) totalPerVisior % 10;
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
        String amountPerPersonLine = String.format("%.2f", totalPerVisior);
        System.out.println("Сумма, которую должен заплатить каждый посетитель: " + amountPerPersonLine + " " + rub);
    }
}
