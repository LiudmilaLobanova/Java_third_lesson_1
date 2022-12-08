public class BonusMilesService {

    public int calculate (int cost) {

        int oneMileMoney = 20;

        int gotMiles = cost / oneMileMoney;

        return gotMiles;
    }
}