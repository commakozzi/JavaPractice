import java.util.Scanner;

class useCalculator {

  public static void main(String args[]) {

    double input1;
    double input2;
    String operator;
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter your first number:");
    input1 = userInput.nextDouble();

    System.out.println("Enter your second number");
    input2 = userInput.nextDouble();

    System.out.println("What is your operator?:");
    operator = userInput.next();

    Calculator myCalc = new Calculator(input1, input2, operator);
    System.out.println("Result = " + myCalc.result);

  }

}
