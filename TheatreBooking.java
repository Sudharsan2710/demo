package com.chainsys.jfs6;

import java.util.Scanner;

interface Ticket {
    String movie(String t);

    int numberOfTickets(int a);
    
    
}

interface ticketrate{
	
	
	
	
}

public class TheatreBooking implements Ticket {
	Scanner sc = new Scanner(System.in);

    public String movie(String t) {
        System.out.println("the movie name is ");
        
       
        return t;
    }

    public int numberOfTickets(int a) {
        System.out.println("tickets purchased : ");
    
        return a;
    }
   
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t;
        System.out.print("Enter the Movie name : ");
        while (true) {
            t = sc.next();
            if (t.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.print("Please enter a valid character: ");
            }
        }

        int a;
        int ticketrate ;
        System.out.print("Enter how many tickets need:");
        while (true) {
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                if (a > 0) {
                    break;
                } else {
                    System.out.print("Please enter a valid Amount: ");
                }
            } else {
                System.out.print("Please enter a valid integer: ");
                sc.next(); 
            }
        }
        System.out.print("Enter how much ticket price: ");
         ticketrate = sc.nextInt();
        
        double total_amount = ticketrate * a ; 
        System.out.println("total amount is " + total_amount );
        Ticket obj = new TheatreBooking();
        System.out.println(obj.movie(t));
        System.out.println(obj.numberOfTickets(a));
    }
}
