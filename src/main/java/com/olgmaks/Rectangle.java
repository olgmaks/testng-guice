package com.olgmaks;

/**
 * Created by OLEG on 31.08.2016.
 */
public class Rectangle implements IFigure {


    private int a;
    private int b;

    public Rectangle() {
        this.a = 26;
        this.b = 37;
    }

    @Message("Hellow world message")
    public void messagedVoid () {
        System.out.println("syso");
    }

    @Override
    @Message("fdsfsdfdsfsd")
    public int area() {
        return 2*a*b;
    }
}
