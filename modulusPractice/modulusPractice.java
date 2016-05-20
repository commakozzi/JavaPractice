import java.util.Scanner;
import java.lang.Integer;

class modulusPractice {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int firstInteger = Integer.parseInt(scanner.next());
    System.out.println("Enter the modulus");
    int modulus = Integer.parseInt(scanner.next());

    System.out.println(firstInteger + " % " + modulus + " = " + firstInteger % modulus);

  }

}
