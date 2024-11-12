public class Auto {
    String nameAuto;
    int speedAuto;

    public String getNameAuto() {
        return nameAuto;
    }

    public void setNameAuto(String nameAuto) {
        this.nameAuto = nameAuto;
    }

    public int getSpeedAuto() {
        return speedAuto;
    }

    public boolean setSpeedAuto(int speedAuto) {//Содержит проверку, что пользователь ввел верную скорость
        if (speedAuto >= 0 && speedAuto <= 250) {
            this.speedAuto = speedAuto;
            return true;
        } else {
            System.out.println("Неправильная скорость\nДоступные значения от 0 до 250");
            return false;
        }
    }
}
