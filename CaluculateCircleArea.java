package monday.lec;

import java.util.Scanner;

public class CaluculateCircleArea {
    public static void main(String[] args) {
        // double radius = 5;
        // double len = 15;
        // // calculate the area using PI
        // double area = radius * radius * Math.PI;
        // //and now volume
        // double volume = area * len;
        // System.out.println("area");

        // System.out.println(2 + 3 * 5);

        // System.out.println((2+3) * 5);

        // System.out.println(5 / 2);
        // System.out.println(5.0 / 2);

        // int i = 9, j = 2;

        // i++;
        // //i--;
        // ++j;

        // System.out.println("i equal: "+i);
        // System.out.println("j equal: " +j);

        // Scanner input = new Scanner(System.in);

        // System.out.println("Enter your marks");
        // int marks = input.nextInt();
        // if (marks >= 90 && marks < 100) {
        // System.out.println("Excellent");
        // }else if (marks <= 90 && marks > 80) {
        // System.out.println("Very Good");
        // }else if (marks <= 80 && marks > 70) {
        // System.out.println("Good");
        // }else if (marks <= 70 && marks > 60) {
        // System.out.println("Fair");
        // }else if (marks <= 60) {
        // System.out.println("Failed");
        // }else if(marks == 100){
        // System.out.println("Full mark");
        // }

        // if (marks != 100) {
        // System.out.println("Not Full mark");
        // }

        // if (marks % 2 == 0) {
        // System.out.println("Even number");
        // }else {
        // System.out.println("Odd number");
        // }

        // System.out.println("Enter your mark");
        // int marks = input.nextInt();
        // System.out.println("Enter your faulty class. Enter from 1 to 4");

        // int classLevel = input.nextInt();
        // if (classLevel == 1 || classLevel == 2 || classLevel == 3 || classLevel == 4)
        // {
        // if (marks > 0) {
        // System.out.println("Positive Number");
        // }else if (marks < 0) {
        // System.out.println("Negative Number");
        // }else{
        // System.out.println("neigther negative, nor positive number");
        // }
        // }else{
        // System.out.println("your entery is invalid");
        // }

        // int total = 0;
        // for (int i = 1; i < 11; i++) {
        //     System.out.println("Enter your mark for year:"+ i);
        //     int marks = input.nextInt();
        //     total = total + marks;
        // }
        // if (total >= 750 && total <= 1000) {
        //     System.out.printf("Total is %d , you are Qualified", total);
        // }else{
        //     System.out.printf("Total is %d , you are not Qualified", total);
        // }
    





    /*
     * for loop
     */

     Scanner input = new Scanner(System.in);

     /*
     * task monday, 10 June in the lecture:
     * get from the user his marks during the last 10 years, he should send a
     * cumulative degree for each year .
     * Count the total of the 10 years, and check whether the total degree is
     * greater than 1000 or not .
     * If the total degree is between 1000 to 750, print to the user a message with
     * his result.
     * If his result is less than 750, say to him that he is not qualified.
     */
    
    //  int counter = 0;
    //  for(int i = 1; i < 11; i++ ){
    //     System.out.println("Enter degree of year " + i);
    //     int degree = input.nextInt();
    //     counter = counter + degree;
    //     System.out.println("Total = " + counter);
    //  }

    //  if (counter <= 1000 && counter >= 750) {
    //     System.out.printf("Your total is %d , You are Qualified", counter);
    //  }else{
    //     System.out.printf("Your total is %d , You are not Qualified", counter);
    //  }


    System.out.println("Enter 1 for Addition or 2 for multiplication");
    int degree = input.nextInt();
    int number1 = 0, number2 = 0, total = 0;
    switch (degree) {
        case 1:
            System.out.println("Enter two numbers n1, n2");
            number1 = input.nextInt();
            number2 = input.nextInt();
            total = number1 + number2;
            System.out.println("Addition of number 1 and Two = " + total);
            break;
        case 2:
        System.out.println("Enter two numbers n1, n2");
            number1 = input.nextInt();
            number2 = input.nextInt();
            total = number1 * number2;
            System.out.println("Multiplication of number 1 and Two = " + total);
            break;
        default:
        System.out.println("Invalid input");
            break;
    }


    }











    
}
