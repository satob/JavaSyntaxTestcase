package java11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class VarInLambdaParameter {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("nul")));
        Java11VarInLambdaParameter v = new Java11VarInLambdaParameter();
        v.varInLambdaParameter();
    }
}
