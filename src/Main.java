import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
//////////////////////////////////////// EXTRA CREDIT SECTION!//////////////////////////////////////////////////////////
    public static int min(int values[]){
        int min = values[0];
        for(int i = 0; i < values.length; i++) {
        int position = values[i];
        if(position < min)
            min = position;
    }
        return min;
    }
    public static int max(int values[]){
        int max = values[0];
        for(int i = 0; i < values.length; i++) {
            int position = values[i];
            if(position > max)
                max = position;
        }
        return max;
    }
    public static int occuranceScan(int values[], int target){
        int occurrence = 0;
        for(int i = 0; i < values.length; i++) {
            if(values[i] == target){
                occurrence++;
            }
        }
        return occurrence;
    }
    public static int sum(int values[]){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
    public boolean contains(int values[], int target) {
        int occurrence = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                occurrence++;
            }
        }
        if (occurrence == 0) {
            return false;
        } else {
            return true;
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static double getAverage(int[] values){
        double sum = 0;
        double avg = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        avg = sum / values.length;
        return avg;
}
    public static void main(String[] args) {

        //random object initialization

        Random rnd = new Random();
        int val;
        double avg = 0.0;
        double sum = 0.0;

        //array initialization

        int[] dataPoints = new int[100];
        //for loop for array creation

        for(int i = 0; i < 100; i++){
            val = rnd.nextInt(100) + 1;
            dataPoints[i] = val;
        }
        // for loop to add a line after each value
        for(int i = 0; i < dataPoints.length; i++){
            System.out.print(dataPoints[i] + " | ");
        }
        for(int i = 0; i < dataPoints.length; i++){
            sum += dataPoints[i];
 }
        System.out.println();
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + (sum/100) );


        //Linear Scan Section
        int user = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
       // user = SafeInput.getRangedInt(in,"Please input a number between 1 and 100",1,100);
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] == user){
                count++;
        }
            i++;
        }
       // System.out.println("The inputed number " + user + " was found " + count  + " times in dataPoints");


        //Part c

        int fin = 0;

       // user = SafeInput.getRangedInt(in,"Please input a number between 1 and 100",1,100);

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == user){
                count = i;
                System.out.println("The value " + user + " was found at array index " + count);
                break;
            }
            fin++;

        }
        if (fin == dataPoints.length){
            System.out.println("The value " + user + " was not found in dataPoints");
        }


        // part d
        int min = dataPoints[0];
        int max = dataPoints[0];


        for(int i = 0; i < dataPoints.length; i++)
        {
            int position = dataPoints[i];

            if(position > max)
                max = position;
            if(position < min)
                min = position;
        }
        System.out.println("This is the minimum value of dataPoints " + min + " and This is the maximum value of dataPoints " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }



}
