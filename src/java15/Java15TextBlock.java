package java15;

public class Java15TextBlock {
    public void textBlock() {

        var textBlock = """
                text
                block""";
        System.out.println(textBlock);

        System.out.println("""
                text
                block
                """);

        var textBlockConcatinate = """
                text \
                block \
                concatinated""";
        System.out.println(textBlockConcatinate);

        System.out.println("""
                text \
                block \
                concatinated
                """);

        System.out.println("""
                contains \""" \
                in the value
                """);
    }
}
