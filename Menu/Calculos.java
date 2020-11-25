import java.util.Scanner;
public class Calculos {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    float n1,n2,suma,resta,producto,promedio;

    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese el primer numero: ");
    n1 = leer.nextFloat();
    System.out.print("Ingrese el segundo numero: ");
    n2 = leer.nextFloat();
    System.out.println("");

    suma= n1+n2;
    resta= n1-n2;
    producto= n1*n2;
    promedio= (n1+n2)/2;

      System.out.println("El valor de la suma es: "+suma);
      System.out.println("El valor de la resta es: "+resta);
      System.out.println("El valor de la producto es: "+producto);
      System.out.println("El valor de la promedio es: "+promedio);
      System.out.println("");
  }
}
