import java.util.Scanner;
public class Ejer02 {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M3                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    double carnet=0;
    int semestre;
    String nombre,plan;
    char opc;

    Scanner leer = new Scanner(System.in);

    do{
      System.out.print("Ingrese el nombre: ");
      nombre = leer.next();
      System.out.print("Ingrese el plan (economia,administracion,ciencias): ");
      plan= leer.next();
      System.out.print("Ingrese el semestre (entre 1 y 10) ");
      semestre = leer.nextInt();

      switch(plan){
        case "economia":
          if (semestre<=3) {
          carnet=1500;
          }
          else if (semestre<=7){
          carnet=2220;
            }
          else{
          carnet=3000;
        }
        break;
        case "administracion":
        if (semestre<=3) {
        carnet=2000;
        }
        else if (semestre<=7){
        carnet=4000;
          }
        else{
        carnet=6000;
      }
      break;
        case "ciencias":
        if (semestre<=3) {
        carnet=1800;
        }
        else if (semestre<=7){
        carnet=5000;
          }
        else{
        carnet=7000;
      }
      break;
          default:
          break;
      }

      System.out.println("\nEl valor a pagar por el estudiante es: "+carnet);
      System.out.print("\nDesea continuar con otro estudiante? (S o N): ");
      opc = leer.next().charAt(0);

    } while(opc=='s'||opc=='S');
  }
}
