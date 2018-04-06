import java.util.Scanner;


/*
 ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

public class MoreOddsOrEvens {

 public static void main(String[] args) {
   
   Scanner input = new Scanner( System.in );
   System.out.print("How many numbers will you input? ");
   int n = input.nextInt();
   
   int even = 0;
   int odd = 0;
   for (int i = 1; i <= n; i++){
   System.out.print("Enter number "+i+": ");
   int n1 = input.nextInt();
   if (n1 % 2 == 0)
     even = even + 1;
   else
     odd = odd + 1;
   }
   
   if (even > odd)
   System.out.println("You entered in more even numbers than odd numbers.");
   else
   System.out.println("You entered in more odd numbers than even numbers.");

 }

}