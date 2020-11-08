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

    double pasaje=0,utilidad=0,mantenimiento=0,salario=0;
    int ruta,servicio;
    char opc;

    Scanner leer = new Scanner(System.in);

    do{
      System.out.print("\n1-Servicio Corriente ");
      System.out.print("\n2-Servicio Ejecutivo ");
      System.out.print("\nIngrese el tipo de servicio: ");
      servicio= leer.nextInt();
      System.out.print("Ingrese la ruta (1,2,3,4): ");
      ruta = leer.nextInt();


      switch(ruta){
        case 1:
          if (servicio==1) {
            pasaje=200;
            salario=pasaje*0.3;
            mantenimiento=pasaje*0.1;
          }
          else{
            pasaje=300;
            salario=pasaje*0.3;
            mantenimiento=pasaje*0.1;
        }
        break;
        case 2:
          if (servicio==1) {
            pasaje=200;
            salario=pasaje*0.25;
            mantenimiento=pasaje*0.15;
          }
          else{
            pasaje=300;
            salario=pasaje*0.25;
            mantenimiento=pasaje*0.15;
        }
        break;
        case 3:
          if (servicio==1) {
            pasaje=200;
            salario=pasaje*0.20;
            mantenimiento=pasaje*0.20;
          }
          else{
            pasaje=300;
            salario=pasaje*0.20;
            mantenimiento=pasaje*0.20;
        }
        break;
        case 4:
          if (servicio==1) {
            pasaje=200;
            salario=pasaje*0.22;
            mantenimiento=pasaje*0.20;
          }
          else{
            pasaje=300;
            salario=pasaje*0.22;
            mantenimiento=pasaje*0.20;
        }
        break;
          default:
          break;
      }
      utilidad=pasaje-mantenimiento-salario;

      System.out.println("\nLa utilidad final es: "+utilidad);
      System.out.print("\nDesea continuar con otro cliente? (S o N): ");
      opc = leer.next().charAt(0);

    } while(opc=='s'||opc=='S');
  }
}
