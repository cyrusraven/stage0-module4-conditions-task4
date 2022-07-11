package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println(first);
        } else if (first < second && second > third) {
            System.out.println(second);
        } else if (first <= third && second < third) {
            System.out.println(third);
        }
    }
}
