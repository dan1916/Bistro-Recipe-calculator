/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r_app;

import r_app.Interfaces.IRecipe;

/**
 *
 * @author smart
 */
public class R_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IRecipe salad = RecipesBook.makeHealthyChickenBreast();
        
        CostCalculator calc = new CostCalculator();
        calc.CalculateCost(salad);
        
        System.out.println("DONE");
        
    }
    
}
