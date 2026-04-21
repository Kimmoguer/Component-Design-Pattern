public class MenuItem implements MenuComponent { 
    private String name; 
    private double price; 
 
    public MenuItem(String name, double price) { 
        this.name = name; 
        this.price = price; 
    } 
 
    @Override 
    public double getPrice() { 
        return price; 
    } 
 
    @Override 
    public void print() { 
        System.out.printf("  - %s: ₱%.2f\n", name, price); 
    } 
}