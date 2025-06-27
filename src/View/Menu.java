package View;

import Model.*;
import Services.BookService;
import Services.TicketService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Chair> chairs;
    private User user;
    private List<Ticket> tickets;
    private List<Movie> movies;
    private List<Time> times;
    public void showMenu() {
        BookService bookService = new BookService();
        TicketService ticketService = new TicketService();
        Scanner sc = new Scanner(System.in);
        int action = -1;
        while (action != 0) {

            System.out.println("BOOK MOVIE TICKET");
            System.out.println("1: Book a ticket");
            System.out.println("2: View your tickets");
            System.out.println("3: View your ticket by ID");
            System.out.println("4: Exit");
            System.out.println("Select your action by number:");

            action = sc.nextInt();

            switch (action) {
                case 1 -> {
                    bookService.bookTicketService(movies, times, user, tickets);
                    waitForEnter(sc);
                }
                case 2 -> {
                    ticketService.viewAllTicket(tickets, user, sc);
                    waitForEnter(sc);
                }
                case 3 -> {
                    ticketService.viewDetailTicket(tickets, user, sc);
                    waitForEnter(sc);
                }
                case 0 -> System.out.println("Exiting app...");
                default -> {
                    System.out.println("Invalid action. Try again!");
                    waitForEnter(sc);
                }
            }
        }
    }
    public void initializedData(){
        chairs = new ArrayList<>();
        tickets = new ArrayList<>();
        movies = new ArrayList<>();
        times = new ArrayList<>();
        user = new User(1, "AnhQuoc");
        for (int i = 0; i < 4; i++) {
            chairs.add(new Chair(i,false));
        }
        User user = new User(1,"AnhQuoc");
        Movie movie0 = new Movie(0,"A", Genre.Action,120 );
        Movie movie1 = new Movie(1,"B", Genre.Comedy,100 );
        Movie movie2 = new Movie(2,"C", Genre.SCI_FI,180 );
        Movie movie3 = new Movie(3,"D", Genre.Horror,90 );
        movies.add(movie0);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        times.add(new Time("8:00", Arrays.asList(movie0,movie1,movie3)));
        times.add(new Time("12:00",Arrays.asList(movie0,movie1,movie2,movie3)));
        times.add(new Time("16:00",Arrays.asList(movie0,movie2)));
    }
    private void waitForEnter(Scanner sc) {
        System.out.println("Press Enter to return to menu...");
        sc.nextLine(); sc.nextLine();
    }
}
