import java.util.Random;
import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] dataPoints = new int[100];
        Scanner in = new Scanner(System.in);

        for(int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }
        for(int e = 0; e < dataPoints.length; e++)
        {
            System.out.printf("%5d",dataPoints[e]);

            if(e < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int sum = 0;
        for(int e = 0; e < dataPoints.length; e++)
        {
            sum = sum += dataPoints[e];
        }
        System.out.println("The sum of the random data values are: " + sum);
        double avg =(double) sum / dataPoints.length;
        System.out.println("The average of the random data values are: " + avg);
        int userInput = 0;
        userInput = SafeInput.getRangedInt(in,"\nType the input you are looking for",1,100);
        boolean foundTarget = false;

        for(int e = 0; e < dataPoints.length; e++)
        {
            if(dataPoints[e] == userInput)
            {
                foundTarget = true;
                System.out.println("Found: " + userInput + " at index: " + e);
            }
        }
        if(!foundTarget)
        {
            System.out.println("Target: " + userInput + " was not found! ");
        }
        for(int e = 0; e < dataPoints.length; e++)
        {
            if(dataPoints[e] == userInput)
            {
                foundTarget = true;
                System.out.println("The value: " + userInput + " was first found at array index: " + e);
                break;
            }
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int e = 0; e < dataPoints.length; e++)
        {
            if(min>dataPoints[e])
            {
                min = dataPoints[e];
            }
            if(max<dataPoints[e])
            {
                max = dataPoints[e];
            }
        }
        System.out.println("\n\nThe min value is: " + min + " and the max value is: " + max);
        System.out.println("\n\nAverage of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int[] values)
    {
        int sum = 0;
        for(int value : values)
        {
            sum += value;
        }
        return (double) sum / values.length;
    }
}