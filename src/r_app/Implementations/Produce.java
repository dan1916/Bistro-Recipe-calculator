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
public class Produce extends IngredientBase {
    
    private Produce()
    {
        super();
    }
    
    public static IIngredient Gralic()
    {
        IIngredient oGarlic = (IIngredient) new Produce();
        oGarlic.setName("Organic Garlic");
        oGarlic.setOrganic(true);
        oGarlic.setPrice(new BigDecimal("0.67"));
        
        return oGarlic;
    }
    
    public static IIngredient Lemon()
    {
        IIngredient oLemon = (IIngredient) new Produce();
        oLemon.setName("Lemon");
        oLemon.setOrganic(false);
        oLemon.setPrice(new BigDecimal("2.03"));
        
        return oLemon;
    }
    
     public static IIngredient Corn()
    {
        IIngredient oCorn = (IIngredient) new Produce();
        oCorn.setName("Corn");
        oCorn.setOrganic(false);
        oCorn.setPrice(new BigDecimal("0.87"));
        
        return oCorn;
    }

}
