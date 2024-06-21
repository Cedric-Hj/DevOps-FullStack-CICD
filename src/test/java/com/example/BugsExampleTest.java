import org.junit.Test;
import static org.junit.Assert.*;

public class BugsExampleTest {

    @Test
    public void testPrintMessage() {
        BugsExample example = new BugsExample();
        example.printMessage();
        // Assuming the printMessage method only prints and doesn't return anything, no assertions needed
    }

    @Test
    public void testCalculate() {
        BugsExample example = new BugsExample();
        example.calculate();
        // Assuming the calculate method only prints and doesn't return anything, no assertions needed
    }

    @Test
    public void testBugMethod1() {
        BugsExample example = new BugsExample();
        // Call to a non-existent method, demonstrating an intentional "KO" case
        // example.checkNumber(); // Uncomment to simulate a failed test
        fail("Intentional failure to demonstrate KO test");
    }

    @Test
    public void testBugMethod2() {
        BugsExample example = new BugsExample();
        // Call to a non-existent method, demonstrating an intentional "KO" case
        // example.displayNumber(); // Uncomment to simulate a failed test
        fail("Intentional failure to demonstrate KO test");
    }

    @Test
    public void testBugMethod3() {
        BugsExample example = new BugsExample();
        // Call to a non-existent method, demonstrating an intentional "KO" case
        // example.accessArray(); // Uncomment to simulate a failed test
        fail("Intentional failure to demonstrate KO test");
    }
}
