package com.company.taxi;
import java.util.List;
public class TaxiBooking {
        public static void makeBooking(int customerId, char pickupPoint, char dropPoint, int pickupTime, List<Taxi> freeTaxis){
            int min=999;
            int disBwPickupAnsDrop=0;
            int earning=0;
            int nextFreeTime=0;
            char nextSpot='Z';
            Taxi bookedTaxi=null;
            String tripDetail="";
            for(Taxi t:freeTaxis){
                int disBwCusAndTaxi=Math.abs((t.currentSpot-'0')-(pickupPoint-'0'))*15;
                if(disBwCusAndTaxi<min){
                    bookedTaxi=t;
                    disBwPickupAnsDrop=Math.abs((dropPoint-'0')-(pickupPoint-'0'))*15;
                    earning=(disBwPickupAnsDrop-5)*10+100;
                    int dropTime=pickupTime+disBwPickupAnsDrop/15;
                    nextFreeTime=dropTime;
                    nextSpot=dropPoint;
                    tripDetail=customerId+"         "+customerId+"          "+pickupPoint+"        "+dropPoint+"          "+pickupTime+"          "+dropTime+"       "+earning;
                    min=disBwCusAndTaxi;
                }
            }
            bookedTaxi.setBooked(true);
            bookedTaxi.setCurrentSpot(nextSpot);
            bookedTaxi.setFreeTime(nextFreeTime);
            bookedTaxi.setTotalEarnings(bookedTaxi.getTotalEarnings()+ earning);
            bookedTaxi.setTrip(bookedTaxi.getTrip(), tripDetail);
            System.out.println("Taxi -"+bookedTaxi.getId()+" booked");

        }

    }

