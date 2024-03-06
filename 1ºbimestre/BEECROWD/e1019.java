import java.io.IOException;
import java.util.Scanner;

public class e1019 {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        int timeSeconds = 0;
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int i = 0;

        timeSeconds = sc.nextInt();

        hours = timeSeconds / 3600;
        minutes = (timeSeconds % 3600) / 60;
        seconds = (timeSeconds % 3600) % 60;
            
        System.out.print(hours + ":" + minutes + ":" + seconds);
    }
}