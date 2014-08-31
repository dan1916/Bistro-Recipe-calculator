/*
 * Interface representing the recipe.
 */
package r_app.Interfaces;

/**
 *
 * @author Dhaval
 */
public interface IRecipe {

    /**
     *
     */
    public void addIngredient(IIngredient value, double amount);
    public void removeIngredient(IIngredient value);
    public IIngredient[] getIngredients();
    
    public String getName();
    public void setName(String value);
    
}
