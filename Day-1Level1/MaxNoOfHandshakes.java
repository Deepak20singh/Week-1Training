import java.util.*;


class MaxNoOfHandshakes{


public static void main(String args[]){
	/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.

*/
int numberOfStudents;


Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of students :- ");
numberOfStudents=sc.nextInt();

int maxNumberOfHandshakes=(numberOfStudents * (numberOfStudents - 1)) / 2 ;



System.out.println("the maximum number of handshakes among"+numberOfStudents+" number of students is "+maxNumberOfHandshakes);
}
}
