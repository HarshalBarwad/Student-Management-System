import java.util.*;
public class Studentms{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student detail management
        System.out.println("----------Student Managment System----------");
        System.out.println("Enter Your Name:- ");
        String name = sc.nextLine();
        System.out.println("Enter Your age:- ");
        int age = sc.nextInt();
        System.out.println("Enter ID Number:- ");
        int id = sc.nextInt();

        // Subject Management System
        System.out.println("----------Subject Managment System----------");
        System.out.println("Enter English Subject Marks:-");
        int eng = sc.nextInt();
        System.out.println("Enter Science Subject Marks:-");
        int sci = sc.nextInt();
        System.out.println("Enter Math's Subject Marks:-");
        int math = sc.nextInt();
        System.out.println("Enter Hindi Subject Marks:-");
        int hindi = sc.nextInt();
        System.out.println("Enter EVS Subject Marks:-");
        int evs = sc.nextInt();

        // Total Marks distribution
        System.out.println("----------Total Marks Distribution----------");
        System.out.println("English:- "+eng);
        System.out.println("Science:- "+sci);
        System.out.println("Math's:- "+math);
        System.out.println("Hindi:- "+hindi);
        System.out.println("EVS:- "+evs);

        // Final Result
        System.out.println("----------Final Marks Sheet----------");
        System.out.println("Name:- " +name);
        System.out.println("Age:- " +age);
        System.out.println("ID:- " +id);
        int sum = eng+sci+math+hindi+evs;
        double per = (sum/500.0) *100;
        System.out.println("Total Marks Obtain:- " +sum);
        System.out.println("Total Percentage Obtain:- "+per);


        if (sum>=35){
            System.out.println(id+ " Passed");
        }else{
            System.out.println(id+" Failed");
        }
    }
}