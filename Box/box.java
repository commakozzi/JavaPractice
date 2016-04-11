class Box {

  double width;
  double depth;
  double height;
  double vol;

  public Box(int a, int b, int c) {
    width = a;
    depth = b;
    height = c;
  }
  public Box(double  a, double b, double c) {
    width = a;
    depth = b;
    height = c;
  }

  public Box() {
    width = -1;
    depth = -1;
    height = -1;
  }

  double calcVol() {
    vol = width * depth * height;
    return vol;
  }
}

class makeBox {
  public static void main(String args[]) {
    Box myBox1 = new Box(12, 12, 2);
    Box myBox2 = new Box(100, 100, 50);

    System.out.println("The width is " + myBox1.width);
    System.out.println("The depth is " + myBox1.depth);
    System.out.println("The height is " + myBox1.height);

    System.out.println("The volume of myBox1 is " + myBox1.calcVol());
    System.out.println("The volume of myBox2 is " + myBox2.calcVol());

  }
}
