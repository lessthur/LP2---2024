import java.io.IOException;
import java.util.Scanner;

public class e1020 {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        int days = 0;
        int yearsT = 0;
        int monthsT = 0;
        int daysT = 0;

        days = sc.nextInt();

        yearsT = days / 365;
        monthsT = (days % 365) / 30;
        daysT = (days % 365) % 30;

        System.out.println(yearsT + "");
        
    }
}