import java.util.Scanner;
public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userInput;

    System.out.println("Please Enter a number:");
    userInput = input.nextInt();

    if(userInput % 2 == 0) {
      System.out.println("The number is even.");
    }
    else {
      System.out.println("The number is odd.");
    }
  }
}
