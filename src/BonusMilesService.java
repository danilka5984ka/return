public class BonusMilesService {

    public static int calculate(int cost) {
        int price = cost;
        int miles = price / 20;

        return miles;
    }
}
