import java.util.Scanner;
/**
 *
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // create an array to store the integers
    int[] numbers = new int[10];

    // ask the user for the integers
    System.out.println("Please enter in 10 integers to put into the array");

    // use a for loop to get all the integers from the user
    for(int i = 0; i < numbers.length; i++){
      // fill the array with a value
      numbers[i] = input.nextInt();
    }

    // ask the user for a number to find
    System.out.println("Please enter a number to find");
    int findNumber = input.nextInt();

    // create a loop to find user's number
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] == findNumber){
        System.out.println(findNumber + " is located at index " + i);
      }
    }
    
  }
}
