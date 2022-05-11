
import java.util.*;

public class Hour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int hour = sc.nextInt();
        if (hour < 12) {
            System.out.println("Good morning");
}
        else if (hour <= 16) {
            System.out.println("Good afternoon");
}
         else if (hour <= 20) {
            System.out.println("Good evening");
    }
        else {
            System.out.println("Good night");
        }
}
}