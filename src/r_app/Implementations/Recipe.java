/*
 * Implements the IRecipe interface.
 */
package r_app.Implementations;

import java.util.ArrayList;
import r_app.Interfaces.IIngredient;
import r_app.Interfaces.IRecipe;


/**
 * Provides concrete implementation of IRecipe interface.
 * @author Dhaval
 */
public class Recipe implements IRecipe {
    
    private final ArrayList<IIngredient> listOfIngredients;
    private String name;
    
    /**
     * Initializes a blank recipe.
     */
    public Recipe()
    {
        this.listOfIngredients = new ArrayList<>();
        this.name = "";
    }
    
    /**
     * Initializes a recipe by its name.
     * @param nameOfRecipe 
     */
    public Recipe(String nameOfRecipe)
    {
        this.listOfIngredients = new ArrayList<>();
        this.name = nameOfRecipe;
    }
    
    /**
     * Adds a ingredient to the recipe.
     * @param value The ingredient you want to add.
     * @param amount How much you want to add it.
     */
    public final void addIngredient(IIngredient value, double amount) {
       if (value!=null)
       {
          value.setAmount(amount);
          this.listOfIngredients.add(value);
       }
    }

    /**
     * Removes an ingredient from the recipe.
     * @param value Which ingredient you want to remove.
     */
    public final void removeIngredient(IIngredient value) {
       if (value!=null)
       {
          if(this.listOfIngredients.contains(value))
          {
              this.listOfIngredients.remove(value);
          }         
       }
    }
    
    /**
     * Gets all ingredients in an array.
     * @return 
     */
    public IIngredient[] getIngredients()
    {
        IIngredient items[] = new IIngredient[listOfIngredients.size()];
        this.listOfIngredients.toArray(items);
        
        return items;
    }

    /**
     * Gets the name of this recipe.
     * @return 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of this recipe.
     * @param value 
     */
    public void setName(String value) {
        this.name = value;
    }
    
    /**
     * Returns a string representation including all ingredients of this recipe.
     * @return 
     */
    public String toString()
    {
        //Printout each ingredients:
        String op = "Ingredients :\n";
        for(IIngredient item:this.listOfIngredients)
        {
            op += item.toString() + "\n";
        }
        return op;
    }
    
}
