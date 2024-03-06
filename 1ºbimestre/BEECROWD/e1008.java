import java.io.IOException;
import java.util.Scanner;

public class e1008 {
 
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int horas = 0;
        double vHora = 0;
        double salario = 0;

        numero = scanner.nextInt();
        horas = scanner.nextInt();
        vHora = scanner.nextDouble();

        salario = horas * vHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", salario);
        System.out.println();

    }
}