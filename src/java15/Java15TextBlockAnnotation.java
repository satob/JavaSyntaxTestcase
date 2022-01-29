package java15;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Java15TextBlockAnnotation {
    @SuppressWarnings("""
            unused""")
    public void foo() {
        int bar;
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MySingleMemberAnnotation {
   String value();
}
