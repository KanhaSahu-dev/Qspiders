public class BookMyShow {
    private int totalSeats=50;
    public synchronized void bookSeats(int n){
        if(n>totalSeats){
            System.out.println("Seats are not available");
        }
        else{
            System.out.println("No of seats:"+totalSeats);
            totalSeats-=n;
            System.out.println("Remaining Seats : "+totalSeats);
        }
    }
    public static void main(String[] args) {
        
    }
}
