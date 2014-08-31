/*
 * Interface representing an ingredient in the food recipe.
 */
package r_app.Interfaces;

import java.math.BigDecimal;

/**
 *
 * @author Dhaval
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
