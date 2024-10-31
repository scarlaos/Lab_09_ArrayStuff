import java.util.Random;

public class TaskOne {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        int[] dataPoints = new int[100];

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

    }
}