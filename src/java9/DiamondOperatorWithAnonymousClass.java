package java9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorWithAnonymousClass {

    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("nul")));

        List<String> list = new ArrayList<>(){
            @Override
            public String toString() {
                return "Anonymous ArrayList";
            }
        };
        System.out.println(list);
    }
}
