import java.util.Scanner;
public class Muro {
  public static void main (String[] args){

    System.out.println("");
    System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

    int metagusano=0,metacaracol=0,metaciempies=0;

    do{
        metagusano+=2;
        metaciempies+=1;
        metacaracol+=1;

        } while(metagusano<10 && metacaracol<10 && metaciempies<10);

        if (metagusano==10) {
            System.out.println("El ganador es el Gusano");

        }   else if (metacaracol==10) {

            System.out.println("El ganador es el Caracol");
          }else{
              System.out.println("El ganador es el Ciempies");
          }
              System.out.println("");
  }
}
