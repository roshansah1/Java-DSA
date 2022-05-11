import java.util.*;

public class Report {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter the marks of subject 1");
    int sub1 = sc.nextInt();

    System.out.println("Enter the marks of subject 2");
    int sub2 = sc.nextInt();

    System.out.println("Enter the marks of subject 3");
    int sub3 = sc.nextInt();

    System.out.println("Enter the marks of subject 4");
    int sub4 = sc.nextInt();

    if (sub1 <= 100 && sub2 <=100 && sub3 <= 100 && sub4 <= 100) {

        //Total

        int total = sub1 + sub2 + sub3 + sub4;

        System.out.println("Marks = " + total + "/400");

    
      //percentage

   float percent = (float) total / 400 * 100;
   System.out.println("Percentage = " + percent + "%");

   //Highest marks

   int max1 = Math.max(sub1, sub2);
   int max2 = Math.max(max1, sub3);
   int max3 = Math.max(max2, sub4);

   System.out.println("Highest Marks = " + max3);

   //Average

   float average = (float) total / 4;
   System.out.println("Average Marks = " + average);

    }
    } 
}
