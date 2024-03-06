import java.io.IOException;
import java.util.Scanner;

public class e1010 {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        double payingValue = 0; 

        int code1 = sc.nextInt();
        int number1 = sc.nextInt();
        double value1 = sc.nextDouble();
        
        int code2 = sc.nextInt();
        int number2 = sc.nextInt();
        double value2 = sc.nextDouble();

        payingValue = (number1 * value1) + (number2 * value2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", payingValue);

    }
}