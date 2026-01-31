class Student {
    String name;
    double grade;
}
public class OOP {
    public static void main (String [] args){
        //انشاء طالب حجز مكان في الذاكرة
        Student s1 = new Student();
        // ملء بيانات هذا الطالب
        s1.name = "Ali";
        s1.grade = 90;
        // انشاء الطالب الثاني في الذاكرة
        Student s2 = new Student();
        s2.name = "Sam";
        s2.grade = 77;
        System.out.println("Student 1 : " + s1.name + " grade = " + s1.grade);
        System.out.println("Student 2 : " + s2.name + " grade = " + s2.grade);

    }
}
