class StudentPro {
    String name;
    double grade;
    StudentPro(String n, double g){
        name = n;
        grade = g;
    }
}
public class Constructor {
    public static void main (String [] args) {
        StudentPro s1 = new StudentPro("ali", 90);
        StudentPro s2 = new StudentPro("sam", 50);
        System.out.println("the first student is " + s1.name );
    }
}
