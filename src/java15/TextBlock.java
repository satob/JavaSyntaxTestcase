package java15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TextBlock {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("nul")));

        var textBlock = """
                This
                is
                text
                block
                """;
        System.out.println(textBlock);

        System.out.println("""
                Text
                Block
                Literal
                """);

        var textBlockConcatinate = """
                This \
                is \
                text \
                block \
                concatinated
                """;
        System.out.println(textBlockConcatinate);

        System.out.println("""
                Text \
                Block \
                Literal \
                Concatinated
                """);

        System.out.println("""
                Text \
                Block \
                Literal \
                Contains \""" \
                In the value
                """);
    }
}
