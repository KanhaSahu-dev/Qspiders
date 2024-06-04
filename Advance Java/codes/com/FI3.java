interface square{
    public int area(int side);
}
class Child implements square {
    @Override
    public int area(int side){
        return side*side;
    }
}

public class FI3{
    public static void main(String[] args) {
        Child sq = new Child();
        System.out.println(sq.area(2));

        square o = (int s)->{
            return s*s;
        };

        square o1 = s->s*s;

        System.out.println(o1.area(2));
    }
}
