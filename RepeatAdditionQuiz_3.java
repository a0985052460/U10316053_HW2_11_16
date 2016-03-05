import java.util.Scanner;
import java.util.ArrayList;
public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    ArrayList<Object> myList = new ArrayList<>();
    
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number1 + " * " + number2 + "? ");
    int answer = input.nextInt();
    myList.add(answer);
    
    while (number1 * number2 != answer) {
    	
    	for(int i = 1;i<myList.size();i++){
    		if((int)myList.get(i)==answer){
    			System.out.println("You already entered " + answer);
    			break;
    		}
    	}
    	myList.add(answer);
      System.out.print("Wrong answer. Try again. What is " + number1 + " * " + number2 + "? ");
      answer = input.nextInt();
      
    }

    System.out.println("You got it!");
  }
}
