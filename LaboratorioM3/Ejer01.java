import java.util.Scanner;
public class Ejer01 {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M3                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    char opc;

    Scanner leer = new Scanner(System.in);

    do{
      System.out.print("\nDesea terminar? (S o N): ");
      opc = leer.next().charAt(0);

    } while(opc=='n'||opc=='N');
  }
}
