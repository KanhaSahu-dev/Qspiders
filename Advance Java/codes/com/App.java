public class App {
    public static void main(String[] args) {
        BookMyShow bms = new BookMyShow();
        Thread manish = new Manish(bms);
        Thread debasis = new Debasis(bms);
        manish.start();
        debasis.start();
    }
}
