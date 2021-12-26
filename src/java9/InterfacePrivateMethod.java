package java9;

public class InterfacePrivateMethod implements TestInterface {
    public static void main(String[] args) {
        InterfacePrivateMethod c = new InterfacePrivateMethod();
        c.method1();
    }
}

interface TestInterface {
    public default void method1() {
        method2();
    }

    private void method2() {
        System.out.println("method2");
    }
}
