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

    int numero,invertido=0,resto=0,mayor=0;

    Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese un numero: ");
    numero= leer.nextInt();

    do{
      resto= numero%10;
      invertido=invertido*10+resto;
      numero/=10;
      if (resto>mayor)
        mayor=resto;

    } while(numero>0);

      System.out.print("\nEl digito mayor es: "+mayor);
  }
}
