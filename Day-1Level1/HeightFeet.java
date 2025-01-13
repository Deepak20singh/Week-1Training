import java.util.*;


class HeightFeet{


public static void main(String args[]){
	/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

*/
int height;


Scanner sc=new Scanner(System.in);
System.out.print("Enter the Height(cm) :- ");
height=sc.nextInt();
System.out.println();
double feet = 12;     //1 feet =12 inches
double inches=2.54 ;   //1 inch = 2.54 centimeter
int heightInFeet=height/(int)(feet*inches);
double heightInInches=(height%(double)(feet*inches))/inches;


System.out.println("Your Height in cm is "+ height +" while in feet is "+ heightInFeet +" and inches is "+(int)(heightInInches)
);
}
}