package student;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_Service {
    //// put list of student in array list. from student class.
    ArrayList<Student> stuList = new ArrayList<Student>();
    Student stu1 = new Student("Gopal", 101, "Basnet");
    Student stu2 = new Student("Biplav", 202, "Gautam");
    Student stu3 = new Student("Min", 303, "Budhathoki");


    //
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    String lastName ;
    private LocalDateTime checkOutDate;
    private LocalDateTime checkInDate;

    //creating constructor from student_service and mention student list for arraylist
    public Student_Service() {
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
       //stuList.add(stu4);

    }

    //  create method for view all student
    public void viewAllStudent() {

        //for loop ko laagi array list ma vayako Student liyar array list ma nai vayako list layara call garne
        for (Student student : stuList) {
            System.out.println(student);
        }
    }

    public void viewById() {
        //define found with boolean
        boolean found = false;
        System.out.println("Enter Student Id");
        id = sc.nextInt();
        for (Student student : stuList) {
            if (student.getId() == id) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student with this id is not found ");
            System.exit(2);
        }
    }

    public void getLogIn() {

        System.out.println("Please enter your user name: ");
        //user "admin"
        // pp"1234"

        String user =sc.nextLine();
        System.out.println("Please enter your password: ");
        String password=sc.nextLine();
        // Console is used to mask the password
      /*  Console console = System.console();

        if (console == null) {
            System.out.println("No console available");
            return;
        }*/



        // password maybe stored in memory later on even when not being referenced.
        // So needs to be cleared after use
        //char[] password = console.readPassword();

        //String data = String.valueOf(password).replaceAll("[0-9]", "*"); //replacing and storing it into new String variable

        if (("admin".equals(user) && "1234".equals(password))) {
            System.out.println("Login successfully");
        }
        else {
            System.out.println("incorrect user name and password ! Please Try Again ");
            System.exit(1);}
        }

        // Clearing the password so that it doesn't get stored in memory
       // Arrays.fill(password,'');


    //update student
    public void updateStudent() {
        System.out.println("Enter Id");
        id = sc.nextInt();
        boolean found = false;
        for (Student student : stuList) {
            if (student.getId() == id) {
                System.out.println("Enter new name");
                name = sc.next();
                student.setName(name);
                System.out.println("updated details of student are:");
                System.out.println(student);
                found = true;

            }
        }
        if (!found) {
            System.out.println("Student is not found");
        } else {
            System.out.println("update successfully!!");
        }
    }


    //delete Student
    public void deleteStudent() {
        System.out.println("Enter id for delete student");
        id = sc.nextInt();
        Student studentdelete = null;
        boolean found = false;

        for (Student student : stuList) {
            if (student.getId() == id) {
                studentdelete = student;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Id not found");
        } else {
            stuList.remove(studentdelete);
            System.out.println("Delete successfully!!");
        }
    }
public void addStudent(){
    System.out.println("Please Enter name");
    name=sc.nextLine();
    System.out.println("Enter Id");
    id=sc.nextInt();
    System.out.println("Enter last name");
    lastName=sc.nextLine();
    Student student=new Student(name,id,lastName);
    stuList.add(student);
    System.out.println("Student added successfully");
    System.out.println(student);

    }
    public void getPayCheckDetails() {

        LocalDateTime date1 = LocalDateTime.now();
        this.checkInDate=date1;
        LocalDateTime date2 = LocalDateTime.now();
        this.checkOutDate=date2;
        Duration attendance  = Duration.between(this.checkInDate,this.checkOutDate);
       /*p.toHours();
         p.toMinutes();*/

        float sum = attendance.toDays();
        System.out.println("Total workingHours" + ":" + sum);
        float ratePerHour =2;
        float earning= ratePerHour*sum;
        System.out.println("Earning amount is $"+":"+earning);
        float tax = 0.015f/earning*100;
        System.out.println("tax"+":"+tax);
        float amount=earning-tax;
        System.out.println("Net Receive Amount"+":"+amount);
        System.exit(2);


    }
}


