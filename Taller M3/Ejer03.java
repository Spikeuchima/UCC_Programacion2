import java.util.Scanner;
public class Ejer03 {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M3                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    double costo=0,costototal=0;
    String ubicacion;
    int minutos,tamano;
    char opc;

    Scanner leer = new Scanner(System.in);

    do{
      System.out.print("Ingrese la ubicacion (norte,sur,oriente,occidente): ");
      ubicacion = leer.next();
      System.out.print("Ingrese el size (1-chico,2-mediano,3-grande): ");
      tamano= leer.nextInt();
      System.out.print("Ingrese la cantidad de minutos: ");
      minutos = leer.nextInt();

      switch(ubicacion){
        case "norte":
          if (tamano==1) {
          costo=500;
          }
          else if (tamano==2){
          costo=250;
            }
          else{
          costo=100;
        }
        break;
        case "sur":
          if (tamano==1) {
          costo=400;
          }
          else if (tamano==2){
          costo=200;
            }
          else{
          costo=200;
        }
        break;
        case "oriente":
          if (tamano==3) {
          costo=100;
          }
          else{
          costo=100;
        }
        break;
        case "occidente":
          if (tamano==1) {
          costo=300;
          }
          else if (tamano==3){
          costo=200;
            }
          else{
          costo=200;
        }
        break;
      }
      costototal=costo*minutos;

      System.out.println("\nEl valor a pagar es: "+costototal);
      System.out.print("\nDesea continuar con otro cliente? (S o N): ");
      opc = leer.next().charAt(0);
    } while(opc=='s'||opc=='S');
  }
}
