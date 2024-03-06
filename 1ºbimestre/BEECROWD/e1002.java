import java.io.IOException;
import java.util.Scanner;

public class e1002 {
 
    public static void main(String[] args) throws IOException {
 
        double R, A = 0;
        final double n = 3.14159;
        
        Scanner scanner = new Scanner(System.in);

        R = scanner.nextDouble();
        A = n * (R * R);
        System.out.print("A=");
        System.out.printf("%.4f", A);
        System.out.println();
 
 
    }
 
}