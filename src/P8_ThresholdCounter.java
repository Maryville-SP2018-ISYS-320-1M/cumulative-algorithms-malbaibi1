import java.util.Scanner;


/*
 ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

public class P8_ThresholdCounter {

 public static void main(String[] args) {
   
   Scanner input = new Scanner( System.in );
   System.out.print("How many numbers are in the series? ");
   int n = input.nextInt();
   System.out.print("What is the threshold? ");
   int t = input.nextInt();
   
   int sum = 0;
   for (int i = 1; i <= n; i++){
   System.out.print("Enter number "+i+": ");
   int n1 = input.nextInt();
   if (n1 > n)
     sum = sum + 1;
   }
   
   System.out.println("The count of numbers above the threshold is "+sum+". ");

 }

}