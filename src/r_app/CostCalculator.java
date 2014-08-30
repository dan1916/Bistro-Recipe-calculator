/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r_app;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.logging.Level;
import java.util.logging.Logger;
import r_app.Implementations.*;
import r_app.Interfaces.*;

/**
 *
 * @author smart
 */
public final class CostCalculator {
    
    private final double salesTax ;
    private final double wellnessDiscount;
    
    public CostCalculator()
    {
        this.salesTax = 8.6;
        this.wellnessDiscount = 5.0;
    }
    
    public CostCalculator(double salesTax, double wellnessDiscount)
    {
        this.salesTax = salesTax;
        this.wellnessDiscount = wellnessDiscount;
    }
    
    public final BigDecimal CalculateCost(IRecipe recipe)
    {
        Logger logger = Logger.getLogger("R_APP");
        BigDecimal totalCost = BigDecimal.ZERO;
        BigDecimal totalPriceWithoutProduce = BigDecimal.ZERO;
        BigDecimal totalPriceOfProduce = BigDecimal.ZERO;
        BigDecimal totalSalesTax = BigDecimal.ZERO;
        BigDecimal organicOnlyPrice = BigDecimal.ZERO;
        BigDecimal totalOrganicDiscount = BigDecimal.ZERO;
        
        //First basically calcuate price...
        for(IIngredient ingredient : recipe.getIngredients()) 
        {
            if (ingredient instanceof Meat || ingredient instanceof Pantry)
            {
                //Have to apply Sales Tax...
                totalPriceWithoutProduce = totalPriceWithoutProduce.add(ingredient.getPrice().multiply( new BigDecimal(ingredient.getAmount(),MathContext.DECIMAL64)));
                logger.log(Level.INFO, "");
            }
            else
            {
                totalPriceOfProduce = totalPriceOfProduce.add(ingredient.getPrice().multiply(new BigDecimal(ingredient.getAmount(),MathContext.DECIMAL64)));
                System.out.println("Printing...");
                System.out.println(totalPriceOfProduce);
            }
                
            //Check for organic items...
            if (ingredient.isOrganic())
                organicOnlyPrice = organicOnlyPrice.add(ingredient.getPrice().multiply(new BigDecimal(ingredient.getAmount(),MathContext.DECIMAL64)));
        }
        
        //Now calculate sales tax with rounding to nearest 7 cents i.e. 0.07
        totalSalesTax = totalPriceWithoutProduce.multiply(new BigDecimal(salesTax).divide(new BigDecimal(100)));
        totalSalesTax =  CostCalculator.round(totalSalesTax, new BigDecimal(0.07));
        
        System.out.println("Total Sales Tax...");
        System.out.println(totalSalesTax);
        
        //Calculate wellness discount.
        totalOrganicDiscount = organicOnlyPrice.multiply(new BigDecimal(wellnessDiscount).divide(new BigDecimal(100)));
        totalOrganicDiscount =  CostCalculator.round(totalOrganicDiscount, new BigDecimal(0.01));
        
        System.out.println(totalOrganicDiscount);
        
        //Finally find total cost.
        totalCost = totalPriceOfProduce.add(totalPriceWithoutProduce).add(totalSalesTax).subtract(totalOrganicDiscount);
        
        System.out.println(totalCost);
        
        return totalCost;
        
    }
    
    public static BigDecimal round(BigDecimal value, BigDecimal nearestTo)
    {
        if (nearestTo.signum() == 0)
        {
            return value;
        }
	else
        {
            return (value.divide(nearestTo, 0, RoundingMode.UP)).multiply(nearestTo);
	}
    }
    
}
