/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r_app.Implementations;

import java.math.BigDecimal;
import r_app.Interfaces.IIngredient;


/**
 *
 * @author smart
 */
public class Pantry extends IngredientBase {
    
    private Pantry()
    {
        super();
    }
    
    public static IIngredient Pasta()
    {
        IIngredient oPasta = (IIngredient) new Pantry();
        oPasta.setName("Pasta");
        oPasta.setOrganic(false);
        oPasta.setPrice(new BigDecimal("0.31"));
        
        return oPasta;
    }
    
    public static IIngredient OrganicOliveOil()
    {
        IIngredient oOil = (IIngredient) new Pantry();
        oOil.setName("Organic Olive Oil");
        oOil.setOrganic(true);
        oOil.setPrice(new BigDecimal("1.92"));
        
        return oOil;
    }
    
    public static IIngredient Vinegar()
    {
        IIngredient oVinegar = (IIngredient) new Pantry();
        oVinegar.setName("Vinegar");
        oVinegar.setOrganic(false);
        oVinegar.setPrice(new BigDecimal("1.26"));
        
        return oVinegar;
    }
    
    public static IIngredient Salt()
    {
        IIngredient oSalt = (IIngredient) new Pantry();
        oSalt.setName("Salt");
        oSalt.setOrganic(false);
        oSalt.setPrice(new BigDecimal("0.16"));
        
        return oSalt;
    }
    
    public static IIngredient Pepper()
    {
        IIngredient oPepper = (IIngredient) new Pantry();
        oPepper.setName("Pepper");
        oPepper.setOrganic(false);
        oPepper.setPrice(new BigDecimal("0.17"));
        
        return oPepper;
    }
    
}
