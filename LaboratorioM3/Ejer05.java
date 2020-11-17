import java.util.Scanner;
public class Ejer05 {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M3                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    int numero,digito,invertido=0,resto,existe=0;

    Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese un numero: ");
    numero= leer.nextInt();
    System.out.print("Ingrese un digito: ");
    digito= leer.nextInt();

    do{
      resto= numero%10;
      invertido=invertido*10+resto;
      numero/=10;
      if (digito==resto)
        existe=1;

    } while(numero>0 && existe==0);
    if (existe==1)
      System.out.print("\nEl digito existe");
    else
      System.out.print("\nEl digito no existe");
  }
}
