package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testFactorial() {
        Factorial f = new Factorial();
        // Adjust the line below based on your actual method name/logic
        assertEquals(120, f.calculate(5)); 
    }
}
