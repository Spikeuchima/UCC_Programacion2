import java.util.Scanner;
public class VentaCambio {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    double valor,dinero,cambio;

    Scanner leer = new Scanner(System.in);

      System.out.print("Ingrese el valor del articulo vendido: ");
      valor= leer.nextFloat();
      System.out.print("Ingrese el dinero recibido: ");
      dinero = leer.nextFloat();
      System.out.println("");

      cambio=dinero-valor;

      System.out.println("El dinero a devolver es: "+cambio);
      System.out.println("");
  }
}
