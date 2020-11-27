import java.util.Scanner;
public class primos {
public static void main (String[] args){
  int desde = 2;
  int hasta = 1000;
  boolean esPrimo;
        System.out.println("");
        System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
        System.out.println("   Nombre:Oscar Alfredo Uchima        ");
        System.out.println("      Ingenieria de Sistemas          ");
        System.out.println("             Taller M2                ");
        System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
        System.out.println("");

        Scanner leer = new Scanner(System.in);
        for (int i = desde; i <= hasta; i++) {
            esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i) && esPrimo; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.println(i);
            }
        }
      }
      }
