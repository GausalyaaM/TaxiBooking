package com.company.taxi;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            List<Taxi> taxis=CreateTaxis.createTaxi(4);
            Scanner in=new Scanner(System.in);
            int id=1;
            while (true){
                System.out.println("1.Booking");
                System.out.println("2.Display");
                System.out.println("3.Exit");
                System.out.println("Enter your choice");
                int choice=in.nextInt();
                switch (choice){
                    case 1:
                        int customerId=id;
                        Booking booking=new Booking();
                        System.out.println("Enter Pickup point");
                        char pickupPoint=in.next().charAt(0);
                        System.out.println("Enter Drop Point");
                        char dropPoint=in.next().charAt(0);
                        System.out.println("Enter Pickup time");
                        int pickupTime=in.nextInt();
                        booking.setCustomerId(customerId);
                        booking.setPickupPoint(pickupPoint);
                        booking.setDropPoint(dropPoint);
                        booking.setPickupTime(pickupTime);
                        if(pickupPoint < 'A' || dropPoint > 'F' || pickupPoint > 'F' || dropPoint < 'A')
                        {
                            System.out.println("Valid pickup and drop are A, B, C, D, E, F. Exiting");
                            return;
                        }
                        List<Taxi> freeTaxis=CreateTaxis.getFreeTaxis(taxis,pickupTime,pickupPoint);
                        if(freeTaxis.size()==0){
                            System.out.println("No Taxi can be alloted.Exitting");
                            return;
                        }
                        Collections.sort(freeTaxis,(a, b)-> (int) (a.getTotalEarnings()-b.getTotalEarnings()));
                        TaxiBooking.makeBooking(id,pickupPoint,dropPoint,pickupTime,freeTaxis);
                        id++;
                        break;
                    case 2:
                        Print print =new Print();
                        print.printDetails(taxis);

                        //for(Taxi t:taxis){
                            //t.printTaxiDetails();
                          //  System.out.println(t.toString());
                        //}

                          //  t.printDetails();
                        //}
                        break;
                    case 3:
                        return;
                }
            }
        }
    }
