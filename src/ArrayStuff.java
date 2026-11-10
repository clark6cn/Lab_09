import java.util.Random;
import java.util.Scanner;


public class ArrayStuff {
    public static void main(String[] args){
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        for(int i = 0; i < dataPoints.length; i++){
            dataPoints[i] = rnd.nextInt(100) + 1;
            System.out.print(dataPoints[i] + " | ");
        }
        int sum = 0;
        for(int i = 0; i < dataPoints.length; i++){
            sum += dataPoints[i];
        }
        System.out.println();
        System.out.println("The sum of all the data points is: " + sum);
        double average = (double)sum/dataPoints.length;
        System.out.println("The average of the data points is: " + average);
        Scanner in = new Scanner(System.in);
        int searchValue = SafeInput.getRangedInt(in, "Enter a number to search for", 1, 100);
        int count = 0;
        for(int i = 0 ; i < dataPoints.length; i++){
            if(dataPoints[i] == searchValue){
                count++;
            }
        }
        System.out.println("The value " + searchValue + " was found " + count + " times in the array.");
        int findValue = SafeInput.getRangedInt(in, "Enter another number to search for", 1,100);
        int foundIndex = -1;
        for(int i = 0; i<dataPoints.length; i++){
            if(dataPoints[i] == findValue){
                foundIndex = i;
                break;
            }
        }
        if(foundIndex != -1){
            System.out.println("The value " + findValue + " was found at array index " + foundIndex);
        }
        else{
            System.out.println("The value " + findValue + " was not found.");
        }
        int max = dataPoints[0];
        int min = dataPoints[0];
        for(int i = 0; i < dataPoints.length; i++){
            if(dataPoints[i] < min){
                min = dataPoints[i];
            }
            if(dataPoints[i] > max){
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);
        double[] doubleDataPoints = new double[dataPoints.length];
        for(int i = 0; i < dataPoints.length; i++){
            doubleDataPoints[i] = dataPoints[i];
        }
        System.out.println("Average of the data points is: " + getAverage(doubleDataPoints));
    }
    public static double getAverage(double values[]){
        double sum = 0;
        for (int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum / values.length;
    }
}
