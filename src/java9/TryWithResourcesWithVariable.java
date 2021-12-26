package java9;

import java.io.File;
import java.io.PrintStream;

public class TryWithResourcesWithVariable {
    public static void main(String[] args) {
        try {
            tryWithResourcesWithVariable(new PrintStream(new File("\\\\.\\NUL")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void tryWithResourcesWithVariable(final PrintStream ps) {
        try (ps) {
            ps.println("write to null device");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
