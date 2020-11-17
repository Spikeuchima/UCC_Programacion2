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

    int numero,invertido=0,resto;
    char opc;

    Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese el numero a invertir: ");
    numero= leer.nextInt();

    do{
      resto= numero%10;
      invertido=invertido*10+resto;
      numero/=10;

    } while(numero>0);
    System.out.print("\nEl numero invertido es: "+invertido);
  }
}
