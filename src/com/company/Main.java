package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	ArrayList<String> cereals = new ArrayList<String>();//Create the ArrayList called cereals.
        cereals.add("Special K");//Add content to the ArrayList
        cereals.add("Captain Crunch");//Add content to the ArrayList
        cereals.add("Oatmeal");//Add content to the ArrayList
        System.out.println(cereals);//Display the ArrayList
        cereals.remove("Oatmeal");//Pull the Oatmeal element from the ArrayList
        System.out.println(cereals);//Verify Oatmeal is no longer in the ArrayList
        cereals.add("Lucky Charms");//Add Lucky Charms to the ArrayList
        System.out.println(cereals);//Verify the change to the ArrayList
        cereals.add("Cornflakes");//Add Corn Flakes to the ArrayList
        System.out.println(cereals);//Verify the change to the ArrayList
        if (cereals.contains("Special K")){//Check for existence of Special K in the ArrayList
            System.out.println("Special K is on the list.");//Response if result is positive.
        }else {
            System.out.println("The list doesn't contain Special K.");//Response if result is negative.
        }
    }
}
