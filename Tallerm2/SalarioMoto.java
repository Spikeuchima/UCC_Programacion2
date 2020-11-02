import java.util.Scanner;
public class SalarioMoto {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    double salario,salarioneto,dias,valorhora,horast,horas,horasextra,horaslegal=48;
    String nombre,codigo;
    char otro;

    Scanner leer = new Scanner(System.in);

    do{
      System.out.print("Ingrese el nombre del trabajador: ");
      nombre= leer.next();
      System.out.print("Ingrese el codigo del trabajador: ");
      codigo= leer.next();
      System.out.print("Ingrese el valor de la hora trabajada: ");
      valorhora = leer.nextFloat();
      System.out.print("Ingrese las horas trabajadas: ");
      horast = leer.nextFloat();
      System.out.println("");

      horas=horast-horaslegal;

      if (horas>0) {
          System.out.println("Salario con extras");
          horasextra=horas*valorhora*0.20;
          salarioneto=horast*valorhora;
          salario=horasextra+salarioneto;

      } else {
          System.out.println("Salario sin extras");
          salario=horast*valorhora;

      }

      System.out.println("El salario del trabajador es: "+salario);
      System.out.println("");
      System.out.print("Desea continuar con otro trabajador? (S o N) ");
      otro = leer.next().charAt(0);
      System.out.println("");

    } while(otro=='s'||otro=='S');
  }
}
