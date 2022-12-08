public class Main {
    public static void main(String[] arg) {

        BonusMilesService service = new BonusMilesService();

        int cost = 10_000;
        int miles = service.calculate(cost);

        System.out.println("Поздравляем, заплатив " + cost + ", Вы получили " +
                miles + " бонусных миль!");

    }

}
