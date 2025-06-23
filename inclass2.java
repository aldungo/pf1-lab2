import java.util.Scanner;

/**
 * Name:
 * Date:
 * Purpose: Lab #
 * This lab demonstrates the first usage of GitHub, and ensures that the 
 * students can follow the README.md instructions line by line and add code where needed
 
 */

public class inclass2
{
    public static void main (String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double mass;
		double acceleration;
		double force;

        System.out.print("Please enter the mass of the object (kg): ");
        mass = input.nextDouble();

        System.out.print("Please enter the acceleration of the object (m/s^2): ");
        acceleration = input.nextDouble();

        force = mass * acceleration;

        System.out.print("The force applied to the object is " + force + " N.");

    }
}