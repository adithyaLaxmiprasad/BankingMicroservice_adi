package com.adi;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    /**
     * Test that our app class exists and can be instantiated
     */
    @Test
    public void testAppExists() {
        App app = new App();
        assertNotNull(app);
    }
    
    /**
     * Simple test to verify JUnit is working
     */
    @Test 
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
