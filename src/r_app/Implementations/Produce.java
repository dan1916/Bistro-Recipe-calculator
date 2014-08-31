/*
 * Extends the basic ingredient class to concrete Produce products.
 */
package r_app.Implementations;

import java.math.BigDecimal;
import r_app.Interfaces.IIngredient;


/**
 * Extends the basic ingredient class to concrete Produce products.
 * @author smart
 */
public class Produce extends IngredientBase {
    
    private Produce()
    {
        super();
    }
    
    /**
     * Returns a clove of organic garlic bread as ingredient.
     * @return 
     */
    public static IIngredient Gralic()
    {
        IIngredient oGarlic = (IIngredient) new Produce();
        oGarlic.setName("Organic Garlic");
        oGarlic.setOrganic(true);
        oGarlic.setPrice(new BigDecimal("0.67"));
        oGarlic.setUnit("Clove");
        
        return oGarlic;
    }
    
    /**
     * Returns a lemon as ingredient.
     * @return 
     */
    public static IIngredient Lemon()
    {
        IIngredient oLemon = (IIngredient) new Produce();
        oLemon.setName("Lemon");
        oLemon.setOrganic(false);
        oLemon.setPrice(new BigDecimal("2.03"));
        oLemon.setUnit("");
        
        return oLemon;
    }
    
    /**
     * Returns a cup of corn as ingredient.
     * @return 
     */
     public static IIngredient Corn()
    {
        IIngredient oCorn = (IIngredient) new Produce();
        oCorn.setName("Corn");
        oCorn.setOrganic(false);
        oCorn.setPrice(new BigDecimal("0.87"));
        oCorn.setUnit("Cup");
        
        return oCorn;
    }
     
}
