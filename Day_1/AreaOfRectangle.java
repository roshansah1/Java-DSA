import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Width");
        int a = sc.nextInt();

        System.out.println("Enter the Length");
        int b = sc.nextInt();

        int areaOfRectangle = a * b;
        System.out.println("The Area of Rectangle : " + areaOfRectangle);

    }
}
