import java.util.Scanner;
import java.lang.Integer;

class divCalc {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int firstInteger = Integer.parseInt(scanner.next());
    System.out.println("Enter the second number:");
    int secondInteger = Integer.parseInt(scanner.next());
    System.out.println("Enter the operator:");
    String operator = scanner.next();
    int answer = 0;

    System.out.println(firstInteger + " " + operator + " " + secondInteger
                          + " = " + answer);

  }

}

class calculate {

  public calculate(int a, int b, String c) {
    a = a;
    b = b;
    c = c;
  }

  int calculator() {
    int result = 0;
    switch(operator) {
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
