import java.util.Scanner;
public class ValorAbs {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    double valorabs;

    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese el numero para determinar el valor absoluto: ");
    valorabs = leer.nextFloat();
    System.out.println("");

    if (valorabs<0) {
        valorabs*=(-1);
    }
      System.out.println("El valor absoluto es: "+valorabs);
      System.out.println("");
  }
}
