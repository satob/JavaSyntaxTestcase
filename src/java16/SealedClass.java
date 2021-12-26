package java16;

public final class SealedClass extends Parent {
    public static void main(String[] args) {
        SealedClass s = new SealedClass();
        s.greetings();
    }
}

abstract sealed class Parent permits SealedClass {
    protected void greetings() {
        System.out.println("This is a sealed class");
    }
}