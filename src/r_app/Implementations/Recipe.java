/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r_app.Implementations;

import java.util.ArrayList;
import r_app.Interfaces.IIngredient;
import r_app.Interfaces.IRecipe;


public class Recipe implements IRecipe {
    
    private final ArrayList<IIngredient> listOfIngredients;
    private String name;
    
    public Recipe()
    {
        this.listOfIngredients = new ArrayList<>();
        this.name = "";
    }
    
    public Recipe(String nameOfRecipe)
    {
        this.listOfIngredients = new ArrayList<>();
        this.name = nameOfRecipe;
    }
    
    @Override
    public void addIngredient(IIngredient value, double amount) {
       if (value!=null)
       {
          value.setAmount(amount);
          this.listOfIngredients.add(value);
       }
    }

    @Override
    public void removeIngredient(IIngredient value) {
       if (value!=null)
       {
          if(this.listOfIngredients.contains(value))
          {
              this.listOfIngredients.remove(value);
          }         
       }
    }
    
    @Override
    public IIngredient[] getIngredients()
    {
        IIngredient items[] = new IIngredient[listOfIngredients.size()];
        this.listOfIngredients.toArray(items);
        
        return items;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String value) {
        this.name = value;
    }
    
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
