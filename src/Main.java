public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int miles = service.calculate(40);


        System.out.println("Начислено миль " + miles);

    }
}
