package java15;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HiddenClass {
    static final byte[] classDefinition = { (byte) 0xca, (byte) 0xfe, (byte) 0xba, (byte) 0xbe, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x3d, (byte) 0x00, (byte) 0x1f, (byte) 0x07, (byte) 0x00, (byte) 0x02, (byte) 0x01, (byte) 0x00, (byte) 0x0b, (byte) 0x6a, (byte) 0x61, (byte) 0x76, (byte) 0x61, (byte) 0x31, (byte) 0x35, (byte) 0x2f, (byte) 0x54, (byte) 0x65, (byte) 0x73, (byte) 0x74, (byte) 0x07, (byte) 0x00, (byte) 0x04, (byte) 0x01, (byte) 0x00, (byte) 0x10, (byte) 0x6a, (byte) 0x61, (byte) 0x76, (byte) 0x61, (byte) 0x2f, (byte) 0x6c, (byte) 0x61, (byte) 0x6e, (byte) 0x67, (byte) 0x2f, (byte) 0x4f, (byte) 0x62, (byte) 0x6a, (byte) 0x65, (byte) 0x63, (byte) 0x74, (byte) 0x01, (byte) 0x00, (byte) 0x06, (byte) 0x3c, (byte) 0x69, (byte) 0x6e, (byte) 0x69, (byte) 0x74, (byte) 0x3e, (byte) 0x01, (byte) 0x00, (byte) 0x03, (byte) 0x28, (byte) 0x29, (byte) 0x56, (byte) 0x01, (byte) 0x00, (byte) 0x04, (byte) 0x43, (byte) 0x6f, (byte) 0x64, (byte) 0x65, (byte) 0x0a, (byte) 0x00, (byte) 0x03, (byte) 0x00, (byte) 0x09, (byte) 0x0c, (byte) 0x00, (byte) 0x05, (byte) 0x00, (byte) 0x06, (byte) 0x01, (byte) 0x00, (byte) 0x0f, (byte) 0x4c, (byte) 0x69, (byte) 0x6e, (byte) 0x65, (byte) 0x4e, (byte) 0x75, (byte) 0x6d, (byte) 0x62, (byte) 0x65, (byte) 0x72, (byte) 0x54, (byte) 0x61, (byte) 0x62, (byte) 0x6c, (byte) 0x65, (byte) 0x01, (byte) 0x00, (byte) 0x12, (byte) 0x4c, (byte) 0x6f, (byte) 0x63, (byte) 0x61, (byte) 0x6c, (byte) 0x56, (byte) 0x61, (byte) 0x72, (byte) 0x69, (byte) 0x61, (byte) 0x62, (byte) 0x6c, (byte) 0x65, (byte) 0x54, (byte) 0x61, (byte) 0x62, (byte) 0x6c, (byte) 0x65, (byte) 0x01, (byte) 0x00, (byte) 0x04, (byte) 0x74, (byte) 0x68, (byte) 0x69, (byte) 0x73, (byte) 0x01, (byte) 0x00, (byte) 0x0d, (byte) 0x4c, (byte) 0x6a, (byte) 0x61, (byte) 0x76, (byte) 0x61, (byte) 0x31, (byte) 0x35, (byte) 0x2f, (byte) 0x54, (byte) 0x65, (byte) 0x73, (byte) 0x74, (byte) 0x3b, (byte) 0x01, (byte) 0x00, (byte) 0x08, (byte) 0x67, (byte) 0x72, (byte) 0x65, (byte) 0x65, (byte) 0x74, (byte) 0x69, (byte) 0x6e, (byte) 0x67, (byte) 0x09, (byte) 0x00, (byte) 0x10, (byte) 0x00, (byte) 0x12, (byte) 0x07, (byte) 0x00, (byte) 0x11, (byte) 0x01, (byte) 0x00, (byte) 0x10, (byte) 0x6a, (byte) 0x61, (byte) 0x76, (byte) 0x61, (byte) 0x2f, (byte) 0x6c, (byte) 0x61, (byte) 0x6e, (byte) 0x67, (byte) 0x2f, (byte) 0x53, (byte) 0x79, (byte) 0x73, (byte) 0x74, (byte) 0x65, (byte) 0x6d, (byte) 0x0c, (byte) 0x00, (byte) 0x13, (byte) 0x00, (byte) 0x14, (byte) 0x01, (byte) 0x00, (byte) 0x03, (byte) 0x6f, (byte) 0x75, (byte) 0x74, (byte) 0x01, (byte) 0x00, (byte) 0x15, (byte) 0x4c, (byte) 0x6a, (byte) 0x61, (byte) 0x76, (byte) 0x61, (byte) 0x2f, (byte) 0x69, (byte) 0x6f, (byte) 0x2f, (byte) 0x50, (byte) 0x72, (byte) 0x69, (byte) 0x6e, (byte) 0x74, (byte) 0x53, (byte) 0x74, (byte) 0x72, (byte) 0x65, (byte) 0x61, (byte) 0x6d, (byte) 0x3b, (byte) 0x08, (byte) 0x00, (byte) 0x16, (byte) 0x01, (byte) 0x00, (byte) 0x16, (byte) 0x54, (byte) 0x68, (byte) 0x69, (byte) 0x73, (byte) 0x20, (byte) 0x69, (byte) 0x73, (byte) 0x20, (byte) 0x61, (byte) 0x20, (byte) 0x68, (byte) 0x69, (byte) 0x64, (byte) 0x64, (byte) 0x65, (byte) 0x6e, (byte) 0x20, (byte) 0x63, (byte) 0x6c, (byte) 0x61, (byte) 0x73, (byte) 0x73, (byte) 0x0a, (byte) 0x00, (byte) 0x18, (byte) 0x00, (byte) 0x1a, (byte) 0x07, (byte) 0x00, (byte) 0x19, (byte) 0x01, (byte) 0x00, (byte) 0x13, (byte) 0x6a, (byte) 0x61, (byte) 0x76, (byte) 0x61, (byte) 0x2f, (byte) 0x69, (byte) 0x6f, (byte) 0x2f, (byte) 0x50, (byte) 0x72, (byte) 0x69, (byte) 0x6e, (byte) 0x74, (byte) 0x53, (byte) 0x74, (byte) 0x72, (byte) 0x65, (byte) 0x61, (byte) 0x6d, (byte) 0x0c, (byte) 0x00, (byte) 0x1b, (byte) 0x00, (byte) 0x1c, (byte) 0x01, (byte) 0x00, (byte) 0x07, (byte) 0x70, (byte) 0x72, (byte) 0x69, (byte) 0x6e, (byte) 0x74, (byte) 0x6c, (byte) 0x6e, (byte) 0x01, (byte) 0x00, (byte) 0x15, (byte) 0x28, (byte) 0x4c, (byte) 0x6a, (byte) 0x61, (byte) 0x76, (byte) 0x61, (byte) 0x2f, (byte) 0x6c, (byte) 0x61, (byte) 0x6e, (byte) 0x67, (byte) 0x2f, (byte) 0x53, (byte) 0x74, (byte) 0x72, (byte) 0x69, (byte) 0x6e, (byte) 0x67, (byte) 0x3b, (byte) 0x29, (byte) 0x56, (byte) 0x01, (byte) 0x00, (byte) 0x0a, (byte) 0x53, (byte) 0x6f, (byte) 0x75, (byte) 0x72, (byte) 0x63, (byte) 0x65, (byte) 0x46, (byte) 0x69, (byte) 0x6c, (byte) 0x65, (byte) 0x01, (byte) 0x00, (byte) 0x09, (byte) 0x54, (byte) 0x65, (byte) 0x73, (byte) 0x74, (byte) 0x2e, (byte) 0x6a, (byte) 0x61, (byte) 0x76, (byte) 0x61, (byte) 0x00, (byte) 0x21, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x05, (byte) 0x00, (byte) 0x06, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x2f, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x05, (byte) 0x2a, (byte) 0xb7, (byte) 0x00, (byte) 0x08, (byte) 0xb1, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x00, (byte) 0x0a, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x06, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x03, (byte) 0x00, (byte) 0x0b, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x05, (byte) 0x00, (byte) 0x0c, (byte) 0x00, (byte) 0x0d, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x0e, (byte) 0x00, (byte) 0x06, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x07, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x37, (byte) 0x00, (byte) 0x02, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x09, (byte) 0xb2, (byte) 0x00, (byte) 0x0f, (byte) 0x12, (byte) 0x15, (byte) 0xb6, (byte) 0x00, (byte) 0x17, (byte) 0xb1, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x00, (byte) 0x0a, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0a, (byte) 0x00, (byte) 0x02, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x05, (byte) 0x00, (byte) 0x08, (byte) 0x00, (byte) 0x06, (byte) 0x00, (byte) 0x0b, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x0c, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x09, (byte) 0x00, (byte) 0x0c, (byte) 0x00, (byte) 0x0d, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01, (byte) 0x00, (byte) 0x1d, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x02, (byte) 0x00, (byte) 0x1e };

    public static void main(String[] args) {
        Lookup lookup = MethodHandles.lookup();
        try {
            lookup.defineHiddenClass(classDefinition, false);
            Class<?> clazz = lookup.findClass("java15.Test");
            Constructor<?> constuctor = clazz.getDeclaredConstructor();
            Object hiddenClassInstance = constuctor.newInstance();
            Method method = clazz.getDeclaredMethod("greeting");
            method.invoke(hiddenClassInstance);
        } catch (IllegalAccessException | ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}