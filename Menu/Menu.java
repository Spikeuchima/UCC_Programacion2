import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
public class Menu {
public static void main(String[] args) {

  System.out.println("");
  System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
  System.out.println("        Nombre:Oscar Alfredo Uchima     ");
  System.out.println("           Ingenieria de Sistemas       ");
  System.out.println("             Menu Programas             ");
  System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
  System.out.println("");

  int opcion;
  char otro;
  String comando="",ruta="E:\\Menu\\";

Scanner leer = new Scanner(System.in);

do{
    System.out.println("Listado de Programas a Ejecutar");
    System.out.println("1. Programa de Produccion de Aceite");
    System.out.println("2. Programa de Embarcaciones ");
    System.out.println("3. Programa de Calculos Matematicos");
    System.out.println("4. Programa de Cubo de un numero");
    System.out.println("5. Programa de Digitadoras");
    System.out.println("6. Programa de Escalar Muro");
    System.out.println("7. Programa de Notas");
    System.out.println("8. Programa de Salario");
    System.out.println("9. Programa de Salario Manuelita");
    System.out.println("10. Programa de Salario de Motos");
    System.out.println("11. Programa de Salario Pollos");
    System.out.println("12. Programa de Suma de Cifra");
    System.out.println("13. Programa de Corte de Tela");
    System.out.println("14. Programa de Valor Absoluto");
    System.out.println("15. Programa de Venta y Cambio");
    System.out.print("Digite la opcion a elegir:  ");
    opcion=leer.nextInt();

    switch (opcion){
      case 1:
        comando="Aceite";
        break;
      case 2:
        comando="Calaveras";
        break;
      case 3:
        comando="Calculos";
        break;
      case 4:
        comando="Cubo";
        break;
      case 5:
        comando="Digitadoras";
        break;
      case 6:
        comando="Muro";
        break;
      case 7:
        comando="Notas";
        break;
      case 8:
        comando="Salario";
        break;
      case 9:
        comando="SalarioManuelita";
        break;
      case 10:
        comando="SalarioMoto";
        break;
      case 11:
        comando="SalarioPollos";
        break;
      case 12:
        comando="SumaCifra";
        break;
      case 13:
        comando="Telas";
        break;
      case 14:
        comando="ValorAbs";
        break;
      case 15:
        comando="Cambio";
        break;
    }

    try
    {
        var processBuilder = new ProcessBuilder();
        processBuilder.command("java ","E:\\Menu\\"+comando+".java");
        var process = processBuilder.inheritIO().start();
        var ret = process.waitFor();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
      System.out.print("Desea continuar con otro programa? (S o N) ");
      otro = leer.next().charAt(0);
    } while(otro=='s'||otro=='S');
  }
}
