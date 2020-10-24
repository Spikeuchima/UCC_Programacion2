public class  ProgramaArgumentos04 {
  public static void main(String[] args) {
    System.out.println(" ******************************* ");
	System.out.println(" *  Autor: Luisa Palau         * ");
	System.out.println(" *  Date: October 17st of 2020 * ");
	System.out.println(" ******************************* ");
	System.out.println(" *  Programa Argumentos 01     * ");
	System.out.println(" *    Division de Enteros      * ");
	System.out.println(" ******************************* ");
	System.out.println();
	
	System.out.println("argumento 1 = "+args[0]);
	System.out.println("argumento 2 = "+args[1]);
	
	int num1 = Integer.parseInt(args[0]);
	int num2 = Integer.parseInt(args[1]);
	int resultadoDivision = num1 / num2;
	
	System.out.println("Operacion / Matematica: num1 = "+num1+", num2 = "+num2);
	System.out.println("Division num1  num2 = "+resultadoDivision);
  
  }
}