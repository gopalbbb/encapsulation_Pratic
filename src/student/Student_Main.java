package student;

import java.util.Scanner;

public class Student_Main {


    //we use boolean for ture or false statement , when added static keyword then it will be showed in the result.
    static boolean ordering = true;

    //create method only for display option
    public static void menu() {
        System.out.println("****** WEl Come To Student Management System*******" +
                "\n1 for Add Student" +
                "\n2 for view student" +
                "\n3.view all student" +
                "\n4 for remove student" +
                "\n5.update student" +
                "\n6.Exit");
    }

    public static void main(String[] args) {

        Student_Service student = new Student_Service();
        Scanner sc = new Scanner(System.in);
        //create do while loop ,switch case
        boolean islogedIN = false;
        do {
            if (!islogedIN) {
                islogedIN = student.getLogIn();
            }
            if(!islogedIN){
                continue;

            }

            //its method we make before for choose option
            menu();
            System.out.println("Enter your option number");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Add Student");
                   student.addStudent();
                    break;
                case 2:
                    System.out.println("View Student details");
                    student.viewById();
                    System.out.println("Paycheck Details");
                    student.getPayCheckDetails();

                    break;
                case 3:
                    System.out.println("View all Student");
                    student.viewAllStudent();
                    break;
                case 4:
                    System.out.println("Remove Student");
                    student.deleteStudent();
                    break;
                case 5:
                    System.out.println("Update Student");
                    student.updateStudent();
                    break;
                case 6:
                    System.out.println("user side");
                case 7:
                    System.out.println("Thank you for using our application");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid option");

            }


        } while (ordering);//already define in boolean type true
    }
}
