import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    int[] values;
    int inputLength = in.nextInt();
    
    values = new int[inputLength];

    for (int i = 0; i < inputLength; i++) {
      values[i] = in.nextInt();
    }

    int highestCount = 0;
    int highestCountValue = 0;

    for (int i = 0; i < values.length; i++) {
      int targetValue = values[i];
      int count = 0;
      
      for (int index = 0; index < values.length; index++) {
        if (values[index] == targetValue) {
          count += 1;
        }
      }

      if (count > highestCount) {
        highestCount = count;
        highestCountValue = targetValue;
      }
    }

    System.out.println(highestCountValue);
  }
}
