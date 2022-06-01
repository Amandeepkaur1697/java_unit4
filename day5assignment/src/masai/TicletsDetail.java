package masai;
import java.util.Scanner;

public class TicletsDetail {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter No Of Bookings");
		int bookings = scan.nextInt();
		
		System.out.println("Available Tickets");
		int availableTickets = scan.nextInt();
		
		Tickets t2 = new Tickets(availableTickets);
		
		for(int i=1;i<=bookings;i++) {
		   System.out.println("Enter Ticket Id");
		   int id = scan.nextInt();
		   
		   System.out.println("Enter Price");
		   int price = scan.nextInt();
		   
		   System.out.println("Enter No Of Tickets");
		   int noOfTickets=scan.nextInt();
		   
		   Tickets t1 = new Tickets(id,price,noOfTickets);
		   t1.TotalPrice(noOfTickets);
           t1.setAvailableTickets();
		   t1.showData();
		   
		}
		

	}

}
