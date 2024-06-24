package org.example;

import java.util.Scanner;

public class EnterValidInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberChoice = 0;
        boolean inRangeNumber;

        final int MIN_VALID_NUMBER = 1;
        final int MAX_VALID_NUMBER = 10;

        do {
            System.out.println("Please enter a number between " + MIN_VALID_NUMBER +  " and " + MAX_VALID_NUMBER + ":");

            if (input.hasNextInt()) {
                numberChoice = input.nextInt();

                if (numberChoice >= 1 && numberChoice <= 10) {
                    inRangeNumber = true;
                } else {
                    System.out.println("The number is out of range. Try again.");
                    inRangeNumber = false;
                }
            } else {
                System.out.println("That's not a valid integer. Try again.");
                if (input.hasNext()) {
                    input.next();
                } else {
                    break; //LEAVE THE LOOP
                }
                inRangeNumber = false;
            }

        } while (!inRangeNumber);

        //TODO: add error handling

        System.out.println("You entered: " + numberChoice + ". This is a valid number.");
    }

}
