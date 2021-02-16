package com.caleb;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //reference types are copied by their references(pointers)
        //primitive types are copied by their values
        Point point1 = new Point( x:1,y:2);
        Point point2 = point1;
        point2.x =2;
        System.out.println();

    }
}
