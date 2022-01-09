package java8;

import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class Java8TypeAnnotations {
    private @AnnotationForType1 int [][] intArray1 = new @AnnotationForType1 int[2][2];
    private char @AnnotationForType1 [] @AnnotationForType1 [] charArray2 = new char @AnnotationForType1 [2] @AnnotationForType1 [2];
    private double [] @AnnotationForType1 [] doubleArray3 = new double[2][2];
    private short shortArray4 @AnnotationForType1 @AnnotationForType2 [] @AnnotationForType1 [] = new short[2][2];
    private final @AnnotationForType1 ClassTest1<@AnnotationForType1 String> c = new @AnnotationForType1 @AnnotationForType2 ClassTest1<>();

    public static void main(String args[]) {
        Java8TypeAnnotations j = new Java8TypeAnnotations();
        j.typeAnnotation();
    }

    public void typeAnnotation() {
        System.out.println(intArray1.length);
        System.out.println(charArray2.length);
        System.out.println(doubleArray3.length);
        System.out.println(shortArray4.length);
        try {
            c.foo("abc");
        } catch (@AnnotationForType1 Exception e) {
        }
    }
}

@SuppressWarnings("rawtypes")
class ClassTest1<@AnnotationForType1 T> implements @AnnotationForType1 @AnnotationForType2 InterfaceTest1, @AnnotationForType1 InterfaceTest2 {
    @Override
    public void foo(@AnnotationForType1 Object obj) throws @AnnotationForType1 Exception {
        if (obj instanceof @AnnotationForType1 String) {
            @SuppressWarnings("unchecked")
            T str = (@AnnotationForType1 T) obj;
            System.out.println(str);
        }
    }

    @Override
    public void bar(String obj) {
    }
}

interface InterfaceTest1<@AnnotationForType1 T> {
    public void foo(T obj) throws @AnnotationForType1 Exception;
}

interface InterfaceTest2 {
    public void bar(String str);
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType1 {
}

@Retention(RUNTIME) @Target({ElementType.TYPE_USE})
@interface AnnotationForType2 {
}
