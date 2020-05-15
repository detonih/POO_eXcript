package ParametrosArgumentos;

//somente uma classe pode ser publica dentro de um arquivo

class Calculo {
  void soma(int num1, int num2) {
    System.out.println(num1 + num2);
  }
}

public class Main {
  public static void main(String args[]) {
    Calculo cal = new Calculo();
    cal.soma(5, 25);
  }
}