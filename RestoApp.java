public class RestoApp { 
public static void main(String[] args) { 
MenuItem burger = new MenuItem("Classic Burger", 250.00); 
MenuItem fries = new MenuItem("Large Fries", 85.00); 
MenuItem soda = new MenuItem("Root Beer", 60.00); 
MenuCategory soloMeal = new MenuCategory("Barkada Solo Meal");

soloMeal.add(burger); 
soloMeal.add(fries); 
soloMeal.add(soda); 
MenuItem sundae = new MenuItem("Vanilla Sundae", 45.00); 
MenuCategory mainMenu = new MenuCategory("Main Menu"); 
mainMenu.add(soloMeal); 
mainMenu.add(sundae); 
mainMenu.print(); 
System.out.println("\n==================================="); 
System.out.printf("Total Menu Value: ₱%.2f\n", mainMenu.getPrice()); 
} 
}