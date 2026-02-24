import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class TravelCal_Test {

    @Test
    void testCalSpeed_Normal() {
        assertEquals(50.0, TravelCal.calSpeed(100, 2));
    }

    @Test
    void testMainMethod() {
        // Save original System.in and System.out so we can restore them after the test
        PrintStream originalOut = System.out;
        java.io.InputStream originalIn = System.in;

        try {
            // Simulate user input
            System.setIn(new ByteArrayInputStream("100\n2\n".getBytes()));

            // Capture console output
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            System.setOut(new PrintStream(output));

            // Run main
            TravelCal.main(new String[]{});

            String result = output.toString();

            // Verify output (match your exact class output/capitalization)
            assertTrue(result.contains("Give distance"), "Should prompt for distance");
            assertTrue(result.contains("Give time"), "Should prompt for time");
            assertTrue(result.contains("The speed: 50.0"), "Should print the calculated speed");
        } finally {
            // Always restore System.in/out
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
    }
}