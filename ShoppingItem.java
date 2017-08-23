package com.company.Assignment1;

/**
 * Created by Gayathri on 23/08/17.
 * The ShoppingItem class encapsulates information about a Fruit (i,e item sold) and
 * it's corresponding price as a float. The currency is maintained as INR and has been included
 * for completeness. Not being used currently. The class supports the basic get and set methods
 */
public class ShoppingItem {

    Fruit item;
    float pricePerUnit;

    final String currency = "INR";

    public ShoppingItem(Fruit fruit,  Float price) {
        this.item = fruit;
        this.pricePerUnit = price;
    }

    public Fruit getItem() {
        return item;
    }

    public void setItem(Fruit item) {
        this.item = item;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String toString(){
        String fmtOutput = String.format("%20s%6.2f %s%n",item.getName(),
                getPricePerUnit(),currency);
        return fmtOutput;
    }
}