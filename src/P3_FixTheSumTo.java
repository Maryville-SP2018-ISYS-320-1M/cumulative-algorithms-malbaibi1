/*
 ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018
*/

/*
3. What problems did you identify in the sumTo method below?
   1. no return statement in method sumTo.
   2. Not an accurate initialization of sum.
*/

public class P3_FixTheSumTo {

 public static void main(String[] args) {
  int totalSum = sumTo( 5 );
  System.out.println("The total sum is: " + totalSum );

 }
 
 public static int sumTo(int n) { 
     int sum = 0; 
     for (int i = 1; i <= n; i++) {
         sum += i;
     }
     return sum;
 }

}