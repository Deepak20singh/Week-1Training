import java.util.*;


class FeetMiles{


public static void main(String args[]){
	/*Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ ___

*/
int distanceInFeet;


Scanner sc=new Scanner(System.in);
System.out.print("Enter the distance in feet :- ");
distanceInFeet=sc.nextInt();
System.out.println();
int mile = 1760 ; //1 mile = 1760 yards 
int yard = 3 ;  //1 yard is 3 feet
double distanceInYard=distanceInFeet/yard;
double distanceInMiles=(double)(distanceInFeet)/(double)(5280); //1 mile= 5280 feet




System.out.println("the distance in yards is "+distanceInYard +" while in feet is "+ distanceInFeet +" and in miles is "+distanceInMiles
);
}
}