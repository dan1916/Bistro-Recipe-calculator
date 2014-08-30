package r_app.Implementations;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;
import r_app.Interfaces.IIngredient;

/**
 *
 * @author smart
 */
public abstract class IngredientBase implements IIngredient {
    
    String name;
    boolean isOrganic;
    BigDecimal price;
    double amount;
    
    public IngredientBase()
    {
        this("");
    }
    
    IngredientBase(String name)
    {
        this.name = name;
        this.isOrganic = false;
        this.price = new BigDecimal("0.0");
        this.amount = 1;
    }

    @Override
    public boolean isOrganic() {
       return this.isOrganic;
    }

    @Override
    public void setOrganic(boolean value) {
       this.isOrganic = value;
    }

    @Override
    public BigDecimal getPrice() {
       return this.price;
    }

    @Override
    public void setPrice(BigDecimal value) {
        if (value!=null)
            this.price = value;
    }
    
    public double getAmount()
    {
        return this.amount;
    }
    
    public void setAmount(double amount)
    {
        this.amount = amount;
        if (this.amount ==0)
            System.out.println("ZERO ?");
    }

    @Override
    public String getName() {
       return this.name;
    }

    @Override
    public void setName(String value) {
        this.name = value;
    }
}
