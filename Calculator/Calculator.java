class Calculator {

  double result = 0;

  Calculator (double a, double b, String str) {

    if(str.equals("+")) {
      result = a + b;
    }
    if(str.equals("-")) {
      result = a - b;
    }
    if(str.equals("*")) {
      result = a * b;
    }
    if(str.equals("/")) {
      result = a / b;
    }

  }

}
