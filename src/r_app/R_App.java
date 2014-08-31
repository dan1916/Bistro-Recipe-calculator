/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import r_app.Implementations.*;
import r_app.Interfaces.IRecipe;

/**
 *
 * @author smart
 */
public class R_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        //Print the welcome message...
        System.out.println("-------------------------------------------------");
        System.out.println("\tWelcome to Dan's Hottest New Bistro");
        System.out.println("\t\t Gourmet Organic Food");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Select ingredients and make your own recipe !");
        System.out.println("Organic ingredients get you 5% dicount ! :-)");
        System.out.println("");
        
        //Print out possible ingredients...
        System.out.println("Ingredients :\n");
        R_App.printProduceItems();
        R_App.printMeatItems();
        R_App.printPantryItems();
       
        //Print out options...
        System.out.println("\nRecipies :");
        System.out.println("(1) Salad Dressing , (2) Healty Chicken Breast and (3) Pasta Fiesta");
        System.out.print("(4) Make your own, (5) Exit\n\nChoice>");
        
        //Start taking input...
        R_App.askLoop();
        
        //Good bye...
        System.out.println("\nThankyou for using our service. Good bye.\n");
        
    }
    
    private static void printProduceItems()
    {
        System.out.println("Produce :");
        System.out.println("\t" + Produce.Gralic());
        System.out.println("\t" + Produce.Lemon());
        System.out.println("\t" + Produce.Corn());
    }
    
    private static void printMeatItems()
    {
        System.out.println("\nMeat :");
        System.out.println("\t" + Meat.ChickenBreast());
        System.out.println("\t" + Meat.Bacon());
         
    }
    
    private static void printPantryItems()
    {
        System.out.println("\nPantry :");
        System.out.println("\t" + Pantry.OrganicOliveOil());
        System.out.println("\t" + Pantry.Pasta());
        System.out.println("\t" + Pantry.Pepper());
        System.out.println("\t" + Pantry.Salt());
        System.out.println("\t" + Pantry.Vinegar());
    }
    
    private static void askLoop() throws IOException
    {
        boolean askLoop = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(askLoop)
        {
            String s = br.readLine();
            IRecipe currentRecipe = null;
            
            switch(s)
            {
                case "1":
                    //Print salad dressing...
                    System.out.println("\n Ok here's your Salad Dressing :");
                    currentRecipe = RecipesBook.makeSaladDressing();
                    System.out.println(currentRecipe);
                    break;
                    
                case "2":
                    System.out.println("\n Ok here's your Chicken Breast :");
                    currentRecipe = RecipesBook.makeHealthyChickenBreast();
                    System.out.println(currentRecipe);
                    break;
                    
                case "3":
                    System.out.println("\n Ok here's your Pasta Fiesta :");
                    currentRecipe = RecipesBook.makePastaFiesta();
                    System.out.println(currentRecipe);
                    break;
                    
                case "4":
                    System.out.println("\n Ok now select your ingredients:");
                    currentRecipe = R_App.makeCustomRecipe();
                    System.out.println("\nSo here's what you have made:");
                    System.out.println(currentRecipe);
                    break;
                    
                case "5":
                    askLoop = false;
                    break;
                    
                default:
                    System.out.println("Invalid option.");
                    break;
            }
            
            //Now calculate and show pricing to user...
            if (askLoop)
            {
               CostCalculator calc = new CostCalculator();
               calc.CalculateCost(currentRecipe);       
            }
             
        }
    }
    
    private static IRecipe makeCustomRecipe() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean askLoop = true;
        IRecipe customRecipe = new Recipe();
        
        System.out.println("What do you want to add from Produce ?");
        R_App.printProduceItems();
        System.out.println("Enter an item number. Type done when finished.");
        String amount = null;
        while(askLoop)
        {
            System.out.print("Choice>");
        
            switch(br.readLine())
            {
                case "1":
                    System.out.print("How much>");
                    amount = br.readLine();
                    try
                    {
                        customRecipe.addIngredient(Produce.Gralic(), Double.parseDouble(amount));
                        System.out.println("added.");
                    }
                    catch (Exception e)
                    {
                        System.out.print("Enter numeric values only\n");     
                    }        
                    break;

                case "2":
                    System.out.print("How much>");
                    amount = br.readLine();
                    try
                    {
                        customRecipe.addIngredient(Produce.Lemon(), Double.parseDouble(amount));
                        System.out.println("Added.");
                    }
                    catch (Exception e)
                    {
                        System.out.print("Enter numeric values only\n");     
                    }        
                    break;
                    
                case "3":
                    System.out.print("How much>");
                    amount = br.readLine();
                    try
                    {
                        customRecipe.addIngredient(Produce.Corn(), Double.parseDouble(amount));
                        System.out.println("Added.");
                    }
                    catch (Exception e)
                    {
                        System.out.print("Enter numeric values only\n");     
                    }        
                    
                    break;

                case "done":
                    askLoop = false;
                    System.out.println("Done selecting items from produce.");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
        
        askLoop = true;
        System.out.println("\n\nWhat do you want to add from Meat ?");
        R_App.printMeatItems();
        System.out.println("Enter an item number. Type done when finished.");
        while(askLoop)
        {
            System.out.print("Choice>");
        
            switch(br.readLine())
            {
                case "1":
                    System.out.print("How much>");
                    amount = br.readLine();
                    try
                    {
                        customRecipe.addIngredient(Meat.ChickenBreast(), Double.parseDouble(amount));
                        System.out.println("Added.");
                    }
                    catch (Exception e)
                    {
                        System.out.print("Enter numeric values only\n");     
                    }        
                    break;

                case "2":
                    System.out.print("How much>");
                    amount = br.readLine();
                    try
                    {
                        customRecipe.addIngredient(Meat.Bacon(), Double.parseDouble(amount));
                        System.out.println("Added.");
                    }
                    catch (Exception e)
                    {
                        System.out.print("Enter numeric values only\n");     
                    }        
                    break;
                    
                case "done":
                    askLoop = false;
                    System.out.println("Done selecting items from Meat.");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
        
        askLoop = true;
        System.out.println("\n\nWhat do you want to add from Pantry ?");
        R_App.printPantryItems();
        System.out.println("Enter an item number. Type done when finished.");
        while(askLoop)
        {
            System.out.print("Choice>");
        
            switch(br.readLine())
            {
                case "1":
                    System.out.print("How much>");
                    amount = br.readLine();
                    try
                    {
                        customRecipe.addIngredient(Pantry.OrganicOliveOil(), Double.parseDouble(amount));
                        System.out.println("Added.");
                    }
                    catch (Exception e)
                    {
                        System.out.print("Enter numeric values only\n");     
                    }        
                    break;

                case "2":
                    System.out.print("How much>");
                    amount = br.readLine();
                    try
                    {
                        customRecipe.addIngredient(Pantry.Pasta(), Double.parseDouble(amount));
                        System.out.println("Added.");
                    }
                    catch (Exception e)
                    {
                        System.out.print("Enter numeric values only\n");     
                    }        
                    break;
                    
                case "3":
                    System.out.print("How much>");
                    amount = br.readLine();
                    try
                    {
                        customRecipe.addIngredient(Pantry.Pepper(), Double.parseDouble(amount));
                        System.out.println("Added.");
                    }
                    catch (Exception e)
                    {
                        System.out.print("Enter numeric values only\n");     
                    }        
                    break;  
                    
                case "4":
                    System.out.print("How much>");
                    amount = br.readLine();
                    try
                    {
                        customRecipe.addIngredient(Pantry.Salt(), Double.parseDouble(amount));
                        System.out.println("Added.");
                    }
                    catch (Exception e)
                    {
                        System.out.print("Enter numeric values only\n");     
                    }        
                    break;    
                    
                case "5":
                    System.out.print("How much>");
                    amount = br.readLine();
                    try
                    {
                        customRecipe.addIngredient(Pantry.Vinegar(), Double.parseDouble(amount));
                        System.out.println("Added.");
                    }
                    catch (Exception e)
                    {
                        System.out.print("Enter numeric values only\n");     
                    }        
                    break;
                    
                case "done":
                    askLoop = false;
                    System.out.println("Done selecting items from Meat.");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
        
        return customRecipe;
    }
}
