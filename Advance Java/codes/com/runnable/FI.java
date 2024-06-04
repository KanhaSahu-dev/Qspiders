// The power of Lambda Function

interface I1{
    void m1();
}

class child implements I1{
    @Override
    public void m1(){

        System.out.println("Hii");
    }
}

public class FI{
    public static void main(String[] args){
        I1 obj = new child();
        obj.m1();
        I1 obj2 = ()->{
            System.out.println("Hello");
        };
        obj2.m1();
    }
}