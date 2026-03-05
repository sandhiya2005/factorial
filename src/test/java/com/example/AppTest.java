

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testFactorial() {
        Factorial f = new Factorial();
       
        assertEquals(120, f.calculate(5)); 
    }
}
