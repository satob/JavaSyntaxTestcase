package java15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TextBlock {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("nul")));
        Java15TextBlock t = new Java15TextBlock();
        t.textBlock();
    }
}
