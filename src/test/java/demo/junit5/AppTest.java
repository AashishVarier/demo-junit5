package demo.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * 
    - @BeforeAll 
	- @BeforeEach
	- @Test
	- @AfterEach 
	- @AfterAll
	- @DisplayName
	- Assertions
	- Assumptions
     */

     @BeforeAll
     static void setup() {
         System.out.println("@BeforeAll");
     }

     @Test
     @DisplayName("TEST 1")
     void testAdding ()
     {  
         Assumptions.assumeTrue(5>4);
         Assertions.assertEquals(4, App.adding(2, 2));
         
     }

     @AfterAll
     static void unsetup() {
         System.out.println("@AfterAll");
     }
}
