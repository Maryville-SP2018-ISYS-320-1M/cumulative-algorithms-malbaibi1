import java.util.Scanner;

/*
 ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018
*/

public class P5_CumulativeProduct {

 public static void main(String[] args) {
   
   Scanner input = new Scanner( System.in );
   System.out.print("How many numbers will you multiply? ");
   int n = input.nextInt();
   
   int sum = 1;
   for (int i = 1; i <= n; i++){
   System.out.print("Enter number "+i+": ");
   int n1 = input.nextInt();
   sum = sum * n1;
   }
   
   System.out.println("The final product is "+sum+". ");
  
 }

}