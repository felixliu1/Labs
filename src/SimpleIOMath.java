/**

 * SimpleIOMath is a simple class that takes input/output
 * from a user, stores that information in class variables
 * and then defines a few helper methods.
 * @version 09/24/2020
 * @author felix liu

 */

import java.sql.SQLOutput;
import java.util.Scanner;


public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * Asks the user for some info
     */
    public void promptUser(){
        Scanner s = new Scanner(System.in);
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        System.out.print("Question 1: What is your name? ");
        name = s.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = s.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = s.nextInt();
        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
    }

    /**
     * Prints out the user-given info
     */
    public void printInfo(){
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        oldDetector(age);
        System.out.println("At your next birthday, you will turn " + (age + 1) + ".");
        System.out.println("The first prime factor of " + age + " is: " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + (Math.pow(favNumber, 2)));
        System.out.println("* end of program *");
    }

    private int smallestPrimeFactor(int age){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61};
        for(int factor : primes){
            if(age % factor == 0)
                return factor;
        }
        return age;
    }

    private int oldDetector(int age){
        if(age >=45)
            System.out.println("Ah, gotcha! Oldhead detected.");
        if(age <45)
            System.out.println("A youngin'! You're still cool.");
        return age;
    }

    /**
     * Main Method for SimpleIOMath class
     * @param args Command line arguments, if needed
     */
    public static void main(String[] args){
        SimpleIOMath obj = new SimpleIOMath();
        obj.promptUser();
        obj.printInfo();
    }

}
