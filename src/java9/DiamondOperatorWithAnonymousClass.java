package java9;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperatorWithAnonymousClass {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(){
            @Override
            public String toString() {
                return "Anonymous ArrayList";
            }
        };
        System.out.println(list);
    }
}
