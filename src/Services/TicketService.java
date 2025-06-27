package Services;

import Model.Ticket;
import Model.User;

import java.util.List;
import java.util.Scanner;

public class TicketService {
    public void viewAllTicket(List<Ticket> tickets, User user, Scanner sc){
        if(tickets.isEmpty()){
            System.out.println("No tickets have been booked");
        }
        System.out.println("List of tickets:");
        for(Ticket ticket : tickets){
            System.out.println("Ticket ID:" +ticket.getTicket_id());
        }
    }
    public  void viewDetailTicket(List<Ticket> tickets,User user, Scanner sc){
        System.out.println("Enter your ticket ID to view detail:");
        int ticket_id = sc.nextInt();
        Ticket selectedTicket = tickets.get(ticket_id);
        if (selectedTicket!= null){
            System.out.println("    Ticket Details ");
            System.out.println("Ticket ID: " + selectedTicket.getTicket_id());
            System.out.println("User: " + selectedTicket.getUser().getName());
            System.out.println("Movie: " + selectedTicket.getMovie().getMovie_name());
            System.out.println("Time: " + selectedTicket.getTime().getTime());
            System.out.println("Chair: " + selectedTicket.getChair().getChair_id());
        }
    }
}
