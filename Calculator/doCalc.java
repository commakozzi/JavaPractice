import java.util.Scanner;

class doCalc(int ... a) {

  double input1, input2 = 0;
  String operator;
  Scanner userInput = new Scanner(System.in);
  double additionResult = input1 + input2;
  double subtractionResult = input1 - input2;

  System.out.println("Enter first number:");
  input1 = userInput.nextDouble();

  System.out.println("Enter second number:");
  input2 = userInput.nextDouble();

  System.out.println("Enter your operator:");
  operator = userInput.next();

  switch(operator) {

    case "+":
      System.out.println(additionResult);
      break;

    case "-":
      System.out.println(subtractionResult);
      break;

  }


}
