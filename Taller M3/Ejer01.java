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

    double sueldo,aumento=0;
    int cate;
    String nombre;
    char opc;

    Scanner leer = new Scanner(System.in);

    do{
      System.out.print("Ingrese el nombre: ");
      nombre = leer.next();
      System.out.print("Ingrese el sueldo: ");
      sueldo= leer.nextFloat();
      System.out.print("Ingrese la categoria: (1,2,3,4) ");
      cate = leer.nextInt();

      switch(cate){
        case 1:
          aumento=1.15;
          break;
        case 2:
          aumento=1.1;
          break;
        case 3:
          aumento=1.08;
          break;
        case 4:
          aumento=1.07;
          break;
        default:
          aumento=1;
          break;

      }
      sueldo*=aumento;
      System.out.println("\nEl salario del trabajador es: "+sueldo);
      System.out.print("\nDesea continuar con otro trabajador? (S o N): ");
      opc = leer.next().charAt(0);


    } while(opc=='s'||opc=='S');

  }
}
