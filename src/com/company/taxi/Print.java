package com.company.taxi;

import java.util.List;

public class Print {
    //Taxi tax = new Taxi();
    //List<String> trip = tax.getTrip();

    public void printDetails(List<Taxi> taxis) {
        for (Taxi t : taxis) {
            List<String> list=t.getTrip();
            System.out.println("Taxi - " + t.getId() + " Total Earnings - " + t.getTotalEarnings());
            System.out.println("TaxiID DriverID  BookingID  CustomerID    From    To    PickupTime    DropTime    Amount");

            for (int i = 0; i < list.size(); i++) {
                System.out.println(t.getId() + "         " + t.getDriverId()+"          "+ list);
            }
            System.out.println("-----------------------------------------------------");
        }
        for (Taxi t:taxis){
            List<String> list=t.getTrip();
        }
        //public void printTaxiDetails()
        //{
        //  System.out.println("Taxi - "+ tax.getId() + " Total Earnings - " + tax.getTotalEarnings() + " Current spot - " + tax.getCurrentSpot() +" Free Time - " + tax.getFreeTime());
        //}
    }
}
