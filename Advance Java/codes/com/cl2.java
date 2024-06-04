import java.io.File;
import java.io.IOException;

public class cl2{
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\QSPIDERS\\Advance Java\\codes\\animals");
        System.out.print(f.mkdir());

        String x = "D:\\QSPIDERS\\Advance Java\\codes\\animals";

        for(int i = 400;i>=0;i--){
            f=new File(x+i);
            f.delete();
        }
    }
}