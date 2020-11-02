import java.util.Scanner;
public class Notas {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    double n1,n2,n3,notaf;

    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese la primera nota: ");
    n1 = leer.nextFloat();
    System.out.print("Ingrese la segunda nota: ");
    n2 = leer.nextFloat();
    System.out.print("Ingrese la tercera nota: ");
    n3 = leer.nextFloat();
    System.out.println("");

      notaf=n1*0.3+n2*0.3+n3*0.4;

      System.out.println("La nota final es: "+notaf);
      System.out.println("");
  }
}
