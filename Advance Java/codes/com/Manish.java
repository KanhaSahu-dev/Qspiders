
public class Manish extends Thread{
    BookMyShow bms;
    public Manish(BookMyShow s){
        this.bms=s;
    }
    public void run(){
        bms.bookSeats(40);
    }
}
