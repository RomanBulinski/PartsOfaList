import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {

    @Test
    public void test() {
        String[] a = {"az", "toto", "picaro", "zone", "kiwi"};
        String[][] result = {{"az", "toto picaro zone kiwi"}, {"az toto", "picaro zone kiwi"}, {"az toto picaro", "zone kiwi"}, {"az toto picaro zone", "kiwi"}};
        assertArrayEquals( result, Main.partlist(a));
    }


    @Test
    public void test2() {
        String[] a = {"a", "b", "c"};
        String[][] result = { {"a", "b c"}, {"a b", "c"} };
        assertArrayEquals( result, Main.partlist(a));
    }


    @Test
    public void test3() {
        String[] a = {"a", "b",};
        String[][] result = {{"a", "b"}};
        assertArrayEquals(result, Main.partlist(a));

    }


}
