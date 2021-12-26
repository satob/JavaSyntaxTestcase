package java14;

import java.time.DayOfWeek;

public class SwitchYieldWithArrowAndBlock {
    public static void main(String[] args) {
        var day = DayOfWeek.SUNDAY;
        var value = switch (day) {
        case MONDAY -> {
            System.out.println(day);
            yield 1;
        }
        case TUESDAY -> {
            System.out.println(day);
            yield 2;
        }
        case WEDNESDAY -> {
            System.out.println(day);
            yield 3;
        }
        case THURSDAY -> {
            System.out.println(day);
            yield 4;
        }
        case FRIDAY -> {
            System.out.println(day);
            yield 5;
        }
        case SATURDAY -> {
            System.out.println(day);
            yield 6;
        }
        default -> {
            if (day.equals(DayOfWeek.SUNDAY)) {
                System.out.println(day);
            }
            yield 100 + day.ordinal();
        }
        };
        System.out.println(value);
    }
}
