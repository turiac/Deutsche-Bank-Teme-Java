package com.company;

public class Main {
    public static void main(String[] args) {
        Taxi t = new Taxi(2, 5);
        Bus b = new Bus(1, 2);

        System.out.println(t.GetCharge());
        System.out.println(t.GetProfit());
        System.out.println(t.display());
        System.out.println();

        System.out.println(b.GetCharge());
        System.out.println(b.GetProfit());
        System.out.println(b.display());

        BusStation bs = new BusStation();

        bs.showAllVehicles();
        bs.showTotalProfit();
    }
}
