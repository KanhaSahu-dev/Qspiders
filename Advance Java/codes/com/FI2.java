interface I2{
    public void m1(int a,int b);
}

public class FI2 {
    public static void main(String[] args) {
        I2 obj = (int a, int b)->{
            System.out.println(a+b);
        };
        obj.m1(10,20);

        I2 obj2 = (a,b)->{
            System.out.println(a+b);
        };

        I2 obj3 = (a,b)->System.out.println(a+b);
        obj3.m1(2,1);
    }
}
