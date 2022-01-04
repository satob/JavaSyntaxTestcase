package java16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PatternMatchingInstanceOf {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new File("nul")));

        // javac cannot refer s1 in the block because Clover inserts || into conditional statement
        // 一見、ブロックの中にString s1 = (String) obj1;を挿入すればいいように見えるが……
        Object obj1 = "abc";
        if (obj1 instanceof String s1) {
            System.out.println(s1.length());
        }

        // 以下のように最初からif文の中に||がある場合は明示的にブロック中で同じ名前の変数を定義できるので
        // 無条件に宣言文を挿入してしまうと逆にコンパイルエラーになってしまう
        Object obj2 = "def";
        Object obj3 = "def";
        if ((obj2 instanceof String s2) || (obj3 instanceof String s3)) {
            String s2 = (String) obj2;
            String s3 = (String) obj3;
            System.out.println(s2.length() + " " + s3.length());
        }

        // またinstanceofは三項演算子でも使えるので、この場合は挿入のしようがない
        Object obj4 = "def";
        String s5 = obj4 instanceof String s4 ? s4 : "" ;
        System.out.println(s5);
    }
}
