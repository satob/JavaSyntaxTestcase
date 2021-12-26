package java14;

import java.time.DayOfWeek;

public class SwitchYieldWithArrowAndComma {
    public static void main(String[] args) {
        var day = DayOfWeek.SUNDAY;
        var value = switch (day) {
        case MONDAY, FRIDAY, SUNDAY:
            yield 6;
        case TUESDAY:
            yield 7;
        case THURSDAY, SATURDAY:
            yield 8;
        case WEDNESDAY:
            yield 9;
        };
        System.out.println(value);
    }
}
