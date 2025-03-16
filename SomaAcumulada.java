/*
Fazer um programa que lê números inteiros até que um zero seja lido. Ao final
mostrar a soma dos números lidos.
*/
import java.util.Scanner;

public class SomaAcumulada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }
        System.out.print(soma);
    }
}