import org.example.add.Addition;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    static Logger log = Logger.getLogger("MainTest");

    private static final Addition ad = new Addition();

    @RepeatedTest(2)
    @DisplayName("Addition Test Case \uD83E\uDD74\uD83E\uDD74")
    @Timeout(5)
    void test() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        int num, expected;
        assertEquals(expected = 5, num = ad.addNum(2, 3));
        if (num == expected) {
            log.info("\u001B[42mtest passed \uD83D\uDE0E\uD83D\uDE0E");
        }
    }

    @BeforeEach
    @DisplayName("Subtract test case")
    void subTest() {
        int sub, expected;
        assertEquals(expected = 2, sub = ad.subNum(4, 2));
        if (sub == expected) {
            log.info("\u001B[42m Subtract test passed \uD83D\uDE0E\uD83D\uDE0E");
        }
    }

}
