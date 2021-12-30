package java16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SealedClass2 extends Parent2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("nul")));

        SealedClass2 s = new SealedClass2();
        s.greetings();
    }
}

non-sealed class Parent2 extends GrandParent2 {
}

abstract sealed class GrandParent2 permits Parent2 {
    protected void greetings() {
        System.out.println("This is a sealed class");
    }
}
