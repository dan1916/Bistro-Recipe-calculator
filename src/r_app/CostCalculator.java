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
                //Calculate price as per number of units and add...
                BigDecimal price = ingredient.getPrice().multiply( new BigDecimal(ingredient.getAmount(),MathContext.DECIMAL32));
                totalPriceWithoutProduce = totalPriceWithoutProduce.add(price);
                logger.log(Level.INFO, "Added :" + ingredient.getName() + " " + ingredient.getAmount() + " * $" + ingredient.getPrice().toString() + " = $" + price.toString());
            }
            else
            {
                //Calculate price as per number of units and add...
                BigDecimal price = ingredient.getPrice().multiply(new BigDecimal(ingredient.getAmount(),MathContext.DECIMAL32));
                totalPriceOfProduce = totalPriceOfProduce.add(price);
                logger.log(Level.INFO, "Added :" + ingredient.getName() + " " + ingredient.getAmount() + " * $" + ingredient.getPrice().toString() + " = $" + price.toString());
            }
                
            //Check for organic items...
            if (ingredient.isOrganic())
                organicOnlyPrice = organicOnlyPrice.add(ingredient.getPrice().multiply(new BigDecimal(ingredient.getAmount(),MathContext.DECIMAL32)));
        }
        
        //Now calculate sales tax with rounding to nearest 7 cents i.e. 0.07
        totalSalesTax = totalPriceWithoutProduce.multiply(new BigDecimal(salesTax).divide(new BigDecimal(100)));
        totalSalesTax =  CostCalculator.round(totalSalesTax, new BigDecimal(0.07,MathContext.DECIMAL32));
        logger.log(Level.INFO,"\n\nTotal Sales Tax you pay is $" + String.format("%.2f",totalSalesTax));
        
        //Calculate wellness discount.
        totalOrganicDiscount = organicOnlyPrice.multiply(new BigDecimal(wellnessDiscount).divide(new BigDecimal(100)));
        totalOrganicDiscount =  CostCalculator.round(totalOrganicDiscount, new BigDecimal(0.01,MathContext.DECIMAL32));
        logger.log(Level.INFO,"\n\nTotal Organic Discount you get is $" + String.format("%.2f",totalOrganicDiscount));
        
        //Finally find total cost.
        totalCost = totalPriceOfProduce.add(totalPriceWithoutProduce).add(totalSalesTax).subtract(totalOrganicDiscount);
        totalCost = CostCalculator.round(totalCost,new BigDecimal(0.01,MathContext.DECIMAL32));
        logger.log(Level.INFO,"\nTotal Cost is $" + String.format("%.2f",totalCost));

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
