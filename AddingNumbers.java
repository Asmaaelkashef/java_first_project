import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        /*
         * Execute 
         */
/* 
         int x = 8;  // declaration // Declare two varaibles z, n   /// initialization   // static value 
         //int y = 6;
         //int sum = x + y ;  // assignment
         int minus = x - y;
         int multiply = x * y;
         int division = x / y;
         int r = x % y;

         System.out.println("Sum of X and Y = " + sum);

         System.out.println("Subtraction of X - Y = " + minus);

         System.out.println("Multiply Result of X and Y = " + multiply);

         System.out.println("Division of X and Y = " + division);

         System.out.println("Remiander of X % Y = " + r);
*/
/*
         float x = 8;
         float y = 6;

         float division = x / y;

         System.out.println("Division of X and Y = " + division);

         System.out.println("Hi, This is Mohamed Atef\rI live in Sinai... \nWelcome dear...");

         System.out.println("Datbase backup is in : D:\\BackendProjects");
        
         System.out.println("You can read more about our documentation on the following url. Just click Here: https://www.facebook.com");

         System.out.println("Hi, ........ \"Mekkah\"");
*/

         // dynamic 
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome, You are in Bank Misr Web Portal");
         System.out.println("Please, Enter You Depit Card Number, Card numbers should be 16 digits");
         String cardNumber =  input.next();
         System.out.println("Are you sure that your Card number is : "+ cardNumber + " Enter 1 for Approval, 2 for Deny?");
         String yesNoCardNum =  input.next();
         int userResponseValue = Integer.parseInt(yesNoCardNum); // conversion / casting // type to type 

         if (userResponseValue == 1) {
            System.out.println("You have approved this Card. Go to the next step ..! ");   
         }else if(userResponseValue == 2){
            System.out.println("It looks that you have entere a wrong value. ..! Enter Debit Card numbers again ...");   
         }else{
            System.out.println("You have entered neigther 1 nor 2. Please check your inputs ...");   
         }
         


         /*
          Monday 10 June, 2024 Task
          Add the following features to the last software:
          - Ask the user to enter his ID and print it.
          - Ask the user to enter his Full Name and print it.
          - Ask the user to enter his Birth Date and print it.
          - Ask the user to select his Gender, male or female by entering 1 or 2 and print his selection.
          - Ask the user to enter his Address, and print it.
          - Ask the user to enter his recent certifications, and print it. 
          - Ask the user to enter whether he is a student at the university or has graduated, and print that.
          - Ask the user where do he work, and print that.
          - Ask the user to verify whether he entered 16 digits or not (optional)
        


          */


        
    }
}