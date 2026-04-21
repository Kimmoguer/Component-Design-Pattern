# Composite Design Pattern Lab SW

## Problem Statement
A local restaurant is modernizing its Point-of-Sale (POS) system and needs a backend application to manage its dynamic digital menu. Unlike a simple flat list, this menu is hierarchical.


The menu must support standard individual items (e.g., a "Classic Burger" for ₱250.00). Crucially, it must also support **Menu Categories** that bundle items together. These categories can be straightforward sections (like "Appetizers"), or complex **Combos/Value Meals.**


A "Value Meal Combo," for example, is itself a single menu entry that has a total price, but it contains a Burger, Fries, and a Soda. The structure can be nested arbitrarily deep (e.g., a "Family Bundle" category that contains several "Value Meal Combo" composites).


Your task is to design and implement this system using the **Composite Design Pattern**. Both individual items and nested categories must share a common interface, allowing the POS system to calculate the price of any entry (whether a single soda or a massive family bundle) using the exact same method call.

## Implementation Guide (UML Diagram)
Use the following UML Class Diagram as your blueprint for implementation. Note how `MenuCategory` exhibits the key characteristics of the Composite pattern: it implements the common interface (`MenuComponent`) but also maintains a list of components that implement that same interface.
![UML Class Diagram Composite Design Pattern](images/UMLCD_CompositePattern.png)

## Requirements & Steps
#### Step A: The Component Interface
Create the `MenuComponent` interface:
- `double getPrice()`: Returns the price in Pesos.
- `void print()`: Displays the details.
#### Step B: The Leaf (Individual Item)
Implement `MenuItem`:
**Attributes**: `String name`, `double price`.
- `getPrice()`: Returns the stored price.
- `print()`: Displays as " - [Name]: ₱[Price]".
#### Step C: The Composite (Category/Combo)
Implement `MenuCategory`:
- **Attribute**: `List<MenuComponent> menuComponents`.
- **Logic**: `getPrice()` must iterate through all children and sum their prices.
- **Logic:** `print()` must print its category name and then call `print()` on all children.
#### Step D: Client Application (RestoApp)
1. **Leaves:** Create "Classic Burger" (₱250.00), "Large Fries" (₱85.00), and "Root Beer" (₱60.00).
2. **Sub-Composite:** Create a "Barkada Solo Meal" and add the burger, fries, and soda.
3. **Leaf:** Create a "Vanilla Sundae" (₱45.00).
**Top-Composite:** Create "Main Menu," add the "Barkada Solo Meal" and the "Vanilla Sundae."
4. **Test:** Call `print()` and `getPrice()` on the Main Menu.

## Expected Output
When run, your client application should produce output similar to:
