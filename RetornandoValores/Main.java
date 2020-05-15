package RetornandoValores;

class Retangulo {
  public int width, height;
  
  public int areaTotal() {
    return width * height;
  }

  public boolean isQuadrado() {
    if(width == height) {
      return true;
    } else {
      return false;
    }
  }
}

public class Main {
  public static void main(String args[]) {
    Retangulo quadrado = new Retangulo();
    quadrado.width = 100;
    quadrado.height = 120;

    System.out.println(quadrado.areaTotal());
    System.out.println(quadrado.isQuadrado());
  }
}

/* 
metodos que retornam valores
[tipoRetorno] nome() {
  return valor;
}
- Pode retornar qualquer tipo de dado
- Podemos usar return mesmo em metodos void para terminar a execução do metodo, porém nao passamos nenhum valor
- Porem se declararmos o tipo do retorno somos obrigados a retornar um valor desse tipo
*/