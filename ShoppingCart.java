package com.company.Assignment1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gayathri on 23/08/17.
 * ShoppingCart class maintains the mapping of the Item to its quantity using a HashMap Collection
 * The key is an instance of the ShoppingItem and the value is the purchased quantity in Kg
 * The class allow to add and remove items from a cart one at a time and prints the itemised and total
 * bill for the items in the cart
 */
public class ShoppingCart {

    Map<ShoppingItem, Float> fruitCart = new HashMap<>();

    public void addItem(ShoppingItem item, float qnty) {
        fruitCart.putIfAbsent(item,qnty);
    }

    public void printRcpt(){
        String outputStr;
        float totalValue=0.0f;
        System.out.format("Item Name           Qnty(Kg)     Price(INR)       SubTotal(INR)\n\n");
        for(Map.Entry<ShoppingItem, Float> entry : fruitCart.entrySet() ) {
            ShoppingItem key = entry.getKey();
            Float qnty = entry.getValue();
            float rate = key.getPricePerUnit() * qnty;
            totalValue += rate;
            outputStr = String.format("%-20s%6.2f       %8.2f           %8.2f %n", key.getItem().getName(), qnty, key.getPricePerUnit(), rate);
            System.out.print(outputStr);
        }
        System.out.format("\nTotal Amout Due (in INR): %6.2f%n",totalValue);
    }

    public void singleItemRcpt(ShoppingItem itemToPrint){
        String outputStr;
        if (fruitCart.containsKey(itemToPrint)) {

            Float quantity = fruitCart.get(itemToPrint);
            float rate = itemToPrint.getPricePerUnit() * quantity;
            outputStr = String.format("%20s%6.2f Kg INR%6.2f %n", itemToPrint.getItem().toString(), quantity, rate);
            System.out.print(outputStr);

        }
    }
    public void removeItem(ShoppingItem itemToRemove) {
            if (fruitCart.containsKey(itemToRemove)) {
                fruitCart.remove(itemToRemove);
            } else {
                System.out.println("Item is not present in the shopping cart");
            }
    }

}
