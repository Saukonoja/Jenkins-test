package testproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    
    //Testataan palauttaaako nollalla kertominen aina nollan
    @Test
        public void multiplicationOfZeroIntegersShouldReturnZero() {
                Calculate tester = new Calculate();

                // assert statements
                assertEquals("10 x 0 must be 0", 0, tester.multiplyTwoIntegers(10, 0));
                assertEquals("0 x 10 must be 0", 0, tester.multiplyTwoIntegers(0, 10));
                assertEquals("0 x 0 must be 0", 0, tester.multiplyTwoIntegers(0, 0));
        }
    //Testataan palauttako nollan lisääminen saman luvun kuin toinen syötetty    
    @Test
        public void additionOfZeroIntegersShouldReturnSame() {
                Calculate tester = new Calculate();

                // assert statements
                assertEquals("10 + 0 must be 10", 10, tester.additionTwoIntegers(10, 0));
                assertEquals("0 + 10 must be 10", 10, tester.additionTwoIntegers(0, 10));
                assertEquals("0 + 0 must be 0", 0, tester.additionTwoIntegers(0, 0));
        }
    
}
