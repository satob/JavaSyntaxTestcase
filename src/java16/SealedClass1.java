package java16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public final class SealedClass1 extends Parent {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("nul")));

        SealedClass1 s = new SealedClass1();
        s.greetings();
    }
}

abstract sealed class Parent implements InterfaceForTest permits SealedClass1 {
    public void greetings() {
        System.out.println("This is a sealed class");
    }
}

interface InterfaceForTest {
    public void greetings();
}

