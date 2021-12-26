package java11;

import java.util.function.Consumer;

public class VarInLambdaParameter {
    public static void main(String[] args) {
        var function1 = (Consumer<String>) (var testString) -> {
            if (testString.isEmpty()) {
                System.out.println("string is empty");
            }
        };
        function1.accept("");
    }
}
