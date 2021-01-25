import java.util.Random;
import java.util.Scanner;

/**
* The Array program implements an application that
* outputs the min and max numbers of a random array.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-25
*/
public class Array {
  /**
  * The minArray method returns the min
  * number in the random Array.
  */
  public static int minArray(int[] random) {
    int min = random[0];

    for (int counter = 0; counter < random.length; counter++) {
      if (random[counter] < min) {
        min = random[counter];
      }
    }
    return min;
  }

  /**
  * The maxArray method returns the max
  * number in the random Array.
  */
  public static int maxArray(int[] random) {
    int max = random[0];

    for (int counter = 0; counter < random.length; counter++) {
      if (random[counter] > max) {
        max = random[counter];
      }
    }
    return max;
  }

  /**
  * The Main method creates the random array.
  */
  public static void main(String[] args) {
    int[] random = new int[10];

    Random rand = new Random();
    System.out.printf("The random numbers are: ");
    for (int counter = 0; counter < random.length; counter++) {
      int randomNumber = 1 + rand.nextInt(99);
      if (counter == random.length - 1) {
        System.out.println(randomNumber);
      } else {
        System.out.printf(randomNumber + ", ");
      }
      random[counter] = randomNumber;
    }

    int min = minArray(random);
    int max = maxArray(random);

    System.out.printf("The Min is " + min + " and the Max is " + max);
  }
}
