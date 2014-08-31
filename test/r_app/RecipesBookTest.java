/*
 * Test class for recipe book. Check whether said recipes contains required
 * ingredients or not.
 */

package r_app;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import r_app.Implementations.Pantry;
import r_app.Implementations.Produce;
import r_app.Interfaces.IIngredient;
import r_app.Interfaces.IRecipe;

/**
 *
 * @author smart
 */
public class RecipesBookTest {
    
    public RecipesBookTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of makeSaladDressing method, of class RecipesBook.
     */
    @Test
    public void testMakeSaladDressing() {
        System.out.println("makeSaladDressing");
        IRecipe result = RecipesBook.makeSaladDressing();
        assertNotNull(result); //Check for non-null
        //Now check if it has following ingredients...
        for(IIngredient item:result.getIngredients())
        {
            switch(item.getName())
            {
                case "Organic Garlic":
                case "Lemon":
                case "Organic Olive Oil":
                case "Salt":
                case "Pepper":
                    break;
                default:
                    fail("Unexpected ingredient in Salad dressing :" + item.getName());
            }
        }
    }

    /**
     * Test of makeHealthyChickenBreast method, of class RecipesBook.
     */
    @Test
    public void testMakeHealthyChickenBreast() {
        System.out.println("makeHealthyChickenBreast");
        IRecipe result = RecipesBook.makeHealthyChickenBreast();
        assertNotNull(result); //Check for non-null
        //Now check if it has following ingredients...
        for(IIngredient item:result.getIngredients())
        {
            switch(item.getName())
            {
                case "Organic Garlic":
                case "Chicken Breast":
                case "Organic Olive Oil":
                case "Vinegar":
                    break;
                default:
                    fail("Unexpected ingredient in Healty Chicken Breast :" + item.getName());
            }
        }
    }

    /**
     * Test of makePastaFiesta method, of class RecipesBook.
     */
    @Test
    public void testMakePastaFiesta() {
        System.out.println("makePastaFiesta");
        IRecipe result = RecipesBook.makePastaFiesta();
        assertNotNull(result); //Check for non-null
        //Now check if it has following ingredients...
        for(IIngredient item:result.getIngredients())
        {
            switch(item.getName())
            {
                case "Pasta":
                case "Corn":
                case "Organic Garlic":
                case "Organic Olive Oil":
                case "Bacon":
                case "Pepper":
                case "Salt":
                    break;
                default:
                    fail("Unexpected ingredient in Pasta Fiesta :" + item.getName());
            }
        }
    }
    
}
