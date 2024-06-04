// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;

// class cls3{
//     public static void main(String[] args) {
//         File file = new File("D:\\QSPIDERS\\Advance Java\\codes\\DOREAMON");
//         try{
//             file.createNewFile();
//             FileOutputStream fos = new FileOutputStream(file);
//             String x = "hello boy";
//             byte[] b = x.getBytes();
//             fos.write(b);
//             fos.close();    
//         }catch(IOException e){

//         }
//     }
// }

// class cls3{
//     public static void main(String[] args) {
//         File file = new File("D:\\QSPIDERS\\Advance Java\\codes\\animals\\rakoon.txt");
//         try{
//             file.createNewFile();
//             String x = "Rakoon and Nobita are best friends";
//             byte[] b = x.getBytes();
//             FileOutputStream fos = new FileOutputStream(file);
//             fos.write(b);
//             FileInputStream fis = new FileInputStream("D:\\QSPIDERS\\Advance Java\\codes\\animals\\rakoon.txt");
//             int num = fis.read();
//             while(num!=-1){
//                 System.out.print((char)num);
//                 num=fis.read();
//             }
//         }
//     catch(IOException e){

//     }
//     }
// }
// class A{

// }
// class cls3 extends A{
//     public static void main(String[] args) {
//         A a = new A();
//         cls3 c =  new A();
//     }
// }