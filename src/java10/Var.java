package java10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Var {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("nul")));
        Java10Var t = new Java10Var();
        t.varVariable();
    }
}
