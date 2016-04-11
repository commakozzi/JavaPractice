package Calculator;

class doCalc(int ... a) {

  int result = 0;

  // Multiply input
  for (int i = 0; i < a.length; i++) {
    result *= a[i];
  }
  
}
