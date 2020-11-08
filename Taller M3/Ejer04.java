import java.util.Scanner;
public class Ejer04 {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M3                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    double valor_factura=0,precio=0,iva=0;
    int cantidad;
    String tipo;
    char opc;

    Scanner leer = new Scanner(System.in);

    do{
      System.out.print("Ingrese el tipo de producto (a,b,c): ");
      tipo = leer.next();
      System.out.print("Ingrese el numero de unidades: ");
      cantidad= leer.nextInt();

      switch(tipo){
        case "a":
          if (cantidad<501) {
          precio=500;
          iva=(precio*cantidad)*0.07;
          }
          else{
          precio=1000;
          iva=(precio*cantidad)*0.09;
        }
        break;
        case "b":
          if (cantidad<501) {
          precio=800;
          iva=(precio*cantidad)*0.08;
          }
          else{
          precio=1400;
          iva=(precio*cantidad)*0.11;
        }
        break;
        case "c":
          if (cantidad<501) {
          precio=1000;
          iva=(precio*cantidad)*0.05;
          }
          else{
          precio=1600;
          iva=(precio*cantidad)*0.1;
        }
        break;
          default:
          break;
      }
      valor_factura=cantidad*precio+iva;

      System.out.println("\nEl valor a pagar es: "+valor_factura);
      System.out.print("\nDesea continuar con otro cliente? (S o N): ");
      opc = leer.next().charAt(0);

    } while(opc=='s'||opc=='S');
  }
}
