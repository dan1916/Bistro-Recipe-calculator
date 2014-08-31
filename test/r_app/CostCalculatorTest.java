/*
 * Test class for cost calculator. We already have sales tax and cost calculated
   by hand so we compare against that.
 */

package r_app;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import r_app.Interfaces.IRecipe;

/**
 *
 * @author smart
 */
public class CostCalculatorTest {
    
    public CostCalculatorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CalculateCost method, of class CostCalculator.
     */
    @Test
    public void testCalculateCost() {
        System.out.println("CalculateCost");
        IRecipe recipe = r_app.RecipesBook.makePastaFiesta();
        CostCalculator instance = new CostCalculator();
        BigDecimal expResult = new BigDecimal("8.91000000");
        BigDecimal result = instance.CalculateCost(recipe);
        assertEquals(expResult, result);
        
        expResult = new BigDecimal("0.42000000");
        result = instance.getTotalSalesTax();
        assertEquals(expResult, result);
        
        expResult = new BigDecimal("0.07000000");
        result = instance.getTotalWellnessDiscount();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of round method, of class CostCalculator.
     */
    @Test
    public void testRound() {
        System.out.println("round");
        //Test 1
        BigDecimal value = new BigDecimal("73.45104");
        BigDecimal nearestTo = new BigDecimal("0.07");
        BigDecimal expResult = new BigDecimal("73.50");
        BigDecimal result = CostCalculator.round(value, nearestTo);
        assertEquals(expResult, result);
        
        //Test 2
        value = new BigDecimal("8.931");
        nearestTo = new BigDecimal("0.05");
        expResult = new BigDecimal("8.95");
        result = CostCalculator.round(value, nearestTo);
        assertEquals(expResult, result);
    }
    
}
