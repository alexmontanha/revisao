import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o salário bruto!");
        double salario_bruto;
        double salario_liquido;

        Scanner teclado = new Scanner(System.in);
        salario_bruto = teclado.nextDouble();
        teclado.close();
        
        if (salario_bruto > 2500) {
            salario_liquido = salario_bruto * 0.75;
        } else {
            salario_liquido = salario_bruto;          
        }

        System.out.println("Salário Bruto");
        System.out.println(salario_bruto);

        System.out.println("Salário Líquido");
        System.out.println(salario_liquido);

    }
}
