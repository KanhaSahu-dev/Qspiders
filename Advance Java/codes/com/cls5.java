
class PrintNumbers extends Thread{
    public void run(){
        
            for(int i=1;i<=10;i++){
                System.out.println("2 * "+i+" = "+2*i);
            }
        
    }
}

class cls5{
    public static void main(String[] args) {
        PrintNumbers t1 = new PrintNumbers();
        t1.start();
        try{

            Thread.sleep(1000);
            for(int i=1;i<=10;i++){
                System.out.println("5 * "+i+" = "+5*i);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
