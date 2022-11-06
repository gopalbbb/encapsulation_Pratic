package customException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnderAgeException  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age ");
        int age= sc.nextInt();

         // try{
            if (age<18)
           {
               throw new UnderAgeException();
                //throw new UnderAgeException("my massage");
            }
            else
            {
                System.out.println("you can vote now ");
            }
        }//catch(UnderAgeException age1)
       {
           System.out.println("we got exception");
        }
    }



