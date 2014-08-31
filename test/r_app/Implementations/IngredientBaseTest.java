/*
 * Test class for the base class of ingredients.
 */

package r_app.Implementations;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author smart
 */
public class IngredientBaseTest {
    
    public IngredientBaseTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isOrganic method, of class IngredientBase.
     */
    @Test
    public void testIsOrganic() {
        System.out.println("isOrganic");
        IngredientBase instance = new IngredientBaseImpl();
        boolean expResult = false;
        boolean result = instance.isOrganic();
        assertEquals(expResult, result);
        //Now set it to true and test...
        instance.setOrganic(true);
        expResult = true;
        result = instance.isOrganic();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrganic method, of class IngredientBase.
     */
    @Test
    public void testSetOrganic() {
        System.out.println("setOrganic");
        boolean value = true;
        IngredientBase instance = new IngredientBaseImpl();
        instance.setOrganic(value);
        assertEquals(value, instance.isOrganic()); //Simple check.
    }

    /**
     * Test of getPrice method, of class IngredientBase.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        IngredientBase instance = new IngredientBaseImpl();
        BigDecimal expResult = new BigDecimal("0.13");
        instance.setPrice(new BigDecimal("0.13"));
        BigDecimal result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrice method, of class IngredientBase.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        IngredientBase instance = new IngredientBaseImpl();
        BigDecimal expResult = new BigDecimal("44.13");
        instance.setPrice(new BigDecimal("44.13"));
        BigDecimal result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmount method, of class IngredientBase.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        IngredientBase instance = new IngredientBaseImpl();
        double expResult = 10.0;
        instance.setAmount(expResult);
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAmount method, of class IngredientBase.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        IngredientBase instance = new IngredientBaseImpl();
        double expResult = 10.0;
        instance.setAmount(expResult);
        double result = instance.getAmount();
        assertEquals(expResult, result, 0.0);
    }

   
    public class IngredientBaseImpl extends IngredientBase {
    }
    
}
