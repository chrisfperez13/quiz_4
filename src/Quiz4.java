import java.lang.Math;
import java.util.Scanner;
public class Quiz4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer between 1 and 20. ");

        int arr = input.nextInt();

        double[] object = new double [arr];

        for( int i = 0; i < object.length;i++){

            object[i] = Math.pow(2,i);

            System.out.println((int)object[i]);

        }
    }
}
