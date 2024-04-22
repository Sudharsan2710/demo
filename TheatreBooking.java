package com.chainsys.jfs6;
import java.util.Scanner;

	interface Ticket{
		public abstract String movie(String t);
		abstract int numberOfTickets(int a);
	}
public class TheatreBooking implements Ticket {
	
	public String movie(String t) {
		System.out.println("Enter the movie name");
		
		return t;
	}
	public int numberOfTickets(int a) {
		System.out.println("Enter how many tickets need: ");
		
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ticket obj = new TheatreBooking();
		System.out.println(obj.movie(sc.next()));
		
		System.out.println(obj.numberOfTickets(sc.nextInt()));
		
	}
}
