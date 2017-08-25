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
    float totalBillValue = 0.0f;

    public void addItem(ShoppingItem item, float qnty) {
        fruitCart.putIfAbsent(item,qnty);
    }

    void calculateBillValue(){
        String outputStr;
        float totalValue=0.0f;
        for(Map.Entry<ShoppingItem, Float> entry : fruitCart.entrySet() ) {
            ShoppingItem key = entry.getKey();
            Float qnty = entry.getValue();
            float rate = key.getPricePerUnit() * qnty;
            totalBillValue += rate;
        }
    }

    public void printRcpt() {
        calculateBillValue();
        System.out.format("Item Name           Qnty(Kg)     Price(INR)       SubTotal(INR)\n\n");
        for(Map.Entry<ShoppingItem, Float> entry : fruitCart.entrySet() ) {
            printSingleItemRcpt(entry.getKey());
        }
        String.format("\nTotal Amout Due (in INR): %6.2f%n",totalBillValue);

    }

    public void printSingleItemRcpt(ShoppingItem itemToPrint){
        String outputStr;
        if (fruitCart.containsKey(itemToPrint)) {
            float quantity = fruitCart.get(itemToPrint);
            float rate = itemToPrint.getPricePerUnit() * quantity;
            System.out.format("%-20s%6.2f       %8.2f           %8.2f %n", itemToPrint.getItem().getName(), quantity,
                    itemToPrint.getPricePerUnit(),rate);

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
