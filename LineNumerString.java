package NewTest;

import java.util.List;

public class LineNumerString {

    public static List<String> number(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            String s = String.valueOf(i + 1) + ": " + lines.get(i);
            lines.set(i, s);
        }
        return lines;
    }
}
//number(Arrays.asList()) # => []
//number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
