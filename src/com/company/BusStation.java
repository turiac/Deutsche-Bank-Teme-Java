package com.company;

public class BusStation {

    public Vehicle[] v = {new Bus(2, 10), new Bus(5, 20), new Bus(1, 5)};
    //public Vehicle[] v = new Bus[3];
    Bus b0 = new Bus(2, 10);
    Bus b1 = new Bus(5, 20);
    Bus b2 = new Bus(1, 5);

    public void showAllVehicles()
    {
        System.out.println("\nBus 1 has: ");
        System.out.println("No.Passengers: " + b0.GetNoPassengers());
        System.out.println("Ticket Price: " + b0.GetTicketPrice());

        System.out.println("\nBus 2 has: ");
        System.out.println("No.Passengers: " + b1.GetNoPassengers());
        System.out.println("Ticket Price: " + b1.GetTicketPrice());

        System.out.println("\nBus 3 has: ");
        System.out.println("No.Passengers: " + b2.GetNoPassengers());
        System.out.println("Ticket Price: " + b2.GetTicketPrice());
    }

    public void showTotalProfit()
    {
        float sum=0;
        int i;
        for(i = 0; i < v.length; i++)
        {
            sum+=v[i].profit();
        }
        System.out.println("\nTotal Profit: " + sum);
    }
}
