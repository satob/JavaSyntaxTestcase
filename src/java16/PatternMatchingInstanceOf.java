package java16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PatternMatchingInstanceOf {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("nul")));

        Object obj = "abc";
        if (obj instanceof String s) {
          System.out.println(s.length());
        }
    }
}
