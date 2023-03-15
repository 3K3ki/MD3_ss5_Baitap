package Baitap1;

import java.util.Scanner;

public class TestCricle {
    public static void main(String[] args) {
        String color = "red";
        System.out.println("color: "+color);

        double radius = 1.0;
        Cricle c = new Cricle(radius);
        c.getArea();
        System.out.println("radius:"+ c.getRadius());
    }
}
