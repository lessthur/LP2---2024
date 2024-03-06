import java.io.IOException;
import java.util.Scanner;
 
public class e1001 {
 
    public static void main(String[] args) throws IOException {
        int A, B, X = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        A = scanner.nextInt();
        System.out.println("Digite um número inteiro: ");
        B = scanner.nextInt();

        X = A + B;
        System.out.println("X = " + X);
 
    }
 
}