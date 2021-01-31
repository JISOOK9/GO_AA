package study.aa;

public class CalculatorTestDrive {

  public static void main(String[] args) {
    //1
    Component a = new SingleComponent("2");
    System.out.println(a.getStrV());
    //2
    Component b = new SingleComponent("4");
    b = new Plus(b);
    b = new AdditionNumber(b, "5");
    System.out.println(b.getStrV());
    //3
    Component c = new SingleComponent("(");
    c = new OpenBrace(c);
    c = new AdditionNumber(c, "4");
    c = new Plus(c);
    c = new AdditionNumber(c, "2");
    c = new CloseBrace(c);
    c = new Multiply(c);
    c = new OpenBrace(c);
    c = new AdditionNumber(c, "8");
    c = new Minus(c);
    c = new AdditionNumber(c, "1");
    c = new CloseBrace(c);
    c = new CloseBrace(c);
    c = new Divide(c);
    c = new AdditionNumber(c, "2");
    System.out.println(c.getStrV());
    // write your code here
  }
}

abstract class Component {

  String strV;

  String getStrV() {
    return this.strV;
  }
}

class SingleComponent extends Component {
  SingleComponent(String s) {
    strV = s;
  }
}

abstract class Addition extends Component {
  Component inner;
  Addition(Component c) {
    inner = c;
  }
  String getStrV() {
    return inner.getStrV() + this.strV;
  }
}

class Plus extends Addition {
  Plus(Component c) {
    super(c);
    strV = "+";
  }
}

class Minus extends Addition {

  Minus(Component c) {
    super(c);
    strV = "-";
  }
}

class Multiply extends Addition {

  Multiply(Component c) {
    super(c);
    strV = "*";
  }
}

class Divide extends Addition {

  Divide(Component c) {
    super(c);
    strV = "/";
  }
}

class OpenBrace extends Addition {

  OpenBrace(Component c) {
    super(c);
    strV = "(";
  }
}

class CloseBrace extends Addition {

  CloseBrace(Component c) {
    super(c);
    strV = ")";
  }
}

class AdditionNumber extends Addition {

  AdditionNumber(Component c, String str) {
    super(c);
    strV = str;
  }
}
