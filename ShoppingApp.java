package com.company.Assignment1;

/* Using the Map, Scanner and Interfaces packages*/
import java.util.*;
/**
 * Created by Gayathri on 23/08/17.
 * Main thread to run the simple Shopping cart application which currently allows to
 * shop only Fruits
 */
public class ShoppingApp {

    ShoppingCart myCart = new ShoppingCart();

    // Method to add items to the shoppingCart
    public void populateShoppingCart() {

        myCart.addItem(new ShoppingItem(new Fruit("Apple"),20.00f),5f);
        myCart.addItem(new ShoppingItem(new Fruit("Orange"),30.00f),3f);
        myCart.addItem(new ShoppingItem(new Fruit("Grapes"),200.00f),10f);
        myCart.addItem(new ShoppingItem(new Fruit("StrawBerry"),300.00f),0.275f);

    }

    //Invoke the printRcpt method on the Shoppingcart to print the itemisedBill and total
    public void printBill() {
        myCart.printRcpt();
    }

    public void calculateBill(){
        myCart.calculateBillValue();
    }

    public static void main(String[] args) {

        ShoppingApp myApp = new ShoppingApp();
        myApp.populateShoppingCart();
        myApp.calculateBill();
        myApp.printBill();

    }

}
