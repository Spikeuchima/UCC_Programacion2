import java.util.Scanner;
public class Digitadoras {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    int tiempo=30,paginas=15;
    double resultado;

    resultado=2*60/tiempo*paginas;
    System.out.println("El total de paginas digitadas en 2 horas son: "+resultado);
    System.out.println("");
    resultado=75/paginas*tiempo;
    System.out.println("Las 75 paginas se digitaran en: "+resultado+ " minutos");
    System.out.println("");
  }
}
