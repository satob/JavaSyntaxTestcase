package java8;

import java.io.File;
import java.io.PrintStream;

public class TryWithResources {
    public static void main(String[] args) {
        try {
            tryWithResources();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void tryWithResources() {
        try (PrintStream ps = new PrintStream(new File("\\\\.\\NUL"))) {
            ps.println("write to null device");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
