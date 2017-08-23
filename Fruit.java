package com.company.Assignment1;

/**
 * Created by Gayathri on 23/08/17.
 * The basic item that is store sells is a Fruit. The Fruit class
 * supports the basic methods to instantiate a fruit and optionally
 * attribute a color to the fruit. The color attribute is not being
 * used presently.
 */
public class Fruit {
    String name;
    //Color is optional
    String color;

    /* Getter and Setter methods*/
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Fruit(String name) {
        this(name,"Unspecified");
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return this.name;
    }

    public void setColor(String colorOfFruit) {
        this.color = colorOfFruit;
    }

    public void setName(String fruitName) {
        this.name = fruitName;
    }

    public String toString(){
        return String.format("%s %s",this.name, this.color);
    }
}
