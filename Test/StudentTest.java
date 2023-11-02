import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    @DisplayName("Timeout")
    @



    @DisplayName("Our Test")
    @RepeatedTest(10)
    void test() {

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        assertEquals(45, sum);
        assertInstanceOf(Integer.class, sum);




        // assertTrue(sum instanceof Integer);      // Funkar ej
        // System.out.println(sum == Integer.class);    // Funkar ej

    }

}
