package com.company;

public abstract class Vehicle{
    private String colour;
    private boolean functional;

    Vehicle()
    {

    }
    Vehicle(String colour, boolean functional)
    {
        this.colour = colour;
        this.functional = functional;
    }

    public String getColour() {
        return colour;
    }

    public boolean getFunctional() {
        return functional;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFunctional(boolean functional) {
        this.functional = functional;
    }

    public float charge()
    {
        return GetCharge();
    }

    public float profit()
    {
        return GetProfit();
    }


    public abstract float GetCharge();
    public abstract float GetProfit();
    public abstract String display();

    public void compareTo(Vehicle a, Vehicle b)
    {
        if (a.profit() > b.profit())
        {
            System.out.println("Profit A greater than Profit B");
        }
        else
        {
            System.out.println("Profit B greater than Profit A");
        }
    }
}
