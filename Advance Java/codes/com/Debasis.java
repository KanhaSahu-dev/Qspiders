
 class Debasis extends Thread{
    BookMyShow bms;
    public Debasis(BookMyShow s){
        this.bms=s;
    }
    public void run(){
        bms.bookSeats(40);
    }
}
