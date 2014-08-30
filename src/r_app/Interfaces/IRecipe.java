/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r_app.Interfaces;

/**
 *
 * @author smart
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
