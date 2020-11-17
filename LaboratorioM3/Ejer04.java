import java.util.Scanner;
public class Ejer04 {
    public static void main(String[] args) {

      System.out.println("");
      System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
      System.out.println("   Nombre:Oscar Alfredo Uchima        ");
      System.out.println("      Ingenieria de Sistemas          ");
      System.out.println("             Taller M3                ");
      System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
      System.out.println("");

        int N, aux, inverso = 0, cifra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero mayor o igual a 10: ");
            N = sc.nextInt();
        } while (N < 10);


        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if(N == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}
