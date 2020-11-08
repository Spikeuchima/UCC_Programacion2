import java.util.Scanner;
public class Ejer06 {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M3                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    double cargo=0,costototal=0,costodiag=0;
    int diagnostico,tipo;
    char opc;

    Scanner leer = new Scanner(System.in);

    System.out.print("\n1-Mazda cargo 5000");
    System.out.print("\n2-Renault cargo 3000");
    System.out.print("\n3-Chevrolet cargo 2500");
    System.out.print("\n4-Fiat cargo 2000");
    System.out.print("\n5-Dodge cargo 2200");
    System.out.print("\n6-Otros cargo 1700");
    System.out.print("\nEscoja el tipo de carro:");
    tipo = leer.nextInt();
    switch(tipo){
    case 1:
      cargo=5000;
      break;
    case 2:
      cargo=3000;
      break;
    case 3:
      cargo=2500;
      break;
    case 4:
      cargo=2000;
      break;
    case 5:
      cargo=2200;
      break;
    case 6:
      cargo=1700;
      break;
    }
    do{

      System.out.print("\n1-Cambio de Aceite 3500");
      System.out.print("\n2-Alineacion y Balanceo 2800");
      System.out.print("\n3-Engrase 1950");
      System.out.print("\n4-Cambio de Filtro 2750");
      System.out.print("\n5-Lavado 3000");
      System.out.print("\n6-Otros 1600");
      System.out.print("\nIngrese el diagnostico: ");
      diagnostico = leer.nextInt();

      switch(diagnostico){
        case 1:
          costodiag+=3500;
          break;
        case 2:
          costodiag+=2800;
          break;
        case 3:
          costodiag+=1950;
          break;
        case 4:
          costodiag+=2750;
          break;
        case 5:
          costodiag+=3000;
          break;
        case 6:
          costodiag+=1600;
          break;
      }
      costototal=cargo+costodiag;

      System.out.println("\nEl valor a pagar es: "+costototal);
      System.out.print("\nDesea continuar con otro diagnostico? (S o N): ");
      opc = leer.next().charAt(0);


    } while(opc=='s'||opc=='S');
  }
}
