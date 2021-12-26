package java16;

public class RecordClass {
    public static void main(String[] args) {
        Record r = new Record(1, 2);
        System.out.println(r);
    }
}

record Record(int x, int y) {}
