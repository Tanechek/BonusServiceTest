public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 30;
        int actual = (int) service.calculate(1_000, true);
        System.out.print(actual + " == ? == " + expected);

        expected = 500;
        actual = (int) service.calculate(1_000_000, true);
        System.out.println(actual + " == ? == " + expected);
    }
}
