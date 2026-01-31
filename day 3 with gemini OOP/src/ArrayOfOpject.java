class StudentAry {
    String name ;
    double grade ;
    //constructor
    StudentAry (String n, double g) {
        name = n;
        grade = g;
    }
    // print info
    void printInfo () {
        System.out.println("_ student name " + name);
        System.out.println("_ student grade : " + grade);
        System.out.println("--------------------------");
    }
}
public class ArrayOfOpject {
    public static void main (String [] args) {
        StudentAry[] allStudents = new StudentAry[3];
        allStudents[0] = new StudentAry("Ali", 44);
        allStudents[1] = new StudentAry("Sami", 99);
        allStudents[2] = new StudentAry("Zain", 100);
        for ( int i = 0 ; i < allStudents.length ; i++){
            allStudents[i].printInfo();
        }
    }
}
