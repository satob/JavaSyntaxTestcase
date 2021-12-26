package java15;

public class TextBlock {
    public static void main(String[] args) {
        var textBlock = """
                This
                is
                text
                block
                """;
        System.out.println(textBlock);

        System.out.println("""
                Text
                Block
                Literal
                """);

        var textBlockConcatinate = """
                This \
                is \
                text \
                block \
                concatinated
                """;
        System.out.println(textBlockConcatinate);

        System.out.println("""
                Text \
                Block \
                Literal \
                Concatinated
                """);
    }
}
