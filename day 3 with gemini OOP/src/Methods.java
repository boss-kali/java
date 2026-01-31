class StudentM {
    String name;
    double grade;
    //constructor
    StudentM(String n, double g){
        name = n;
        grade = g;
    }
    // دالة لطباعة الاسم الميثود 
    void printInfo() {
        System.out.println("- student name " + name);
        System.out.println("- student grade " + grade);
        System.out.println("------------------------");
    }
}
public class Methods {
    public static void main (String [] args){
        StudentM s1 = new StudentM("ali", 50);
        StudentM s2 = new StudentM("sami", 55);
        s1.printInfo();
        s2.printInfo();
    }
    
}
