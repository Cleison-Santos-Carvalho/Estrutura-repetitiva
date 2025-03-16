/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para
cada leitura de senha incorreta informada, escrever a mensagem "Senha inválida". Qunado
a senha for informada corretamente deve ser impressa a mensagem "Acesso permitido" e o algoritimo
encerrado. Considere que a senha correta é o valor 2002 (valor literal).
*/
import java.util.Scanner;

public class ValidacaoSenha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 2002;

        System.out.print("Digie uma senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida!");
            System.out.print("Digite novamente a senha: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido!");
        
    }
}