/*
 * Extends the basic ingredient class to concrete Pnatry products.
 */
package r_app.Implementations;

import java.math.BigDecimal;
import r_app.Interfaces.IIngredient;


/**
 * Extends the basic ingredient class to concrete Pnatry products.
 * @author Dhaval
 */
public class Pantry extends IngredientBase {
    
    private Pantry()
    {
        super();
    }
    
    /**
     * Returns an ounce of pasta as ingredient.
     * @return 
     */
    public static IIngredient Pasta()
    {
        IIngredient oPasta = (IIngredient) new Pantry();
        oPasta.setName("Pasta");
        oPasta.setOrganic(false);
        oPasta.setPrice(new BigDecimal("0.31"));
        oPasta.setUnit("Ounce");
        
        return oPasta;
    }
    
    /**
     * Returns a cup of organic olive oil as ingredient.
     * @return 
     */
    public static IIngredient OrganicOliveOil()
    {
        IIngredient oOil = (IIngredient) new Pantry();
        oOil.setName("Organic Olive Oil");
        oOil.setOrganic(true);
        oOil.setPrice(new BigDecimal("1.92"));
        oOil.setUnit("Cup");
        
        return oOil;
    }
    
    /**
     * Returns a cup of vinegar as indredient.
     * @return 
     */
    public static IIngredient Vinegar()
    {
        IIngredient oVinegar = (IIngredient) new Pantry();
        oVinegar.setName("Vinegar");
        oVinegar.setOrganic(false);
        oVinegar.setPrice(new BigDecimal("1.26"));
        oVinegar.setUnit("Cup");
        
        return oVinegar;
    }
    
    /**
     * Returns a tea spoon of salt as ingredient.
     * @return 
     */
    public static IIngredient Salt()
    {
        IIngredient oSalt = (IIngredient) new Pantry();
        oSalt.setName("Salt");
        oSalt.setOrganic(false);
        oSalt.setPrice(new BigDecimal("0.16"));
        oSalt.setUnit("Tea Spoon");
        
        return oSalt;
    }
    
    /**
     * Returns on tea spoon of pepper as ingredient.
     * @return 
     */
    public static IIngredient Pepper()
    {
        IIngredient oPepper = (IIngredient) new Pantry();
        oPepper.setName("Pepper");
        oPepper.setOrganic(false);
        oPepper.setPrice(new BigDecimal("0.17"));
        oPepper.setUnit("Tea Spoon");
        
        return oPepper;
    }
    
}
