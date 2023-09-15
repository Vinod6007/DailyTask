package org.dailyproject;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the value: ");
int number = s.nextInt();
if (isArmstrongNumber(number)) {
    System.out.println(number + " is an Armstrong number.");
} else {
    System.out.println(number + " is not an Armstrong number.");
}
}

// Function to check if a number is an Armstrong number
static boolean isArmstrongNumber(int num) {
int originalNum, remainder, result = 0;
originalNum = num;

while (originalNum != 0) {
    remainder = originalNum % 10;
    result += Math.pow(remainder, 3); // Change the power to match the number of digits (e.g., 3 for a 3-digit number)
    originalNum /= 10;
}

return result == num;
	}

}
