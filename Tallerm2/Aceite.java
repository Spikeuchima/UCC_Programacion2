import java.util.Scanner;
public class Aceite {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    double prohobbes,procal,total;

    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese la produccion de aceite total: ");
    total = leer.nextFloat();

    prohobbes=total/(1+2.0/3.0);
    procal=prohobbes*2.0/3.0;

      System.out.format("\nLa produccion de aceite de calvin es: %.2f",procal);
      System.out.format("\nLa produccion de aceite de hobbes es: %.2f",prohobbes);
      System.out.println("");
  }
}
