package java9;

import java.io.ByteArrayOutputStream;

public class TryWithResourcesWithVariable {
    public static void main(String[] args) {
        Java9TryWithResourcesWithVariable t = new Java9TryWithResourcesWithVariable();
        t.tryWithResourcesWithVariable(new ByteArrayOutputStream());
    }
}
