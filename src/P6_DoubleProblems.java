/*
 ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018
*/
/*
  Error:
  The decimal places are not equal which causes an error.

*/

public class P6_DoubleProblems {

 public static void main(String[] args) {
  double gpa = 3.2;
  if( Math.round(gpa * 3) == Math.round(9.6) ) {
   System.out.println( "You earned enough credts");
  }
 }

}