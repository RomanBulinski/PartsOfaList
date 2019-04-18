import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {


    @Test
    public void test() {
        String[] a = {"az", "toto", "picaro", "zone", "kiwi"};
        String[][] result = {{"az", "toto picaro zone kiwi"}, {"az toto", "picaro zone kiwi"}, {"az toto picaro", "zone kiwi"}, {"az toto picaro zone", "kiwi"}};
        assertArrayEquals( result  ,Main.partlist(a));
    }





}
