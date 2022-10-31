package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
            case 2:
                System.out.println(28);
            default:
                System.out.println(31);
        }
    }
}
