import java.util.Scanner;

public class PreferenciaProduto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("1 - Álcool\n2 - Gasolina\n3 - Diesel\n4 - Fim\n");
        System.out.print("Informe o código do produto ou se desejar sair: ");
        int codigo = sc.nextInt();

        int TotalAlcool = 0;
        int TotalGasolina = 0;
        int TotalDiesel = 0;
        String tipoCombustivel = "";

        while (codigo != 4) {      
            
            switch (codigo) {
                
                case 1:
                    TotalAlcool += 1;
                    tipoCombustivel = "Alcool";
                    System.out.print("Digite outro código: ");
                    codigo = sc.nextInt();
                    break;
                case 2:
                    TotalGasolina += 1;
                    tipoCombustivel = "Gasolina";
                    System.out.print("Digite outro código: ");
                    codigo = sc.nextInt();
                    break;
                case 3:
                    TotalDiesel += 1;
                    tipoCombustivel = "Diesel";
                    System.out.print("Digite outro código: ");
                    codigo = sc.nextInt();
                    break;
                default:
                    System.out.print("Código invalido! Digite outro código: ");
                    codigo = sc.nextInt();
            }     

        }
        System.out.println("Muito obrigado!");
        System.out.println("Alcool = " + TotalAlcool);
        System.out.println("Gasolina = " + TotalGasolina);
        System.out.println("Diesel = " + TotalDiesel);
        
        

    }
}