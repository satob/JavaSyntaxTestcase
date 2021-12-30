package java11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.function.Consumer;

public class VarInLambdaParameter {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("nul")));

        var function1 = (Consumer<String>) (var testString) -> {
            if (testString.isEmpty()) {
                System.out.println("string is empty");
            }
        };
        function1.accept("");
    }
}
