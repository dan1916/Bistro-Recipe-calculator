/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r_app.Implementations;

import java.math.BigDecimal;
import r_app.Interfaces.*;


/**
 *
 * @author smart
 */
public class Meat extends IngredientBase
{
    private Meat()
    {
        super();
    }
    
    public static IIngredient ChickenBreast()
    {
        IIngredient oChkn = (IIngredient) new Meat();
        oChkn.setName("Chicken Breast");
        oChkn.setPrice(new BigDecimal("2.19"));
        oChkn.setOrganic(false);
        oChkn.setUnit("");
        
        return oChkn;
    }
    
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