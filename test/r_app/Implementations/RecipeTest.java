/*
 * Test class to check the funcationality of the Recipe implementation..
 */

package r_app.Implementations;

import java.util.Arrays;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import r_app.Interfaces.IIngredient;

/**
 *
 * @author smart
 */
public class RecipeTest {
    
    public RecipeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addIngredient method, of class Recipe.
     */
    @Test
    public void testAddIngredient() {
        System.out.println("addIngredient");
        IIngredient value = Produce.Corn();
        double amount = 10.0;
        Recipe instance = new Recipe();
        instance.addIngredient(value, amount);
        assert(Arrays.asList(instance.getIngredients()).contains(value));
    }

    /**
     * Test of removeIngredient method, of class Recipe.
     */
    @Test
    public void testRemoveIngredient() {
        System.out.println("removeIngredient");
        IIngredient value = Produce.Corn();
        double amount = 10.0;
        Recipe instance = new Recipe();
        instance.addIngredient(value, amount);
        assert(Arrays.asList(instance.getIngredients()).contains(value));
        instance.removeIngredient(value);
        assert(!Arrays.asList(instance.getIngredients()).contains(value));
    }

    /**
     * Test of getName method, of class Recipe.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Recipe instance = new Recipe("A brand new recipe");
        String expResult = "A brand new recipe";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Recipe.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String value = "Something new";
        Recipe instance = new Recipe("A new recipe");
        instance.setName(value);
        assertEquals(instance.getName(), value);
    }
    
}
