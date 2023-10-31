package Inheritance_OOP;

class newstudent{
    String Fname;
    String Lname;
    String[] Stream = {"Maths", "Bio", "Commerce", "Technology"};
}

class student01 extends newstudent{
    public String newregister(){
        newstudent nwstd = new newstudent();
        nwstd.Fname = "Bahir";
        nwstd.Lname = "Hussain";
        return nwstd.Lname;

    }
}

public class Student{
    public static void main(String[] args){
        student01 std01 = new student01();

        String std1 = std01.newregister();
        System.out.println(std1);

    }
}