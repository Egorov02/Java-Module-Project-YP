public class Race {
    public Auto findRaceLeader(Auto[] cars) {
        Auto raceLeader = cars[0]; // Начальнаю с предположения, что лидер гонки машина с индексом "0"
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getSpeedAuto() > raceLeader.getSpeedAuto()) {
                raceLeader = cars[i];
            }
        }
        return raceLeader;
    }
}
