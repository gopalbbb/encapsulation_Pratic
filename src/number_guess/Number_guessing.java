package number_guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Number_guessing {
    private int [] WinningNum=new int[6];
    private int []guessingNum=new int[6];

    public static void main(String[] args) {
        Number_guessing num=new Number_guessing();

       while(true){
           try{
        System.out.println("Enter your 6 guess number between  (1-70):");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            num.guessingNum[i]=sc.nextInt();}}
           catch(Exception e){
               System.out.println("Only Int number Accepts");
           }
        int counter=0;

        for (int i=0;i<6;i++){
            int randomNum = new Random().nextInt(70) + 1;
            num.WinningNum[i] = randomNum;
        }


        for (int i=0;i<6;i++){
            if(num.WinningNum[i]==num.guessingNum[i]){
                counter+=1;
            }
        }
            if(counter==6) {
                System.out.println("Congratulation you win !!");
            }else{
                System.out.println("Incorrect ! try again ");
            }
            System.out.println("Winning number are:"+(Arrays.toString(num.WinningNum)));
       }
        }



    }

