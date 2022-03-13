package java16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RecordClass {
    public static void main(String[] args) throws FileNotFoundException {
        Java16RecordClass r = new Java16RecordClass();
        System.setOut(new PrintStream(new File("nul")));
        r.writeRecord();
    }
}

