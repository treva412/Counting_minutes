package vu.counting_minutes;
import java.util.Scanner;
public class Counting_Minutes {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int totalSeconds = scanner.nextInt();
        scanner.close();

        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        System.out.println(minutes + " minute(s) and " + remainingSeconds + " second(s)");
    }
}
    
    

