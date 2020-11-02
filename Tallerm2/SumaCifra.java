import java.util.Scanner;

public class SumaCifra {
	public static void main(String[] args){

    System.out.println("");
		System.out.println("*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/*-*/");
    System.out.println("   Nombre:Oscar Alfredo Uchima        ");
    System.out.println("      Ingenieria de Sistemas          ");
    System.out.println("             Taller M2                ");
    System.out.println("#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/#_#/");
    System.out.println("");

		String cifra, digito;
		int l, total=0, digitoValor;
        Scanner sc = new Scanner(System. in);

		System.out.print("Ingrese un numero de 4 o mas digitos : ");
		cifra = sc.nextLine();
    System.out.println("");

		l=cifra.length();
		for(int i=0; i<l; i++){
			digito = cifra.charAt(i) + ""; //Char convertido a string
			digitoValor = Integer.parseInt(digito); // Esta función espera un string
			total += digitoValor;
		}

		System.out.print("Suma total " + total);
    System.out.println("");
	}
}
