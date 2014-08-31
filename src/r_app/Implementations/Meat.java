/*
 * Extends the basic ingredient class to concrete Meat products.
 */
package r_app.Implementations;

import java.math.BigDecimal;
import r_app.Interfaces.*;


/**
 * Extends the basic ingredient class to concrete Meat products.
 * @author Dhaval
 */
public class Meat extends IngredientBase
{
    private Meat()
    {
        super();
    }
    
    /**
     * Returns a chicken breast as ingredient.
     * @return 
     */
    public static IIngredient ChickenBreast()
    {
        IIngredient oChkn = (IIngredient) new Meat();
        oChkn.setName("Chicken Breast");
        oChkn.setPrice(new BigDecimal("2.19"));
        oChkn.setOrganic(false);
        oChkn.setUnit("");
        
        return oChkn;
    }
    
    /**
     * Returns one slice of bacon as ingredient.
     * @return 
     */
    public static IIngredient Bacon()
    {
        IIngredient oBacon = (IIngredient) new Meat();
        oBacon.setName("Bacon");
        oBacon.setPrice(new BigDecimal("0.24"));
        oBacon.setOrganic(false);
        oBacon.setUnit("Slice");
        
        return oBacon;
    }
    
}