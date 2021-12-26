package java14;

import java.time.DayOfWeek;

public class SwitchYield {
    public static void main(String[] args) {
        var day = DayOfWeek.SUNDAY;
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
}
