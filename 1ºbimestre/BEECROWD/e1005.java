import java.io.IOException;
import java.util.Scanner;

public class e1005 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);

        double A, B, MEDIA = 0;

        A = scanner.nextDouble();
        B= scanner.nextDouble();

        MEDIA = (A * 3.5 + B * 7.5)/11;

        System.out.printf("MEDIA = %.5f", MEDIA);
        System.out.println();
    }
 
}