import java.util.*;

class FindPen{

public static void main(String args[]){
/*Suppose you have to divide 14 pens among 3 students equally.
 Write a program to find how many pens each student will get if the pens must be divided equally. 
 Also, find the remaining non-distributed pens.

*/
int totalPens = 14;
int students = 3;

int studentPens= totalPens/students;
int remainingPens=totalPens%students;

System.out.println("The Pen Per Student is "+studentPens+" and the remaining pen not distributed is "+remainingPens
);


}
}