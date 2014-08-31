/*
 * This is a class which provides various factory methods to instantiate preset
 * receipes.
 */
package r_app;

import r_app.Implementations.*;
import r_app.Implementations.Recipe;
import r_app.Interfaces.IRecipe;

/**
 *
 * @author Dhaval
 */
public final class RecipesBook {
    
    private RecipesBook()
    {
        //Nothing here.
    }
    
    /**
     * Makes salad dressing recipe.
     * @return 
     */
    public static IRecipe makeSaladDressing()
    {
        Recipe saladDressing = new Recipe();
        saladDressing.addIngredient(Produce.Gralic(),1.0);
        saladDressing.addIngredient(Produce.Lemon(),1.0);
        saladDressing.addIngredient(Pantry.OrganicOliveOil(), 3/4.0);
        saladDressing.addIngredient(Pantry.Salt(),3/4.0);
        saladDressing.addIngredient(Pantry.Pepper(),1/2.0);
         
        return saladDressing;
    }
    
    /**
     * Makes chicken breast recipe.
     * @return 
     */
    public static IRecipe makeHealthyChickenBreast()
    {
        Recipe chickenBreast = new Recipe();
        chickenBreast.addIngredient(Produce.Gralic(),1.0);
        chickenBreast.addIngredient(Meat.ChickenBreast(),4.0);
        chickenBreast.addIngredient(Pantry.OrganicOliveOil(), 1/2.0);
        chickenBreast.addIngredient(Pantry.Vinegar(), 1/2.0);
                
        return chickenBreast;
        
    }
    
    /**
     * Makes pasta fiesta recipe.
     * @return 
     */
    public static IRecipe makePastaFiesta()
    {
        Recipe pastaFiesta = new Recipe();
        pastaFiesta.addIngredient(Produce.Gralic(), 1.0);
        pastaFiesta.addIngredient(Produce.Corn(), 4.0);
        pastaFiesta.addIngredient(Meat.Bacon(), 4.0);
        pastaFiesta.addIngredient(Pantry.Pasta(), 8.0);
        pastaFiesta.addIngredient(Pantry.OrganicOliveOil(), 1/3.0);
        pastaFiesta.addIngredient(Pantry.Salt(), 5/4.0);
        pastaFiesta.addIngredient(Pantry.Pepper(), 3/4.0);
         
        return pastaFiesta;
    }
}
