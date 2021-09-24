package com.company.taxi;
    import java.util.ArrayList;
    import java.util.List;
    public class Taxi {
        static  int taxiCount=0;
        private int id;
        private int driverId;
        private boolean booked;
        public char currentSpot;
        public int freeTime;
        private int totalEarnings;
        private List<String> trip=new ArrayList<>();
        //private String[] trips;
        public Taxi(){
            booked=false;
            currentSpot='A';
            freeTime= 6;
            totalEarnings=0;
            List<String> trip= new ArrayList<>();
            taxiCount+=1;
            id=taxiCount;
            driverId=taxiCount;
        }
        public static int getTaxiCount() {
            return taxiCount;
        }
        public static void setTaxiCount(int taxiCount) {
            Taxi.taxiCount = taxiCount;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getDriverId() {
            return driverId;
        }
        public void setDriverId(int driverId) {
            this.driverId = driverId;
        }
        public boolean isBooked() {
            return booked;
        }
        public void setBooked(boolean booked) {
            this.booked = booked;
        }
        public char getCurrentSpot() {
            return currentSpot;
        }
        public void setCurrentSpot(char currentSpot) {
            this.currentSpot = currentSpot;
        }
        public int getFreeTime() {
            return freeTime;
        }
        public void setFreeTime(int freeTime) {
            this.freeTime = freeTime;
        }
        public int getTotalEarnings() {
            return totalEarnings;
        }
        public void setTotalEarnings(int totalEarnings) {
            this.totalEarnings = totalEarnings;
        }
        public List<String> getTrip() {
            return trip;
        }
        public void setTrip(List<String > trip,String tripDetail) {
            this.trip.add(tripDetail);
        }
        public String toString(){
            return "Taxi - "+ this.id + " DriverId - "+ this.driverId +" Total Earnings - " + this.totalEarnings + " Current spot - " + this.currentSpot +" Free Time - " + this.freeTime;
        }
       /* public void printDetails()
        {
            System.out.println("Taxi - "+ this.id + " Total Earnings - " + this.totalEarnings);
            System.out.println("TaxiID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");

            for(int i=0;i<trip.size();i++)
            {
                System.out.println(id + "          " + trip);
            }
            System.out.println("-----------------------------------------------------");
        }
        public void printTaxiDetails()
        {
            System.out.println("Taxi - "+ this.id + " Total Earnings - " + this.totalEarnings + " Current spot - " + this.currentSpot +" Free Time - " + this.freeTime);
        }*/
    }
