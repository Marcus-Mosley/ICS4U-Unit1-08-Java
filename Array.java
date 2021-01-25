import java.util.Random;
import java.util.Scanner;

/**
* The Array program implements an application that
* outputs an array of 10 random numbers.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-25
*/
public class Array {
  /**
  * The RandArray method returns the array of 10
  * numbers with the specified restrictions.
  */
  public static int[] randArray(int maxValue, int minValue) {
    Random rand = new Random();
    int counter;
    int[] random = new int[10];

    for (counter = 0; counter < 10; counter++) {
      int randomNumber = minValue + rand.nextInt(maxValue - minValue + 1);
      random[counter] = randomNumber;
    }

    return random;
  }

  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args) {
    int maxValue = 0;
    int minValue = 0;
    int[] random;

    while (true) {
      try {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a min value: ");
        minValue = input.nextInt();
        if (minValue > 0) {
          break;
        } else {
          System.out.printf("That is not a valid input! \n");
        }
      } catch (Exception e) {
        System.out.printf("That is not a number, please input a number! \n");
      }
    }
    while (true) {
      try {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a max value: ");
        maxValue = input.nextInt();
        if (maxValue > minValue) {
          break;
        } else {
          System.out.printf("That is not a valid input! \n");
        }
      } catch (Exception e) {
        System.out.printf("That is not a number, please input a number! \n");
      }
    }

    random = randArray(maxValue, minValue);

    System.out.printf("The random numbers are: ");
    for (int count = 0; count < random.length; count++) {
      System.out.printf(random[count] + ", ");
    }
  }
}
