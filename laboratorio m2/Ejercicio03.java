import java.util.Scanner;
public class Ejercicio03 {
  public static void main (String[] args){
    int l1,l2;
    boolean bool1=false,bool2=false,k;

    Scanner leer = new Scanner(System.in);

    System.out.print("¿La tierra es redonda [0]...Falso [1]...Verdad? ");
    l1 = leer.nextInt();
    System.out.print("¿Simon Bolivar liberto Panama [0]...Falso [1]...Verdad? ");
    l2 = leer.nextInt();

    if (l1!=0) bool1=true;
    if (l2!=0) bool2=true;

    k= bool1 && bool2;

      System.out.print("El valor de la variable k es: "+k);
  }
}
