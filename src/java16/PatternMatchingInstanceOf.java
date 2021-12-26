package java16;

public class PatternMatchingInstanceOf {
    public static void main(String[] args) {
        Object obj = "abc";
        if (obj instanceof String s) {
          System.out.println(s.length());
        }
    }
}
