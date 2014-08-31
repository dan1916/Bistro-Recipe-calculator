package r_app.Implementations;

/*
 * The base and abstract class providing a very basic implementation of the
 * IIngredient interface.
 */

import java.math.BigDecimal;
import r_app.Interfaces.IIngredient;

/**
 * The base and abstract class providing a very basic implementation of the
 * IIngredient interface.
 * @author Dhaval
 */
public abstract class IngredientBase implements IIngredient {
    
    String name;
    String unit;
    boolean isOrganic;
    BigDecimal price;
    double amount;
    
    public IngredientBase()
    {
        this("");
    }
    
    /**
     * Initialize ingredient by its name.
     * @param name 
     */
    IngredientBase(String name)
    {
        this.name = name;
        this.isOrganic = false;
        this.price = new BigDecimal("0.0");
        this.amount = 1;
        this.unit = "cup";
    }

    /**
     * Gets a value indicating whether the food is organic or not.
     * @return 
     */
    public boolean isOrganic() {
       return this.isOrganic;
    }

    /**
     * Sets a value indicating whether the food is organic or not.
     * @param value 
     */
    public void setOrganic(boolean value) {
       this.isOrganic = value;
    }

    /**
     * Gets a value indicating the price of ingredient.
     * @return 
     */
    public BigDecimal getPrice() {
       return this.price;
    }

    /**
     * Sets a value indicating the price of ingredient.
     * @param value 
     */
    public void setPrice(BigDecimal value) {
        if (value!=null)
            this.price = value;
    }
    
    /**
     * Gets a value indicating the amount of ingredient to be used.
     * @return 
     */
    public double getAmount()
    {
        return this.amount;
    }
    
    /**
     * Sets a value indicating the amount of ingredient to be used.
     * @param value 
     */
    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    /**
     * Gets the name of this ingredient.
     * @return 
     */
    public String getName() {
       return this.name;
    }

    /**
     * Sets the name of this ingredient.
     * @param value 
     */
    public void setName(String value) {
        this.name = value;
    }
    
    /**
     * Gets the measurement unit.
     * @return 
     */
    public String getUnit()
    {
        return this.unit;
    }
    
    /**
     * Sets the measurement unit.
     * @param value 
     */
    public void setUnit(String value)
    {
        this.unit = value;
    }
    
    /**
     * Returns string summary of this ingredient.
     * @return 
     */
    public final String toString()
    {
       return String.format("%.2f",this.getAmount()) + " " + this.getUnit() + " " +  this.getName() + "\t\t\t $" + this.getPrice();
    }
}
