import java.util.Scanner;
import java.lang.Integer;

class divCalc {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int firstInteger = Integer.parseInt(scanner.next());
    System.out.println("Enter the operator:");
    String operator = scanner.next();
    System.out.println("Enter the second number:");
    int secondInteger = Integer.parseInt(scanner.next());

    Calculator calculator = new Calculator();

    System.out.println(firstInteger + " " + operator + " " + secondInteger
                          + " = " + calculator.calculate(firstInteger, secondInteger, operator));

  }
}

class Calculator {
  public int calculate(int a, int b, String c) {
    int result = 0;
    switch(c) {
      case "+":
        result = a + b;
        break;
      case "-":
        result = a - b;
        break;
      case "*":
        result = a * b;
        break;
      case "/":
        result = a / b;
        break;
      case "%":
        result = a % b;
        break;
    }
    return result;
  }

}
