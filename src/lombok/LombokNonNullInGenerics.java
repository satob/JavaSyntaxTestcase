package lombok;

import java.util.ArrayList;
import java.util.List;

public class LombokNonNullInGenerics {
    @Getter private final List<@NonNull String> testValue = new ArrayList<String>();
}
