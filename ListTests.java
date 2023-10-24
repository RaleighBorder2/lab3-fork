import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests implements StringChecker {
    public boolean checkString(String s) {
        return s.length() > 5;
    }
    
    @Test
    public void testFilter() {
        List<String> input = new ArrayList<>(Arrays.asList("short", "longer string", "longest stringggg", ":)"));

    }
}