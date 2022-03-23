package com.company;

public class Bus extends Vehicle{
    private int noPassengers;
    private float ticketPrice;
Bus()
    {

    }
    Bus(int noPassengers, float ticketPrice)
    {
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public float GetCharge()
    {
        float charge = (float)25/100*ticketPrice;
        return charge;
    }

    @Override
    public float GetProfit()
    {
        float profit = noPassengers*GetCharge();
        return profit;
    }

    @Override
    public String display()
    {
        String mesaj = "Merge Bus!";
        return mesaj;
    }

    public int GetNoPassengers()
    {
        return noPassengers;
    }

    public float GetTicketPrice()
    {
        return ticketPrice;
    }

}
