/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.code;

/**
 *
 * @author Wilson5801
 */
import java.util.*;
public class CalorieBurnCalculator {
    
    /* menu method */
    public static void menu()
    {
        System.out.println("What activity would you like to do?");
        System.out.println("Press");
        System.out.println("1 for general bicycling");
        System.out.println("2 for resistance training");
        System.out.println("3 for general aerobic");
        System.out.println("4 for jog / walk combination");
        System.out.println("5 for stair / ladder climbing");
        System.out.println("0 for display total calories burned throughly");
        System.out.println("");
    }
    
    /* change minute to hour method */
    public static double duration(double timeInMin)
    {
        double timeInHour = timeInMin / 60.0;
        return timeInHour;
    }
            
    /* main program */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        double exactTime, timeInMin, caloriesBurned = 0, highestCalories = 0;
        String name, highestName = null;
        do
        {
            double total = 0;
            System.out.println("Click <Enter> if wish to end the program");
            System.out.print("Please enter your name: ");
            name = sc.nextLine();
            if (!(name.equals("")))
            {   
                System.out.print("Please enter your weight in kilogram(kg) unit: ");
                double weight = sc.nextDouble();
                if (weight > 0 && weight <= 150)
                {
                    System.out.println("");
                    do
                    {
                        menu();
                        System.out.print("Your choice? ");
                        choice = sc.nextInt();
                        if (choice != 0)
                        {
                            switch (choice)
                            {
                                case 1:
                                {
                                    System.out.print("Please enter the time in minutes you have exercise: ");
                                    timeInMin = sc.nextDouble();
                                    exactTime = duration(timeInMin);    /* time in hour returned */
                                    /* MET == 7.5 */
                                    caloriesBurned = 7.5 * weight * exactTime;
                                    System.out.printf("%s, you have burn %.2f calories in general bicycling", name, caloriesBurned);
                                    System.out.println("\n");
                                    total += caloriesBurned;
                                    break;
                                }
                                case 2:
                                {
                                    System.out.print("Please enter the time in minutes you have exercise: ");
                                    timeInMin = sc.nextDouble();
                                    exactTime = duration(timeInMin);    /* time in hour returned */
                                    /* MET == 6.0 */
                                    caloriesBurned = 6.0 * weight * exactTime;
                                    System.out.printf("%s, you have burn %.2f calories in resistance training", name, caloriesBurned);
                                    System.out.println("\n");
                                    total += caloriesBurned;
                                    break;
                                }
                                case 3:
                                {
                                    System.out.print("Please enter the time in minutes you have exercise: ");
                                    timeInMin = sc.nextDouble();
                                    exactTime = duration(timeInMin);    /* time in hour returned */
                                    /* MET == 7.3 */
                                    caloriesBurned = 7.3 * weight * exactTime;
                                    System.out.printf("%s, you have burn %.2f calories in general aerobic", name, caloriesBurned);
                                    System.out.println("\n");
                                    total += caloriesBurned;
                                    break;
                                }
                                case 4:
                                {
                                    System.out.print("Please enter the time in minutes you have exercise: ");
                                    timeInMin = sc.nextDouble();
                                    exactTime = duration(timeInMin);    /* time in hour returned */
                                    /* MET == 6.0 */
                                    caloriesBurned = 6.0 * weight * exactTime;
                                    System.out.printf("%s, you have burn %.2f calories in jog / walk combination", name, caloriesBurned);
                                    System.out.println("\n");
                                    total += caloriesBurned;
                                    break;
                                }
                                case 5:
                                {
                                    System.out.print("Please enter the time in minutes you have exercise: ");
                                    timeInMin = sc.nextDouble();
                                    exactTime = duration(timeInMin);    /* time in hour returned */
                                    /* MET == 7.5 */
                                    caloriesBurned = 7.5 * weight * exactTime;
                                    System.out.printf("%s, you have burn %.2f calories in stair / ladder climbing", name, caloriesBurned);
                                    System.out.println("\n");
                                    total += caloriesBurned;
                                    break;
                                }
                                /* for choice other than the option in the menu */
                                default:
                                {
                                    System.out.println("Please press the correct choice from the menu given");
                                    System.out.println("");
                                    break;
                                }
                            }
                        }
                    }
                    while (choice != 0);
                    /* total calories burned for one single current user */
                    System.out.printf("Congratulations, you have burn %.2f calories", total);
                    System.out.println("\n");
                }
                else
                {
                    System.out.println("Invalid weight entered.");
                }
                /* prompt in another user */
                sc.nextLine();
            }
            /* setting user with highest calories burned */
            if (total > highestCalories)
            {
                highestCalories = total;
                highestName = name;
            }
        }
        while (!(name.equals("")));
        System.out.println("");
        /* printing out user with highest calories burned */
        System.out.printf("%s with %.2f calories burned has the highest total calories burned of the day", highestName, highestCalories);
        System.out.println("");
    }
    
}
/* end program */
