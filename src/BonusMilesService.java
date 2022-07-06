public class BonusMilesService {

    public int calculate(int cost) {
        int miles;
        if (cost / 20 >= 1) {
            miles = cost / 20;
        } else {
            miles = 0;
        }
        return miles;
    }
}



