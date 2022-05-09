package kraakmo.learningjava;

import java.util.Scanner;

public class Factorizor {
    public static void main(String[] args) {
        int numFac= 0;
        int arrayCount = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("What number would you like to factor? ");
        numFac = input.nextInt();

        int facArray[] = new int [numFac];

        for (int i = 1; i <= numFac; i++){
            if (numFac % i == 0) {
                facArray[arrayCount] = i;
                arrayCount++;
            }
        }

        for (int i = 0; i < facArray.length; i++){
            if (facArray[i] > 0 && facArray[i] < numFac){
                sum = sum + facArray[i];
                System.out.println(facArray[i]);
            }
        }

        if (sum == numFac) {
            System.out.println( numFac + " is a perfect number.");
        } else {
            System.out.println(numFac + " is not a perfect number.");
        }

        if (facArray[0] + facArray[1] == (numFac + 1)){
            System.out.println(numFac + " is a prime number.");
        } else {
            System.out.println(numFac + " is not a prime number.");
        }
    }
}