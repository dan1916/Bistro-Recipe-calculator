/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r_app.Interfaces;

import java.math.BigDecimal;

/**
 *
 * @author smart
 */
public interface IIngredient {
    
    public boolean isOrganic();
    public void setOrganic(boolean value);
    
    public BigDecimal getPrice();
    public void setPrice(BigDecimal value);
    
    public double getAmount();
    public void setAmount(double amount);
    
    public String getName();
    public void setName(String value);
    
    public String getUnit();
    public void setUnit(String value);
}
