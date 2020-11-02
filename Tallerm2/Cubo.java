import java.util.Scanner;
public class Cubo {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    float n,total;

    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese el numero para totalizar el cubo: ");
    n = leer.nextFloat();
    System.out.println("");
    total= (float)Math.pow(n, 3);

      System.out.print("El valor del cubo es: "+total);
      System.out.println("");
  }
}
