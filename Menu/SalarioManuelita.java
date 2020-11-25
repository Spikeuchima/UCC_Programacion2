import java.util.Scanner;
public class SalarioManuelita {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    double salario,valorhora,horast;
    String nombre;
    char otro;

    Scanner leer = new Scanner(System.in);

    do{
      System.out.print("Ingrese el nombre del trabajador: ");
      nombre= leer.next();
      System.out.print("Ingrese el valor de la hora: ");
      valorhora = leer.nextFloat();
      System.out.print("Ingrese las horas trabajadas: ");
      horast = leer.nextFloat();
      System.out.println("");

      salario=valorhora*horast;

      System.out.println("El salario del trabajador es: "+salario);
      System.out.println("");
      System.out.print("Desea continuar con otro trabajador? (S o N) ");
      otro = leer.next().charAt(0);
      System.out.println("");

    } while(otro=='s'||otro=='S');
  }
}
