import java.util.Scanner;
public class Calaveras {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    int pinta=0,nina=0,santa=0,meta=600;

        pinta=meta/9+meta/11;
        nina=meta/8+meta/12;
        santa=meta/10+meta/8;



          System.out.println("El tiempo de recorrido de la pinta es: "+pinta);
          System.out.println("El tiempo de recorrido de la santa es: "+santa);
          System.out.println("El tiempo de recorrido de la nina es: "+nina);
          System.out.println("");

          if(santa==pinta && santa==nina)
            System.out.println("Las tres embarcaciones llegan juntas");
          else
              System.out.println("Las tres embarcaciones no llegan juntas");
              System.out.println("");

  }
}
