package com.company.taxi;

import java.util.ArrayList;
import java.util.List;

    public class CreateTaxis {
        public static List<Taxi> createTaxi(int number) {
            List<Taxi> taxis = new ArrayList<Taxi>();
            for (int i = 1; i <= number; i++) {
                Taxi t = new Taxi();
                taxis.add(t);
            }
            return taxis;
        }
        public static List<Taxi> getFreeTaxis(List<Taxi> taxis, int pickupTime, char pickupPoint){
            List<Taxi> freeTaxis=new ArrayList<Taxi>();
            for(Taxi t:taxis){
                if(t.freeTime<=pickupTime&&(Math.abs((t.currentSpot)-'0')-(pickupPoint-'0'))<=pickupTime-t.freeTime){
                    freeTaxis.add(t);
                }
            }
            return freeTaxis;
        }
    }

