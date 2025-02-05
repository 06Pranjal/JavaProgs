package JavaProgs.SelfProgs.Multithreading.Synchronisation;

class BookTheatreSeats{
    int total_seats=10;
     synchronized void BookSeats(int seats){
        if(total_seats>=seats){
            System.out.println(seats+" Seats Booked Successfully");
            total_seats=total_seats-seats;
            System.out.println("seats left = "+total_seats);
        }
        else{
            System.out.println("seats cannot be booked");
            System.out.println("seats left "+total_seats);
        }
    }

}
public class MovieBookApp extends Thread{
    int seats;
    static BookTheatreSeats b;
    public void run(){
        b.BookSeats(seats);
    }

    public static void main(String[] args) {
        b=new BookTheatreSeats();

        MovieBookApp deepak=new MovieBookApp();
        deepak.seats=7;
        deepak.start();

        MovieBookApp amit=new MovieBookApp();
        amit.seats=6;
        amit.start();
    }
}
