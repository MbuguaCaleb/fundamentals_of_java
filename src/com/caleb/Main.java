package com.caleb;

import java.util.Scanner;

public class Main {

    //Once Java encounters the Break it leaves the loop and
    //does not execute anything else

    //Continue statement moves the Control to the beginning of a Loop

    public static void main(String[] args) {

        String [] fruits = {"Apple", "Mango","Orange"};
        for (int i =0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        for (String fruit: fruits){
            System.out.println(fruit);
        }

    }
}