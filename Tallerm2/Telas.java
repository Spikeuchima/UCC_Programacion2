public class Telas {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    int longitud=12,tramo=2,dias=0,resTela;

    resTela=longitud;
    while(resTela>tramo){
      resTela-=tramo;
      dias+=1;
    }

      System.out.println("La cantidad de dias son: "+dias);
      System.out.println("");
  }
}
