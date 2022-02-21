package java14;

import java.time.DayOfWeek;

public class SwitchYield {
    public static void main(String[] args) {
        var day = DayOfWeek.SUNDAY;

        int i = 1, j, k;
        j = i == 1 ? 3 : 4;

        switch (i) {
        case 1: System.out.println(""); break;
        default: { System.out.println(""); }
        }

        switch (j) {
        case 2 -> bar();
        case 3 -> { foo(); }
        case 4 -> throw new RuntimeException();
        default -> bar();
        }

        k = switch (day) { case SUNDAY: yield 5; default: yield 6; };

        k = switch (day) { case SUNDAY: yield true; default: yield false; } ? 7 : 8;

        if (switch (day) { case SUNDAY: yield true; default: yield false; }) {}

        var value = switch (day) {
            case MONDAY:    yield 1;
            case TUESDAY:   yield 2;
            case WEDNESDAY: yield 3;
            case THURSDAY:  yield 4;
            case FRIDAY:    yield 5;
            case SATURDAY:  yield 6;
            default:        yield 100 + day.ordinal();
        };
        System.out.println(value);
    }

    public static void foo() {}
    public static void bar() {}
}
