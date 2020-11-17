import java.util.Scanner;
public class Ejer07 {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M3                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    int num,primo=0;

    Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese un numero: ");
    num= leer.nextInt();
    if (num<=3 && num>=0){
      System.out.print("\nEl numero es primo ");
      return;
    }

    if (num%2==0) {
      System.out.print("\nEl numero no es primo ");
      return;
    }
    for(int i=3;i<num;i+=2) {
        if(num%i==0){
          System.out.print("\nEl numero no es primo ");
          return;
        }
    }

      System.out.print("\nEl numero es primo ");
  }
}
