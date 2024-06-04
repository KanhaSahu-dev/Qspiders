public class cls6 {
    public static void main(String[] args) {
        Student st = new Student();
        st.name="suhas";
        System.out.println(st.name);
        Student s2 = m1(st);
        System.out.println(s2.name);
        System.out.println(st.name);
    }
    private static Student m1(Student s){
        s.name="dinga";
        return new Student();
    }

}

class Student{
    String name;
    int age;
    long mobile;
}