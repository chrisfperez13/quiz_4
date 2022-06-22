import java.util.Arrays; // need this for a method.
import java.util.Scanner;
public class HomeWorkSix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // for integers

        Scanner two = new Scanner(System.in); // for range
        System.out.println("Enter integer n, greater than 10: ");
        int nTwo = two.nextInt();
         // range

        while(nTwo < 11){ //need to use it this way, because your
            // gonna break it when u get your answer, and not the other way around.
            System.out.print("Enter an integer greater than 10: ");
            nTwo = input.nextInt();
        }

        int[] array = new int[nTwo]; // range

        System.out.println("Enter " + nTwo + " integers :");

            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
        }

           System.out.println("You entered " + Arrays.toString(array));

        // initialize max and finding
        int maxValue = array[0];
            for(int i = 0; i < array.length;i++){
                if(array[i] > maxValue){
                    maxValue = array[i];
                }
            }System.out.println("The max of the integers is " +maxValue);


            // this is my minimum
        int minValue = array[0];
        for (int i = 0; i <array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        } System.out.println("This is the min " + minValue );

        //This part adds the sums
        double sum = 0;
        for(int i = 0; i <array.length;i++){
            sum += array[i] ;
        }

        // this is the average
        double average = sum / array.length;

        //This part will return the numbers greater than the average

        for( int i = 0; i < array.length; i++){
            if (average < array[i]){
                System.out.println("This is greater than the average :"+ array[i]);
            }
        }
        // Making an array to print out
        double[] greaterMin = new double[array.length];
        // elements greater than the min
        for (int i = 0; i < array.length;i++){
            if (minValue <src array[i]) {
                greaterMin[i] = array[i]; // adding to a new array
                System.out.println("These numbers are greater then average " +greaterMin[i]);
            }
        }
    }
}
