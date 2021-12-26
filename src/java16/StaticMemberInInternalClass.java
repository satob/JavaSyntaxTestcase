package java16;

public class StaticMemberInInternalClass {
    public static void main(String[] args) {
        Inner.staticMethod();
    }

    class Inner {
        static final int CONST = 1;
        static void staticMethod() {
            System.out.println(CONST);
        }
    }
}
