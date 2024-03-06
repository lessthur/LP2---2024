import java.io.IOException;
import java.util.Scanner;

public class e1013 {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        int value1, value2, value3 = 0;

        int biggestValue = 0;

        value1 = sc.nextInt();
        value2 = sc.nextInt();
        value3 = sc.nextInt();

        biggestValue = (value1 + value2 + Math.abs(value1 - value2)) / 2;

        if(biggestValue > value3)
            biggestValue = biggestValue;
        else
            biggestValue = value3;

        System.out.println(biggestValue + " eh o maior");
    }
}