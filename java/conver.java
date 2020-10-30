import java.util.Scanner;
public class conver
{
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una cifra: ");
        int cifra = leer.nextInt();
        System.out.print("\nbinario:\t");
        binario(cifra);
        System.out.print("\nHexadecimal:\t");
        hexadecimal(cifra);

    }
    //SE IMPLEMENTA UN METODO RECURSIVO PARA TRANSFORMARA A BINARIO LA CIFRA
    public static void binario(int N){
        if(N == 1) System.out.print("1");
        else{
            binario(N/2);
            System.out.print(N%2);
        }
    }
    //SE IMPLEMENTA UN METODO RECURSIVO PARA TRANSFORMARA A HEXADECIMAL LA CIFRA
    public static void hexadecimal(int N){
        if(N < 16){
            if(N == 10) System.out.print("A");
            if(N == 11) System.out.print("B");
            if(N == 12) System.out.print("C");
            if(N == 13) System.out.print("D");
            if(N == 14) System.out.print("E");
            if(N == 15) System.out.print("F");
            if(N < 10) System.out.print(N);
        }
        else{
            hexadecimal(N/16);
            System.out.print(N%16);
        }
    }
}
